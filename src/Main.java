import database.DatabaseService;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {


        Scanner scanner= new Scanner(System.in);


        Connection connection = DatabaseService.createConnection();

        textZaIzbor();

        int odabir;
        odabir= scanner.nextInt();

        while (odabir < 6) {
            switch (odabir) {
                case 1:
                    unosNovogPolaznika(connection);

                    break;

                case 2:
                    unosNovogProgramaObrazovanja(connection);

                    break;

                case 3:
                    upisPolaznikaNaProgramObrazovanja(connection);

                    break;

                case 4:
                    prebacivanjePolaznikaIzProgramaUProgram(connection);

                    break;

                case 5:
                    ispisInformacijaOPolaznicimaUOdredenomProgramu(connection);

                    break;


            }

            textZaIzbor();
            odabir = scanner.nextInt();

        }










        connection.close();
    }


    private static void textZaIzbor() {
        System.out.println("\n" +"Odaberite jednu od sljedečih opcija: " + "\n" +
                "(1) za unos novog polaznika" + "\n" +
                "(2) za unos novog programa obrazovanja" + "\n" +
                "(3) za upis polaznika na program obrazovanja" + "\n" +
                "(4) za prebacivanje polaznika iz jednog u drugi program obrazovanja" + "\n" +
                "(5) za ispis informacija za određeni program obrazovanja" + "\n" +
                "(6) za izlaz");
    }


    private static void unosNovogPolaznika (Connection connection) throws SQLException {

        Scanner scanner= new Scanner(System.in);

        connection.setAutoCommit(false);

        System.out.println("Unesite ime novog polaznika: ");
        String ime= scanner.next();
        System.out.println("Unesite prezime novog polaznika: ");
        String prezime= scanner.next();

        String query = "EXEC UnosNovogPolaznika @Ime= ?,@Prezime= ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,ime);
        preparedStatement.setString(2,prezime);
        preparedStatement.executeUpdate();


        preparedStatement.close();
        connection.commit();

    }

    private static void unosNovogProgramaObrazovanja (Connection connection) throws SQLException {

        Scanner scanner= new Scanner(System.in);

        connection.setAutoCommit(false);

        System.out.println("Unesite naziv novog programa: ");
        String naziv= scanner.next();
        System.out.println("Unesite CSVET broj: ");
        int csvet= scanner.nextInt();

        String query = "INSERT INTO ProgramObrazovanja (Naziv,CSVET) VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,naziv);
        preparedStatement.setInt(2,csvet);
        preparedStatement.executeUpdate();


        preparedStatement.close();
        connection.commit();
    }

    private static void upisPolaznikaNaProgramObrazovanja (Connection connection) throws SQLException {

        Scanner scanner= new Scanner(System.in);

        connection.setAutoCommit(false);

        ispisSvihPolaznika(connection);
        System.out.println("Odaberite ID polaznika kojeg želite upisati: ");
        int idPolaznika= scanner.nextInt();

        ispisSvihProgramaObrazovanja(connection);
        System.out.println("Odaberite ID programa u koji želite upisati polaznika: ");
        int idProgramaObrazovanja= scanner.nextInt();

        String query = "INSERT INTO Upis (IDPolaznik,IDProgramObrazovanja) VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,idPolaznika);
        preparedStatement.setInt(2,idProgramaObrazovanja);
        preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.commit();
    }

    private static void prebacivanjePolaznikaIzProgramaUProgram (Connection connection) throws SQLException {

        Scanner scanner= new Scanner(System.in);

        connection.setAutoCommit(false);

        ispisSvihPolaznika(connection);
        System.out.println("Unesite ID polaznika kojem želite promjeniti program: ");
        int idPolaznika= scanner.nextInt();

        ispisSvihProgramaObrazovanja(connection);
        System.out.println("Unesite ID programa iz kojeg želite ISPISATI polaznika: ");
        int idProgramaZaIspis= scanner.nextInt();

        ispisSvihProgramaObrazovanja(connection);
        System.out.println("Unesite ID programa u koji želite UPISATI polaznika: ");
        int idProgramaZaUpis= scanner.nextInt();


        String query = "UPDATE Upis SET IDProgramObrazovanja= ? WHERE IDPolaznik = ? AND IDProgramObrazovanja= ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,idProgramaZaUpis);
        preparedStatement.setInt(2,idPolaznika);
        preparedStatement.setInt(3,idProgramaZaIspis);
        preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.commit();

    }


    private static void ispisInformacijaOPolaznicimaUOdredenomProgramu (Connection connection) throws SQLException {

        Scanner scanner= new Scanner(System.in);

        connection.setAutoCommit(false);

        ispisSvihProgramaObrazovanja(connection);
        System.out.println("Unesite ID od programa za koji želite ispis informacija: ");
        int idProgramaObrazovanja= scanner.nextInt();

        String query = "SELECT p.Ime+' '+p.Prezime AS Polaznik, po.Naziv AS ProgramObrazovanja, po.CSVET AS CSVET FROM Upis AS u LEFT JOIN Polaznik AS p ON p.PolaznikID= u.IDPolaznik LEFT JOIN ProgramObrazovanja AS po ON po.ProgramObrazovanjaID = u.IDProgramObrazovanja WHERE u.IDProgramObrazovanja = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,idProgramaObrazovanja);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Ime i prezime Polaznika: "+resultSet.getString("Polaznik"));
            System.out.println("Naziv programa: "+ resultSet.getString("ProgramObrazovanja"));
            System.out.println("Broj CSVET bodova: "+ resultSet.getInt("CSVET"));
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("------------------------------------------------------------------------------");

        }

        resultSet.close();
        preparedStatement.close();

        connection.commit();


    }








    private static void ispisSvihPolaznika (Connection connection) throws SQLException {

        String query = "SELECT * FROM Polaznik";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        System.out.println("POLAZNICI SU: ");

        while (resultSet.next()) {

            System.out.println("ID: "+resultSet.getInt("PolaznikID")+" ---- "+ "Polaznik: "+resultSet.getString("Ime")+" "+resultSet.getString("Prezime"));

        }

        resultSet.close();
        statement.close();

    }

    private static void ispisSvihProgramaObrazovanja (Connection connection) throws SQLException {

        String query = "SELECT * FROM ProgramObrazovanja";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        System.out.println("PROGRAMI SU: ");

        while (resultSet.next()) {

            System.out.println("ID: "+resultSet.getInt("ProgramObrazovanjaID")+" ----  "+"Naziv: "+resultSet.getString("Naziv")+" ----  "+"CSVET: "+resultSet.getInt("CSVET"));
        }

        resultSet.close();
        statement.close();

    }

}



