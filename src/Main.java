import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite 10 brojeva: ");

        List<Integer> brojevi= new ArrayList<>();

        int i=0;
        int broj;
        while (i<10) {
            System.out.println("Unesite broj: ");
            broj= scanner.nextInt();
            brojevi.add(broj);
            i++;

        }

        int parniBrojevi = 0;
        int neparniBrojevi= 0;
        for (int y=0; y< brojevi.size(); y++) {
            if (brojevi.get(y) % 2==0){
                parniBrojevi++;
            }else {
                neparniBrojevi++;
            }
        }

        System.out.println("Broj parnih brojeva je: "+ parniBrojevi + "\nBroj neparnih brojeva je: "+ neparniBrojevi);



    }


}