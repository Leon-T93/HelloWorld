import java.util.Scanner;

public class Main {
    public static void main(String[] args) {





        Scanner scanner = new Scanner(System.in);
        Zaposlenik zaposlenik = new Zaposlenik();
        Tvrtka tvrtka= new Tvrtka("Tcom", null);
        System.out.println("Unesite ime zaposlenika: ");
        zaposlenik.setIme(scanner.nextLine());
        System.out.println("Unesite prezime zaposlenika: ");
        zaposlenik.setPrezime(scanner.nextLine());
        System.out.println("Unesite placu zaposlenika: ");
        zaposlenik.setPlaca(scanner.nextDouble());

        tvrtka.dodajZaposlenika(zaposlenik);




        tvrtka.ispisiZaposlenike();

        tvrtka.pronadjiNajvecuPlacu();





















    }
}