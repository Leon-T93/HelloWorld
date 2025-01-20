import database.DatabaseService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {


        Scanner scanner= new Scanner(System.in);


        Connection connection = DatabaseService.createConnection();




        brisanjeRacunaPoIdRacuna(connection);








        connection.close();
    }



    private static void brisanjeRacunaPoIdRacuna (Connection connection) throws SQLException {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Molim unesite ID Racuna koji zelite obrisati.");


        connection.setAutoCommit(false);

        try {
            String unesenIDRacuna = scanner.next();
            String query = "DELETE FROM Stavka WHERE RacunID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, unesenIDRacuna);

            String query2 = "DELETE FROM Racun WHERE IDRacun =?";
            PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
            preparedStatement.setString(1, unesenIDRacuna);

            preparedStatement.executeUpdate();
            preparedStatement2.executeUpdate();

            connection.commit();


        } catch (SQLException e) {
            System.out.println(e);
            connection.rollback();
        }

    }






}



