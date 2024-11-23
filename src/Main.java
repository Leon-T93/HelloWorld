import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Osobe osobe = new Osobe();
        Knjiznica knjiznica = new Knjiznica(null, null);
        int broj = 0;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Za unos clana odaberite 1. \nZa posudbu knjige odaberite 2. \nZa vracanje knjige odaberite 3. \nZa izlaz odaberite 4.");

            broj = scanner.nextInt();

            switch (broj) {

                case 1:
                    System.out.println("Unesite ime: ");
                    osobe.setIme(scanner.next());
                    System.out.println("Unesite prezime: ");
                    osobe.setPrezime(scanner.next());
                    System.out.println("Unesite clanski broj: ");
                    osobe.setClanskiBroj(scanner.nextInt());
                    knjiznica.dodajClanove(osobe);
                    break;

                case 2:

                case 3:

                default:
            }
        }while (broj != 4);







    }
}