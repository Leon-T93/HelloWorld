import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Molim vas unesite jedan broj od 1 do 4:");
        int uneseniBroj = scanner.nextInt();

        if (uneseniBroj == 1){
            System.out.println("Odabrali ste zbrajanje");
        } else if (uneseniBroj == 2) {
            System.out.println("Odabrali ste oduzimanje");
        } else if (uneseniBroj == 3) {
            System.out.println("Odabrali ste mnozenje");
        } else if (uneseniBroj == 4) {
            System.out.println("Odabrali ste dijeljenje");
        } else {
            System.out.println("Niste unjeli broj od 1 do 4");
        }
    }
}