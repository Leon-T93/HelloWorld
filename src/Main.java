import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Molim vas unesite jedan broj:");

        int uneseniBroj = scanner.nextInt();

        System.out.println("Molim vas unesite drugi broj:");

        int uneseniBroj2 = scanner.nextInt();

        int zbroj = uneseniBroj + uneseniBroj2;

        System.out.println("Rezultat : " + zbroj);
    }
}