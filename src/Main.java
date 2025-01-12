import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Molim unesite tekst.");

        String recenica = scanner.nextLine();

        HashMap rijeci = new HashMap<>();

        String recenicaBezZnakova = recenica.replaceAll("\\p{Punct}", "");

        int i=1;

        for (String rijec : recenicaBezZnakova.toLowerCase().split(" ")) {
            int j= rijeci.get(rijec);
            if (rijeci.containsKey(rijec)){
                rijeci.put(rijec, j+1);
            }else {
                rijeci.put(rijec, i);

            }

        }



        System.out.println(rijeci);


























    }


}