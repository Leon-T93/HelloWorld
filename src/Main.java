import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> studenti = new HashSet<>();

        studenti.add("Marko");
        studenti.add("Mario");
        studenti.add("Luka");
        studenti.add("Filip");
        studenti.add("Vinko");


        if (studenti.contains("Filip")){
            System.out.println("Filip je student.");
        }else System.out.println("Filip nije student.");


        System.out.println("Studenti su: " + studenti);


        studenti.remove("Filip");

        System.out.println("Studenti nakon promjene su: " + studenti);

    }


}