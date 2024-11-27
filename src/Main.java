import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        EvidencijaVozila listaVozila= new EvidencijaVozila();

        Automobil automobil = new Automobil("ZG1111AA", "BMW", 2020,4);
        listaVozila.dodajVoziloUListuVozila(automobil);
        Automobil automobil2 = new Automobil("OS2222BB", "Dodge", 2022,2);
        listaVozila.dodajVoziloUListuVozila(automobil2);

        Motocikl motocikl = new Motocikl("DU3333CC", "Kawasaki", 2018,"dizel");
        listaVozila.dodajVoziloUListuVozila(motocikl);
        Motocikl motocikl2 = new Motocikl("RI4444DD", "Yamaha", 2024,"elektricni");
        listaVozila.dodajVoziloUListuVozila(motocikl2);


        listaVozila.spremiPodatkeUDatoteku(listaVozila.getListaVozila());




    }


}