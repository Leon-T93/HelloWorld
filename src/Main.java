import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Molim unesite zeljene brojeve i razdvojite ih razmakom!");

        String uneseniBrojevi= scanner.nextLine();

        HashSet brojevi = new HashSet<>();

        HashSet neJedinstevniBrojevi = new HashSet<>();


        for (String broj : uneseniBrojevi.split(" ")) {
            if (brojevi.contains(broj)){
                neJedinstevniBrojevi.add(broj);
            }
            brojevi.add(broj);
        }

        for (Object broj : neJedinstevniBrojevi) {
            if (brojevi.contains(broj)){
                brojevi.remove(broj);
            }
        }

        System.out.println("Jedinstveni brojevi su: " + brojevi);

        HashSet brojevi2 = new HashSet<>();

        for (Object broj : brojevi) {
            brojevi2.add(Integer.valueOf((String) broj));

        }


        System.out.println("Najveci broj je: " + Collections.max(brojevi2));

        System.out.println("Najmanji broj je: " + Collections.min(brojevi2));




































    }


}