import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Vozilo> vozila = new ArrayList<>();

        Automobil automobil= new Automobil("BMW", "i8", "ZG5555AA", 5, "struja");
        vozila.add(automobil);
        Automobil automobil2= new Automobil("Audi", "R8", "ST7777BB", 4, "dizel");
        vozila.add(automobil2);
        Automobil automobil3= new Automobil("Ferrari", "F40", "OS2222CC", 2, "benzin");
        vozila.add(automobil3);


        Kamion kamion = new Kamion("Volvo", "A", "ZG1111AA",5000, false);
        vozila.add(kamion);
        Kamion kamion2 = new Kamion("Mercedes-Benz", "B", "ST2222BB",10000, false);
        vozila.add(kamion2);
        Kamion kamion3 = new Kamion("MAN", "C", "OS3333CC",15000, true);
        vozila.add(kamion3);


        System.out.println("Unesite registraciju: ");

        String registracija = scanner.next();
        boolean postojanje= false;
        for (int i= 0; i< vozila.size(); i++) {
            if (registracija.equals(vozila.get(i).getRegistracija())) {
                postojanje = true;
                System.out.println(vozila.get(i).detaljanOpisVozila());
                break;
            }


        }if (postojanje == false){
            System.out.println("Vozilo ne postoji u nasem voznom parku!");
        }


        System.out.println("Želite li ispisati sva vozila? Odaberite 1 za DA, 2 za NE: ");

        int odabir = scanner.nextInt();

        switch (odabir) {
            case 1:
                for (int i= 0; i< vozila.size(); i++){
                    System.out.println(vozila.get(i).detaljanOpisVozila());
                }
                break;

            default:
                break;
        }



    }


}