import database.DatabaseService;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);



        textZaIzbor();

        int odabir;

        odabir = scanner.nextInt();

        while (odabir <5){
            switch (odabir) {
                case 1:
                    unosGrada();
                    break;
                case 2:
                    izmjenaGrada();
                    break;
                case 3:
                    brisanjeGrada();
                    break;
                case 4:
                    prikazSvihGradovaSortiranihPoNazivu();
                    break;
            }
            textZaIzbor();
            odabir = scanner.nextInt();
        }


    }
    

    private static void textZaIzbor() {
        System.out.println("\n" +"\n" +"Odaberite jednu od sljedečih opcija: " + "\n" +
                "(1) za unos novog grada" + "\n" +
                "(2) za izmjenu postoječeg grada" + "\n" +
                "(3) za brisanje postoječeg grada" + "\n" +
                "(4) za prikaz svih gradova sortiranih po nazivu" + "\n" +
                "(5) za izlaz");
    }


    private static void unosGrada() {
        Connection connection = DatabaseService.createConnection();

        Scanner scanner= new Scanner(System.in);

        try {
            String query = "INSERT INTO Grad (Naziv,DrzavaID) VALUES (?,?)";
            PreparedStatement statement = connection.prepareStatement(query);

            System.out.println("Molim unesite naziv novog grada.");

            String nazivGrada = scanner.next();

            System.out.println("Molim unesite ID države kojoj grad pripada iz sljedečeg popisa: " + "\n");

            popisDrzava();

            Integer drzavaGrada = scanner.nextInt();

            statement.setString(1, nazivGrada);
            statement.setInt(2, drzavaGrada);


            Integer result = statement.executeUpdate();



            System.out.println("\n" +"Broj promjena: " + result);
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }


    private static void popisDrzava() {
        Connection connection = DatabaseService.createConnection();

        try {
            String query = "SELECT * FROM Drzava";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);


            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("IDDrzava") +" = "+ resultSet.getString("Naziv"));
            }


            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }


    private static void izmjenaGrada() {
        Connection connection = DatabaseService.createConnection();

        Scanner scanner= new Scanner(System.in);

        try {
            String query = "UPDATE Grad SET Naziv = ?, DrzavaID = ? WHERE IDGrad = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            prikazSvihGradovaSortiranihPoNazivu();

            System.out.println("Molim unesite ID grada kojem želite izmjeniti naziv.");

            Integer IDStarogNazivaGrada = scanner.nextInt();

            System.out.println("Molim unesite novi naziv grada.");

            String noviNazivGrada = scanner.next();

            System.out.println("Molim unesite IDDrzave kojoj pripada taj grad. Popis država: ");

            popisDrzava();

            Integer noviIDDrzave = scanner.nextInt();


            statement.setString(1, noviNazivGrada);
            statement.setInt(2, noviIDDrzave);
            statement.setInt(3, IDStarogNazivaGrada);

            Integer result = statement.executeUpdate();


            System.out.println("\n" +"Broj promjena: " + result);
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }


    private static void brisanjeGrada() {
        Connection connection = DatabaseService.createConnection();

        Scanner scanner= new Scanner(System.in);

        try {
            String query = "DELETE FROM Grad WHERE IDGrad = ?";
            PreparedStatement statement = connection.prepareStatement(query);

            prikazSvihGradovaSortiranihPoNazivu();

            System.out.println("Molim unesite ID grada koji želite obrisati.");

            Integer IDGradaZaBrisanje = scanner.nextInt();

            statement.setInt(1, IDGradaZaBrisanje);

            Integer result = statement.executeUpdate();


            System.out.println("\n" +"Broj promjena: " + result);
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }


    private static void prikazSvihGradovaSortiranihPoNazivu() {
        Connection connection = DatabaseService.createConnection();

        try {
            String query = "SELECT * FROM Grad ORDER BY Naziv";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);


            while (resultSet.next()) {
                System.out.println(resultSet.getString("Naziv")+ " --- " +"IDGrad = " + resultSet.getInt("IDGrad") +" --- "+
                        "DrzavaID = "+ resultSet.getInt("DrzavaID"));

            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}

