import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> imena = new ArrayList<>();
        List<Integer> brojevi = new ArrayList<>();


        System.out.println("Odaberite broj za odredenu radnju:");
        System.out.println("1 - Dodaj kontakt");
        System.out.println("2 - Pretrazi po imenu");
        System.out.println("3 - Pretrazi po broju");
        System.out.println("4 - Ispisi sve");
        System.out.println("5 - Izlaz");

        int odabir = scanner.nextInt();

        switch (odabir){
            case 1:
                System.out.println("Unesite ime: ");
                String unesenoIme = scanner.nextLine();
                imena.add(unesenoIme);

                System.out.println("Unesite broj: ");
                int broj = scanner.nextInt();
                brojevi.add(broj);

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;

        }



    }


}

















