import database.DatabaseService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {


        Scanner scanner= new Scanner(System.in);


        Connection connection = DatabaseService.createConnection();

        dodavanjeAutoraiKnjiga(connection);


        textZaIzbor();

        int odabir;

        odabir = scanner.nextInt();

        while (odabir <4){
            switch (odabir) {
                case 1:
                    dohvacanjeSvihKnjigaOdAutoraPoPrezimenu(connection);
                    break;
                case 2:
                    azuriranjeNaslovaPoIdu(connection);
                    break;
                case 3:
                    dohvacanjeAutoraBezKnjiga(connection);
                    break;

            }

            textZaIzbor();
            odabir = scanner.nextInt();
        }








        connection.close();
    }




    private static void textZaIzbor() {
        System.out.println("\n" +"Odaberite jednu od sljedečih opcija: " + "\n" +
                "(1) za dohvačanje knjiga po prezimenu autora" + "\n" +
                "(2) za ažuriranje naslova knjige" + "\n" +
                "(3) za dohvačanje autora bez knjiga" + "\n" +
                "(4) za izlaz");
    }




    public static void dodavanjeAutoraiKnjiga(Connection connection) throws SQLException {

        Autor autor1 = new Autor("Marko", "Maric" ,"hrvatsko");
        Autor autor2 = new Autor("Filip", "Filic" ,"madarsko");
        Autor autor3 = new Autor("Ana", "Anic" ,"slovensko");
        Autor autor4 = new Autor("John", "Johnic" ,"americko");
        Autor autor5 = new Autor("Johan", "Bach" ,"njemacko");

        List<Autor> listaAutora = new ArrayList<>();

        listaAutora.add(autor1);
        listaAutora.add(autor2);
        listaAutora.add(autor3);
        listaAutora.add(autor4);
        listaAutora.add(autor5);



        Knjiga knjiga1 = new Knjiga("Sati",1955,1);
        Knjiga knjiga2 = new Knjiga("Minute",1954,1);

        Knjiga knjiga3 = new Knjiga("Dani",1970,2);
        Knjiga knjiga4 = new Knjiga("Mjeseci",1969,2);

        Knjiga knjiga5 = new Knjiga("Auti",1920,3);
        Knjiga knjiga6 = new Knjiga("Motori",1921,3);

        Knjiga knjiga7 = new Knjiga("TV",2010,4);
        Knjiga knjiga8 = new Knjiga("Kino",2011,4);

        Knjiga knjiga9 = new Knjiga("Ljudi",2022,5);
        Knjiga knjiga10 = new Knjiga("Svemirci",2024,5);

        List<Knjiga> listaKnjiga = new ArrayList<>();

        listaKnjiga.add(knjiga1);
        listaKnjiga.add(knjiga2);
        listaKnjiga.add(knjiga3);
        listaKnjiga.add(knjiga4);
        listaKnjiga.add(knjiga5);
        listaKnjiga.add(knjiga6);
        listaKnjiga.add(knjiga7);
        listaKnjiga.add(knjiga8);
        listaKnjiga.add(knjiga9);
        listaKnjiga.add(knjiga10);


        String query = "INSERT INTO Autor (Ime,Prezime,Nacionalnost) VALUES (?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        for (Autor autor : listaAutora) {
            preparedStatement.setString(1,autor.getIme());
            preparedStatement.setString(2,autor.getPrezime());
            preparedStatement.setString(3,autor.getNacionalonst());
            preparedStatement.executeUpdate();
        }

        String query2 = "INSERT INTO Knjiga (Naslov,GodinaIzdanja,AutorId) VALUES (?,?,?)";

        PreparedStatement preparedStatement2 = connection.prepareStatement(query2);

        for (Knjiga knjiga : listaKnjiga) {
            preparedStatement2.setString(1,knjiga.getNaslov());
            preparedStatement2.setInt(2,knjiga.getGodinaIzdanja());
            preparedStatement2.setInt(3,knjiga.getAutorID());
            preparedStatement2.executeUpdate();
        }
        preparedStatement.close();
        preparedStatement2.close();


    }


    public static void dohvacanjeSvihKnjigaOdAutoraPoPrezimenu (Connection connection) throws SQLException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Molim unesite Prezime autora od kojeg želite pronači knjige.");
        String prezimeAutora = scanner.next();
        String query = "SELECT Naslov, GodinaIzdanja FROM Knjiga AS k LEFT OUTER JOIN Autor AS a ON k.AutorId = a.Id WHERE Prezime = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1,prezimeAutora);
        preparedStatement.executeUpdate();


        ResultSet resultSet = preparedStatement.executeQuery(query);


        while (resultSet.next()) {
            System.out.println("Autor: "+resultSet.getString("Ime")+" "+resultSet.getString("Prezime")+"Naslov knjige: "+resultSet.getString("Naslov")+"Godina izdanja: " + resultSet.getInt("GodinaIzdanja"));


        }

        preparedStatement.close();
        resultSet.close();

    }



    public static void azuriranjeNaslovaPoIdu (Connection connection) throws SQLException {
        Scanner scanner= new Scanner(System.in);

        String query = "UPDATE Knjiga SET Naslov = ? WHERE Id = ?";
        PreparedStatement statement = connection.prepareStatement(query);

        popisSvihKnjiga(connection);

        System.out.println("Molim unesite ID knjige kojoj želite izmjeniti naziv.");

        Integer idKnjigeZaIzmjenuNaziva = scanner.nextInt();

        System.out.println("Molim unesite novi naziv knjige: ");

        String noviNazivKnjige = scanner.next();

        statement.setString(1,noviNazivKnjige);
        statement.setInt(2,idKnjigeZaIzmjenuNaziva);

        statement.executeUpdate();

        statement.close();

    }



    public static void dohvacanjeAutoraBezKnjiga (Connection connection) throws SQLException {

        String query = "SELECT Ime, Prezime FROM Autor AS a LEFT OUTER JOIN Knjiga AS k ON k.AutorId = a.Id WHERE AutorId IS NULL";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);


        while (resultSet.next()) {
            System.out.println(resultSet.getString("Ime")+ " " + resultSet.getString("Prezime"));

        }

        resultSet.close();
        statement.close();

    }


    public static void popisSvihKnjiga (Connection connection) throws SQLException {
        String query = "SELECT * FROM Knjiga ";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);


        while (resultSet.next()) {

            System.out.println("ID: "+resultSet.getInt("Id")+" "+ "Naslov Knjige: " + resultSet.getString("Naslov"));
        }

        resultSet.close();
        statement.close();

    }











}



