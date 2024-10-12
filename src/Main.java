import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int pocetak = 1;
        int zbroj = 0;
        System.out.println("Molim unesite pozitivan broj");
        int uneseniBroj = scanner.nextInt();

        while(uneseniBroj<0){
            System.out.println("Molim unesite pozitivan broj");
            uneseniBroj = scanner.nextInt();
        }

        for (int i =1; i <= uneseniBroj; i++){
            zbroj += i; 
        }

        System.out.println("Rezultat je: " + zbroj);







    }
}