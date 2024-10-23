import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Traziti od korisnika unos liste stringova sve dok ne napise Stop, nakon toga izbrojiti koliko stringova sadrzi rijec Java
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> brojevi = new ArrayList<>();

        System.out.println("Unesite broj elemenata: ");
        int brojElemenata = scanner.nextInt();

        for(int i = 0; i< brojElemenata; i++){
            System.out.println("Unesite željeni broj: ");
            brojevi.add(scanner.nextInt());
        }

        int trenutniBroj=brojevi.get(0);

        for (int i=0; i< brojevi.size();i++){
            if(brojevi.get(i)==trenutniBroj){
                trenutniBroj=brojevi.get(i);
                System.out.println("True");

            }

        }




    }
}

















