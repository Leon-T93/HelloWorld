import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        HashMap<String, Polaznik> evidencijaPolaznika = new HashMap<>();


        int odabir;




        do {
            System.out.println("Odaberite 1 za unos studenta, 2 za ispis studenata, 3 za izlaz.");
            odabir = scanner.nextInt();
            if (odabir==2){
                System.out.println("Polaznici: " + evidencijaPolaznika);
                break;
            }
            Polaznik polaznik= new Polaznik();
            System.out.println("Unesite email studenta: ");
            String provjeraEmaila = scanner.next();
            if (evidencijaPolaznika.containsKey(provjeraEmaila)){
                System.out.println("Ovaj email vec postoji.");
                break;
            }else {
                polaznik.setEmail(provjeraEmaila);
            }

            System.out.println("Unesite ime studenta: ");
            polaznik.setIme(scanner.next());

            System.out.println("Unesite prezime studenta: ");
            polaznik.setPrezime(scanner.next());

            evidencijaPolaznika.put(polaznik.getEmail(), polaznik);
        }while (odabir!=1 && odabir!=2);


























    }


}