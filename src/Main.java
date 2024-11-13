import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Main {
    public static void main(String[] args) throws Exception {





        //●Obradi iznimke koje se mogu pojaviti tijekom računanja faktorijela. Na primjer, obradi situaciju kada korisnik unese negativan broj jer faktorijel nije
        // definiran za negativne brojeve.
        //●Ispiši rezultat ili poruku o greški, ovisno o tome je li računanje faktorijela uspješno ili ne




        System.out.println("Unesite željeni broj: ");
        int broj;

        boolean ispravniUnos =false;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                broj = scanner.nextInt();
                ispravniUnos= true;


            } catch (Exception e) {
                System.out.println("Unjeli ste slovo ili decimalan broj, probajte ponovno!");
                broj=1;

            }

            if (broj <0) {
                throw new Exception("Nemoze negativan broj");
            }

        }while (ispravniUnos!=true);

        int faktorijelBroja = 1;



        for (int i = 1; i < (broj + 1); i++) {
        faktorijelBroja = faktorijelBroja * i;
        }





        System.out.println("Faktorijel od broja " + broj + " je " + faktorijelBroja);







        }



    }






































































