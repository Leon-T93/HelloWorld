import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite 20 brojeva: ");

        List<Integer> brojevi= new ArrayList<>();

        int i=0;
        int broj;
        while (i<5) {
            System.out.println("Unesite broj: ");
            broj= scanner.nextInt();
            brojevi.add(broj);
            i++;

        }

        List<Integer> pozitivniBrojevi = new ArrayList<>();
        List<Integer> negativniBrojevi = new ArrayList<>();

        for (int y=0; y<brojevi.size(); y++){
            if (brojevi.get(y) >= 0) {
                pozitivniBrojevi.add(brojevi.get(y));
            } else {
                negativniBrojevi.add(brojevi.get(y));
            }
        }

        int zbrojPozitivnihBrojeva=0;
        for (int z=0; z<pozitivniBrojevi.size(); z++){
            zbrojPozitivnihBrojeva = zbrojPozitivnihBrojeva + pozitivniBrojevi.get(z);
        }

        int zbrojNegativnihBrojeva= 0;
        for (int z=0; z<negativniBrojevi.size(); z++){
            zbrojNegativnihBrojeva = zbrojNegativnihBrojeva + negativniBrojevi.get(z);
        }



        System.out.println("Zbroj pozitivnih brojevi: " + zbrojPozitivnihBrojeva + "\nZbroj negativnih brojevi: " + zbrojNegativnihBrojeva);



    }


}