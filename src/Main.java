import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int broj;
        int pogodak = 0;
        int zbroj = 0;

        System.out.println("Unesi broj dok ne pogodis.");

        broj = scanner.nextInt();

        while(broj!=pogodak){

            zbroj = zbroj + broj;

            System.out.println("Pokusaj ponovo.");

            broj = scanner.nextInt();

        }

        System.out.println("Rezultat je: " + zbroj);







    }
}