import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Stalni zaposlenik1= new Stalni();
        Sezonski zaposlenik2= new Sezonski();

        List<OsnovniZaposlenik> zaposlenici = new ArrayList<>();


        int odabir;

        System.out.println("Odaberite vrstu zaposlenika: 1 za stalnog, 2 za sezonskog");

        odabir= scanner.nextInt();

        switch (odabir) {
            case 1: //stalni
                System.out.println("Unesite ime zaposlenika: ");
                zaposlenik1.setImeZaposlenika(scanner.next());
                System.out.println("Unesite osnovnu placu: ");
                zaposlenik1.setOsnovnaPlaca(scanner.nextBigDecimal());
                System.out.println("Unesite broj radnih sati: ");
                zaposlenik1.setBrojRadnihSati(scanner.nextBigDecimal());
                BigDecimal bonus = new BigDecimal(160);
                if (zaposlenik1.getBrojRadnihSati().compareTo(bonus) == 1){
                    zaposlenik1.stalniIzracunBonusaAkoImaPreko160h();
                }
                zaposlenici.add(zaposlenik1);

                System.out.println("Ime: "+ zaposlenik1.getImeZaposlenika());
                System.out.println("Osnovna placa: "+ zaposlenik1.getOsnovnaPlaca());
                System.out.println("Broj radnih sati: "+zaposlenik1.getBrojRadnihSati());
                System.out.println("Bonus: "+ zaposlenik1.getStalniBonusOver160h());
                break;


            case 2: //sezonski
                System.out.println("Unesite ime zaposlenika: ");
                zaposlenik2.setImeZaposlenika(scanner.next());
                System.out.println("Unesite osnovnu placu: ");
                zaposlenik2.setOsnovnaPlaca(scanner.nextBigDecimal());
                System.out.println("Unesite broj radnih sati: ");
                zaposlenik2.setBrojRadnihSati(scanner.nextBigDecimal());
                BigDecimal b3 = new BigDecimal(200);
                if (zaposlenik2.getBrojRadnihSati().compareTo(b3) == 1){
                    zaposlenik2.sezonskiIzracunBonusaAkoImaPreko200h();
                }
                zaposlenici.add(zaposlenik2);

                System.out.println("Ime: "+ zaposlenik2.getImeZaposlenika());
                System.out.println("Osnovna placa: "+ zaposlenik2.getOsnovnaPlaca());
                System.out.println("Broj radnih sati: "+zaposlenik2.getBrojRadnihSati());
                System.out.println("Bonus: "+ zaposlenik2.getSezonskiBonusOver200h());
                break;
        }

        for (int i=0; i<zaposlenici.size(); i++){
            System.out.println("Ime: "+ zaposlenici.getImeZaposlenika());
        }













        }



    }






































































