import database.DatabaseService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {


        Scanner scanner= new Scanner(System.in);


        Connection connection = DatabaseService.createConnection();

        textZaIzbor();

        int odabir;
        odabir= scanner.nextInt();

        while (odabir < 9) {
            switch (odabir) {
                case 1:
                    unosNovogUcenika(connection);

                    break;

                case 2:
                    unosNovogRazreda(connection);

                    break;

                case 3:
                    unosNovogNastavnika(connection);

                    break;

                case 4:
                    pretragaRazredaPoNazivu(connection);

                    break;

                case 5:
                    prebacivanjeUcenikaUDrugiRazred(connection);

                    break;

                case 6:
                    ispisSvihUcenikaIzOdredenogRazreda(connection);

                    break;

                case 7:
                    brisanjeUcenika(connection);

                    break;

                case 8:
                    updateImenaIPrezimenaNastavnikaPoID(connection);

                    break;


            }

            textZaIzbor();
            odabir = scanner.nextInt();

        }










        connection.close();
    }


    private static void textZaIzbor() {
        System.out.println("\n" +"Odaberite jednu od sljedečih opcija: " + "\n" +
                "(1) za unos novog učenika" + "\n" +
                "(2) za unos novog razreda" + "\n" +
                "(3) za unos novog nastavnika" + "\n" +
                "(4) za pretragu razreda po nazivu" + "\n" +
                "(5) za prijenos učenika u drugi razred" + "\n" +
                "(6) za ispis svih učenika iz određenog razreda" + "\n" +
                "(7) za brisanje ucenika po id-u" + "\n" +
                "(8) za izmjenu imena i prezimena nastavnika" + "\n" +
                "(9) za izlaz");
    }



    private static void updateImenaIPrezimenaNastavnikaPoID (Connection connection) throws SQLException {

        Scanner scanner= new Scanner(System.in);

        connection.setAutoCommit(false);

        ispisSvihNastavnika(connection);

        System.out.println("Unesite ID nastavnika kojem želite promjenit podatke: ");
        int idNastavnika = scanner.nextInt();
        System.out.println("Unesite novo ime nastavnika:");
        String novoIme= scanner.next();
        System.out.println("Unesite novo prezime nastavnika:");
        String novoPrezime= scanner.next();

        String query = "UPDATE Nastavnik SET Ime=?, Prezime=? WHERE IdNastavnik=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,novoIme);
        preparedStatement.setString(2,novoPrezime);
        preparedStatement.setInt(3,idNastavnika);
        preparedStatement.executeQuery();


        preparedStatement.close();

        connection.commit();


    }



    private static void brisanjeUcenika (Connection connection) throws SQLException {
        Scanner scanner= new Scanner(System.in);

        connection.setAutoCommit(false);

        ispisSvihUcenika(connection);

        System.out.println("Odaberite ID ucenika kojeg želite obrisati: ");
        int idUcenikaZaBrisanje = scanner.nextInt();

        String query = "DELETE FROM Ucenik WHERE IdUcenik= ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,idUcenikaZaBrisanje);
        preparedStatement.executeQuery();


        preparedStatement.close();

        connection.commit();

    }


    private static void ispisSvihUcenikaIzOdredenogRazreda (Connection connection) throws SQLException {


        Scanner scanner= new Scanner(System.in);

        connection.setAutoCommit(false);

        ispisSvihRazreda(connection);

        System.out.println("Unesite ID razreda: ");
        int razredID = scanner.nextInt();

        String query = "SELECT * FROM Razred AS r LEFT JOIN Ucenik AS u ON u.RazredId = r.IdRazred LEFT JOIN Nastavnik AS n ON n.IdNastavnik= r.NastavnikId WHERE r.IdRazred = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,razredID);
        preparedStatement.executeQuery();


        ResultSet resultSet = preparedStatement.executeQuery(query);
        while (resultSet.next()) {
            System.out.println("Ime ucenika: "+resultSet.getString("u.Ime")+" "+resultSet.getString("u.Prezime"));
            System.out.println("Naziv razreda: " + resultSet.getString("r.Naziv"));
            System.out.println("Ime nastavnika: "+resultSet.getString("n.Ime")+" "+resultSet.getString("n.Prezime"));
        }

        resultSet.close();
        preparedStatement.close();

        connection.commit();

    }



    private static void prebacivanjeUcenikaUDrugiRazred (Connection connection) throws SQLException {

        Scanner scanner= new Scanner(System.in);

        connection.setAutoCommit(false);

        ispisSvihUcenika(connection);

        System.out.println("Unesite ID učenika kojeg želite prebacit: ");
        int idUcenika= scanner.nextInt();
        System.out.println("Unesite ID razreda u koji ga želite prebaciti: ");
        int idNovogRazreda= scanner.nextInt();

        String query= "UPDATE Ucenik SET RazredId = ? WHERE IdUcenik = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,idNovogRazreda);
        preparedStatement.setInt(1,idUcenika);
        preparedStatement.executeQuery();


        preparedStatement.close();
        connection.commit();

    }


    private static void pretragaRazredaPoNazivu (Connection connection) throws SQLException {

        Scanner scanner= new Scanner(System.in);

        connection.setAutoCommit(false);

        System.out.println("Unesite naziv razreda: ");
        String naziv = scanner.next();

        String query= "SELECT * FROM Razred WHERE Naziv = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,naziv);
        preparedStatement.executeQuery();


        ResultSet resultSet = preparedStatement.executeQuery(query);
        System.out.println("Razred ID: " +resultSet.getInt("IdRazred")+" "+"Naziv razreda: " +resultSet.getString("Naziv")+" "+ "Nastavnik ID: " + resultSet.getInt("NastavnikId"));

        preparedStatement.close();
        resultSet.close();

        connection.commit();

    }


    private static void unosNovogNastavnika (Connection connection) throws SQLException {

        Scanner scanner= new Scanner(System.in);

        connection.setAutoCommit(false);

        System.out.println("Unesite ime nastavnika: ");
        String ime= scanner.next();
        System.out.println("Unesite prezime nastavnika: ");
        String prezime= scanner.next();
        System.out.println("Unesite email nastavnika: ");
        String email= scanner.next();

        String query = "INSERT INTO Nastavnik (Ime,Prezime,Email) VALUES (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,ime);
        preparedStatement.setString(2,prezime);
        preparedStatement.setString(3,email);
        preparedStatement.executeQuery();

        preparedStatement.close();
        connection.commit();

    }



    private static void unosNovogRazreda (Connection connection) throws SQLException {

        Scanner scanner= new Scanner(System.in);

        connection.setAutoCommit(false);

        System.out.println("Unesite naziv razreda: ");
        String nazivRazreda = scanner.next();
        System.out.println("Unesite ID nastavnika: ");
        int nastavnikID= scanner.nextInt();

        String query= "INSERT INTO Razred (Naziv,NastavnikId) VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,nazivRazreda);
        preparedStatement.setInt(2,nastavnikID);
        preparedStatement.executeQuery();

        preparedStatement.close();
        connection.commit();

    }


    private static void unosNovogUcenika (Connection connection) throws SQLException {

        Scanner scanner= new Scanner(System.in);

        connection.setAutoCommit(false);

        System.out.println("Unesite ime ucenika: ");
        String ime= scanner.next();
        System.out.println("Unesite prezime ucenika: ");
        String prezime= scanner.next();
        System.out.println("Unesite id razreda ucenika: ");
        int razredID= scanner.nextInt();

        String query= "INSERT INTO Ucenik (Ime,Prezime,RazredId) VALUES (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,ime);
        preparedStatement.setString(2,prezime);
        preparedStatement.setInt(3,razredID);
        preparedStatement.executeQuery();


        preparedStatement.close();
        connection.commit();

    }


    private static void ispisSvihUcenika (Connection connection) throws SQLException {

        String query = "SELECT * FROM Ucenik";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {

            System.out.println("ID: "+resultSet.getInt("IdUcenik")+" "+ "Ime i prezime: " + resultSet.getString("Ime")+" "+ resultSet.getString("Prezime")+ " "+ "RazredID: "+ resultSet.getString("RazredId"));
        }

        resultSet.close();
        statement.close();

    }


    private static void ispisSvihRazreda (Connection connection) throws SQLException {

        String query = "SELECT * FROM Razred";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {

            System.out.println("ID: "+resultSet.getInt("IdRazred")+" "+ "Naziv razreda: " + resultSet.getString("Naziv")+ " "+ "NastavnikId: "+ resultSet.getString("NastavnikId"));
        }

        resultSet.close();
        statement.close();

    }


    private static void ispisSvihNastavnika(Connection connection) throws SQLException {

        String query = "SELECT * FROM Nastavnik";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {

            System.out.println("ID: "+resultSet.getInt("IdRazred")+" "+ "Ime i prezime: " + resultSet.getString("Ime")+" "+ resultSet.getString("Prezime"));
        }

        resultSet.close();
        statement.close();

    }










}



