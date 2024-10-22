import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Traziti od korisnika unos liste stringova sve dok ne napise Stop, nakon toga izbrojiti koliko stringova sadrzi rijec Java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listaBrojeva = new ArrayList<>();

        int uneseniBrojevi;

        System.out.println("Unesite 10 brojeva.");

        for (int i = 0; i < 10; i++){
            System.out.println("Unesite broj u listu: ");
            uneseniBrojevi= scanner.nextInt();
            listaBrojeva.add(uneseniBrojevi);
        }


        System.out.println("Unjeli ste 10 brojeva.");


        int najveciBroj=0;
        int zbiljaBroj=0;
        for (int i = 0; i < listaBrojeva.size(); i++)
            if (najveciBroj< listaBrojeva.get(i)){
                najveciBroj++;
            }else if (najveciBroj>= listaBrojeva.get(i)){
                najveciBroj= zbiljaBroj;
                System.out.println("Najveci broj: "+ zbiljaBroj);
            }








    }
}

















