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
            uneseniBrojevi = scanner.nextInt();
            listaBrojeva.add(uneseniBrojevi);
        }


        System.out.println("Unjeli ste 10 brojeva.");


        int brojac1;
        int brojac2;
        int brojac3;
        int brojac4;
        int brojac5;
        int brojac6;
        int brojac7;
        int brojac8;
        int brojac9;
        int brojac10;

        switch  (listaBrojeva.get()){
            case "1"
                brojac1++;
            case "2"
                brojac2++;
            case "3"
                brojac3++;
            case "4"
                brojac4++;
            case "5"
                brojac5++;
            case "6"
                brojac6++;
            case "7"
                brojac7++;
            case "8"
                brojac8++;
            case "9"
                brojac9++;
            case "10"
                brojac10++;


        }








    }
}

















