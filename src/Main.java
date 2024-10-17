import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite velicinu polja: ");
        int velicinaPolja = scanner.nextInt();

        int[] polje = new int[velicinaPolja];

        for (int i = 0; i < polje.length; i++){
            System.out.println("Unesite vrijednost "+ (i + 1) + ". elementa:");
            polje[i] = scanner.nextInt();
        }

        int maxElement = polje[0];
        for (int i = 1; i<polje.length; i++){
            if (polje[i] > maxElement){
                maxElement = polje[i];
            }
        }

        System.out.println("maximalni element polja je: " + maxElement);




    }
}







