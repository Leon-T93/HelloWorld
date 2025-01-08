import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> gradovi = new TreeSet<>();

        gradovi.add("Osijek");
        gradovi.add("Zagreb");
        gradovi.add("Split");
        gradovi.add("Rijeka");
        gradovi.add("Varaždin");

        System.out.println("Gradovi u sortiranom obliku: " + gradovi);


        System.out.println("Prvi grad u skupu: " + gradovi.first());

        System.out.println("Zadnji grad u skupu: " + gradovi.last());


        gradovi.remove("Varaždin");

        System.out.println("Gradovi u sortiranom obliku nakon brisanja grada : " + gradovi);


    }


}