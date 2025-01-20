import database.DatabaseService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {


        Scanner scanner= new Scanner(System.in);


        Connection connection = DatabaseService.createConnection();





        azuriranjeZalihaProizvodaIGeneriranjeRacuna(connection);







        connection.close();
    }



    private static void azuriranjeZalihaProizvodaIGeneriranjeRacuna (Connection connection) throws SQLException {
        Scanner scanner= new Scanner(System.in);



        connection.setAutoCommit(false);

        try {
            String query = "INSERT INTO Racun (DatumIzdavanja,BrojRacuna,KupacID,KomercijalistID,KreditnaKarticaID) VALUES ('20010901', 'Test1',378,279,16281)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            String query2= "SELECT * FROM Racun WHERE BrojRacuna= 'Test1'";
            PreparedStatement preparedStatement2= connection.prepareStatement(query2);
            ResultSet resultSet =preparedStatement2.executeQuery();
            String brojRacunauStavki=resultSet.getString("IDRacun");


            String query3= "INSERT INTO Stavka (RacunID,Kolicina,ProizvodID,CijenaPoKomadu,PopustUPostocima,UkupnaCijena) VALUES (?,1,776,2024.994000,0,2024.994000)";
            PreparedStatement preparedStatement3= connection.prepareStatement(query3);
            preparedStatement3.setString(1,brojRacunauStavki);


            String query4= "SELECT * FROM Proizvod WHERE IDProizvod = 776";
            PreparedStatement preparedStatement4= connection.prepareStatement(query4);
            ResultSet resultSet2 =preparedStatement4.executeQuery();
            Integer minimalnaKolicinaNaSkladistu= resultSet2.getInt("MinimalnaKolicinaNaSkladistu");


            PreparedStatement preparedStatement5=null;

            if (minimalnaKolicinaNaSkladistu >0){
                String query5= "UPDATE Proizvod SET MinimalnaKolicinaNaSkladistu = ? WHERE IDProizvod = 776 ";
                preparedStatement5= connection.prepareStatement(query5);
                preparedStatement5.setInt(1,(minimalnaKolicinaNaSkladistu-1));

            }else connection.rollback();






            preparedStatement.executeUpdate();
            preparedStatement2.executeUpdate();
            preparedStatement3.executeUpdate();
            preparedStatement4.executeUpdate();
            preparedStatement5.executeUpdate();

            connection.commit();


        } catch (SQLException e) {
            System.out.println(e);
            connection.rollback();
        }

    }






}



