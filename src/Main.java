import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        TekuciRacun TekuciRacun= new TekuciRacun("123456", BigDecimal.valueOf(500),"Marko Markic",BigDecimal.valueOf(0.1));
        StedniRacun StedniRacun= new StedniRacun("12345678", BigDecimal.valueOf(500),"Niko Nikic",BigDecimal.valueOf(1.5));

        int odabir;
        System.out.println("Odaberite 1 za TekuciRacun, 2 za StedniRacun");
        odabir = scanner.nextInt();
        switch (odabir) {
            case 1:
                int odabir2;
                do {
                    System.out.println("Odaberite:");
                    System.out.println("1 za uplatu");
                    System.out.println("2 za isplatu");
                    System.out.println("3 za ispis kamatne stope i trenutnog stanja");
                    System.out.println("4 za izlaz");
                    odabir2 = scanner.nextInt();
                    switch (odabir2) {
                        case 1:
                            System.out.println("Unesite koliko zelite uplatitit: ");
                            TekuciRacun.uplataNaRacun(scanner.nextBigDecimal());
                            break;
                        case 2:
                            System.out.println("Unesite koliko zelite podici: ");
                            TekuciRacun.isplataSaRacuna(scanner.nextBigDecimal());
                            break;
                        case 3:
                            System.out.println("Kamatna stopa: " +TekuciRacun.getKamatnaStopa());

                            System.out.println("Trenutno stanje racuna: " + TekuciRacun.obracunKamate());

                            break;
                    }

                } while (odabir2 != 4);


            case 2:
                int odabir3;
                do {
                    System.out.println("Odaberite:");
                    System.out.println("1 za uplatu");
                    System.out.println("2 za isplatu");
                    System.out.println("3 za ispis kamatne stope i trenutnog stanja");
                    System.out.println("4 za izlaz");
                    odabir3 = scanner.nextInt();
                    switch (odabir3) {
                        case 1:
                            System.out.println("Unesite koliko zelite uplatitit: ");
                            StedniRacun.uplataNaRacun(scanner.nextBigDecimal());
                            break;
                        case 2:
                            System.out.println("Unesite koliko zelite podici: ");
                            StedniRacun.isplataSaRacuna(scanner.nextBigDecimal());
                            break;
                        case 3:
                            System.out.println("Kamatna stopa: "+StedniRacun.getKamatnaStopa());

                            System.out.println("Trenutno stanje racuna: "+StedniRacun.obracunKamate());

                            break;
                    }

                } while (odabir3 != 4);

        }



    }







































    }






























