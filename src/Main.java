import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Proizvod prvi = new Proizvod();

        System.out.println("Postavi naziv proizvoda: ");
        prvi.dodajNaziv(scanner.nextLine());

        System.out.println("Postavi cijenu proizvoda: " + prvi.dohvatiNaziv());
        prvi.dodajCijenu(scanner.nextBigDecimal());

        System.out.println("Unesi zeljeni popust za proizvod: "+ prvi.dohvatiNaziv());
        prvi.dodajPopust(scanner.nextBigDecimal());



        System.out.println("Iznos je: " + prvi.dohvatikonacnuCijenu());

        System.out.println("Iznos je: " + prvi.dohvatikonacnuCijenux());

















    }
}





























