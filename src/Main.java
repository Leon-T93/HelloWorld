import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        System.out.println("Odaberite iznos koliko zelite platiti: ");

        double iznos=scanner.nextDouble();

        System.out.println("Odaberite nacin placanja: ");
        System.out.println("1) za Kreditnu karticu");
        System.out.println("2) za gotovinu" );
        System.out.println("3) za PayPal");

        int odabir;

        odabir = scanner.nextInt();

        Placanje nacinPlacanja;

        switch (odabir) {
            case 1:
                nacinPlacanja = new KreditnaKartica();
                break;

            case 2:
                nacinPlacanja = new Gotovina();
                break;

            default:
                nacinPlacanja = new PayPal();
                break;




        }

        nacinPlacanja.platiti(iznos);
        System.out.println(nacinPlacanja.getDetalje());
















        }



    }






































































