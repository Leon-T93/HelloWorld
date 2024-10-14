import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int maxBroj = 20;
        int uneseniBroj;
        int zbroj = 0;
        int brojac = 0;


        while (zbroj < maxBroj) {
            System.out.println("Unesite pozitivan broj: ");
            uneseniBroj = scanner.nextInt();

            if(uneseniBroj > 0) {
                zbroj = zbroj + uneseniBroj;

                brojac = brojac + 1;
            }else if (uneseniBroj < 0) {
                System.out.println("Nemozete unjeti negativan broj!");
            }else {
                System.out.println("Unjeli ste 0. Program se prekida." );
                break;
            }
        }

        System.out.println("Zbroj unesenih brojeva iznosi " + zbroj);
        System.out.println("Broj uspjesnih pokusaja " + brojac);







    }
}