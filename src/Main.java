import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



            int odabir = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Molim odaberite akciju: ");
            System.out.println("1 za unos zaposlenika: ");
            System.out.println("2 za ispis zaposlenika: ");
            System.out.println("3 za pronalazenje zaposlenika sa najvecom placom: ");
            System.out.println("4 za izlazak iz menija. ");

            odabir = scanner.nextInt();


                    Zaposlenik zaposlenik = new Zaposlenik();
                    Tvrtka tvrtka= new Tvrtka("Tcom", null);
            switch (odabir) {
                case 1:
                    System.out.println("Unesite ime zaposlenika: ");
                    zaposlenik.setIme(scanner.next());
                    System.out.println("Unesite prezime zaposlenika: ");
                    zaposlenik.setPrezime(scanner.next());
                    System.out.println("Unesite placu zaposlenika: ");
                    zaposlenik.setPlaca(scanner.nextDouble());

                    tvrtka.dodajZaposlenika(zaposlenik);

                    break;

                case 2:
                    tvrtka.ispisiZaposlenike();
                    break;

                case 3:
                    tvrtka.pronadjiNajvecuPlacu();
                    break;

                default:
            }
        }while (odabir != 4);





























    }
}