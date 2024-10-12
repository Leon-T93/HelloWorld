import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Molim unesite broj");
        int uneseniBroj = scanner.nextInt();


        int length = String.valueOf(uneseniBroj).length();

        System.out.println("Broj znamenki u vašem broju je: " + length);








    }
}