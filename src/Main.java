import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Main {
    public static void main(String[] args) throws Exception {




        Student student1= new Student("Marko" , "Maric", 50);
        Student student2= new Student("Petar" , "Peric", 90);
        Student student3= new Student("Ivan" , "Ivic", 20);


        Writer out= new FileWriter("studenti.txt");
        PrintWriter easyout = new PrintWriter(out);
        easyout.println("Podatci prvog studenta: " );
        easyout.println("Ime: " + student1.getIme()+ "\n"+ "Prezime: " + student1.getPrezime()+ "\n" +"Broj Indexa: " + student1.getBrIndexa() );
        easyout.println("\n"+"Podatci drugog studenta: " );
        easyout.println("Ime: " + student2.getIme()+ "\n"+ "Prezime: " + student2.getPrezime()+ "\n" +"Broj Indexa: " + student2.getBrIndexa() );
        easyout.println("\n"+"Podatci treceg studenta: ");
        easyout.println("Ime: " + student3.getIme()+ "\n"+ "Prezime: " + student3.getPrezime()+ "\n" +"Broj Indexa: " + student3.getBrIndexa() );


        File inputFile = new File("studenti.txt");
        FileReader in = new FileReader(inputFile);
        int i = 0;
        int c;
        while ((c= in.read()) != -1) {
            i++;
            System.out.println("Broj znakova je: "+ i);
        }

        in.close();
        out.close();







        }



    }










































































