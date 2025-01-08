import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> odjelA = new HashSet<>();

        HashSet<String> odjelB = new HashSet<>();


        odjelA.add("Marko");
        odjelA.add("Mario");
        odjelA.add("Ivan");
        odjelA.add("Filip");

        odjelB.add("Marko");
        odjelB.add("Marin");
        odjelB.add("Alen");
        odjelB.add("Leon");


        HashSet<String> odjelAB = new HashSet<>();

        odjelAB.addAll(odjelA);
        odjelAB.addAll(odjelB);

        System.out.println("Zaposlenici odjela A i B su: " + odjelAB);






        HashSet<String> uObaOdjela = new HashSet<>();

        HashSet<String> SamoAOdjel = new HashSet<>();

        if (odjelB.contains("Marko")){
            uObaOdjela.add("Marko");
        } else SamoAOdjel.add("Marko");

        if (odjelB.contains("Mario")){
            uObaOdjela.add("Mario");
        }else SamoAOdjel.add("Mario");

        if (odjelB.contains("Ivan")){
            uObaOdjela.add("Ivan");
        }else SamoAOdjel.add("Ivan");

        if (odjelB.contains("Filip")){
            uObaOdjela.add("Filip");
        }else SamoAOdjel.add("Filip");

        System.out.println("Zaposlenici koji rade u oba odjela: " + uObaOdjela);

        System.out.println("Zaposlenici koji rade samo u A odjelu: " + SamoAOdjel);










    }


}