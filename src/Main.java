import database.DatabaseService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {


        Scanner scanner= new Scanner(System.in);


        Connection connection = DatabaseService.createConnection();


        

        obrisiOsobePoDatumuRodenja(connection);


        connection.close();
    }




    public static void dodavanjeNovihOsoba(Connection connection) throws SQLException {

        Osoba osoba1 = new Osoba("Marko", "Maric" ,"20010501");
        Osoba osoba2 = new Osoba("Filip", "Filic" ,"20020602");
        Osoba osoba3 = new Osoba("Ivan", "Ivic" ,"20030703");
        Osoba osoba4 = new Osoba("Ana", "Anic" ,"20040804");
        Osoba osoba5 = new Osoba("Mara", "Maric" ,"20050905");

        List<Osoba> listaOsoba = new ArrayList<>();

        listaOsoba.add(osoba1);
        listaOsoba.add(osoba2);
        listaOsoba.add(osoba3);
        listaOsoba.add(osoba4);
        listaOsoba.add(osoba5);


        String query = "INSERT INTO Osoba (Ime,Prezime, DatumRodenja) VALUES (?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        for (Osoba osoba : listaOsoba) {
            preparedStatement.setString(1, osoba.getIme());
            preparedStatement.setString(2, osoba.getPrezime());
            preparedStatement.setString(3, osoba.getDatum());
            preparedStatement.executeUpdate();
            System.out.println("Unjeti podatak: " + osoba.getIme() + " " + osoba.getPrezime() + " "+ osoba.getDatum());
        }

        preparedStatement.close();
    }


    public static void azuriranjePrezimenaPoIDu(Connection connection) throws SQLException {

        String callProcedure = "{CALL AzurirajPrezime(?,?)}";
        CallableStatement callableStatement = connection.prepareCall(callProcedure);

        int idOsobe = 5;
        String novoPrezime = "Prezimić";
        callableStatement.setInt(1, idOsobe);
        callableStatement.setString(2,novoPrezime);

        callableStatement.execute();

        System.out.println("Promjenili ste prezime osobe sa id-em "+ idOsobe + " u " + novoPrezime);

        callableStatement.close();
    }

    public static void obrisiOsobePoDatumuRodenja(Connection connection) throws SQLException {

        String callProcedure = "{CALL ObrisiOsobePoDatumuRodenja(?)}";
        CallableStatement callableStatement = connection.prepareCall(callProcedure);

        String datumDoKojegSeBrisuOsobe = "20030703";
        callableStatement.setString(1,datumDoKojegSeBrisuOsobe);

        callableStatement.execute();

        System.out.println("Obrisali ste sve osobe koje su rođene prije ovog datuma: " + datumDoKojegSeBrisuOsobe);

        callableStatement.close();
    }
}



