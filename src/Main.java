import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Polaznik Marko = new Polaznik("Marko", "Markic");
        Polaznik Ivan = new Polaznik("Ivan", "Ivic", 25, "M");
        Polaznik TkoJeTajPokremon = new Polaznik();


        System.out.println(Marko.dohvatiIme() +" "+ Marko.dohvatiPrezime());

        Ivan.promjeniDob(26);

        TkoJeTajPokremon.dodajIme("Pikachu");
        TkoJeTajPokremon.dodajPrezime("Strujic");

        





    }
}





























