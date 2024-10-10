import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int sretniBroj;

        do {
            System.out.println("Odaberite broj od 1 do 10.");

            sretniBroj = scanner.nextInt();

            if (sretniBroj >7 || sretniBroj <7){
                System.out.println("Nažalost niste pogodili, probajte ponovo.");
            }

        }while (sretniBroj >7 || sretniBroj <7);

        System.out.println("Bravo, pogodili ste broj i osvojili....ovaj tekst....");




    }
}