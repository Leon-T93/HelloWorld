import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite 15 decimalnih brojeva: ");

        List<Double> brojevi= new ArrayList<>();

        int i=0;
        double broj;
        while (i<15) {
            System.out.println("Unesite broj: ");
            broj= scanner.nextDouble();
            brojevi.add(broj);
            i++;

        }

        double najveciBroj = 0;
        double najmanjiBroj = brojevi.get(0);
        for (int y=0; y<brojevi.size(); y++) {
            if (brojevi.get(y) > najveciBroj ) {
                najveciBroj = brojevi.get(y);
            }
            if (brojevi.get(y) < najmanjiBroj) {
                najmanjiBroj = brojevi.get(y);
            }
        }

        System.out.println("Najveci broj: " + najveciBroj + "\nNajmanji broj: "+ najmanjiBroj);


    }


}