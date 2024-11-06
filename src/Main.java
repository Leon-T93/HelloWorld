import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String ime;
        String prezime;


        List studenti = new ArrayList<>();

        Boolean provjera= false;

        String odabir;

        int broj;



        while (provjera == false) {


            System.out.println("Za unos studenta birajte 1, za izlaz iz unosa 2.");
            broj = scanner.nextInt();

            if (broj == 1){
                System.out.println("Unesite ime studenta: ");
                odabir = scanner.nextLine();
                studenti.add(odabir);

            }if (broj == 2){
                provjera= true;
            }


        }



































    }
}





























