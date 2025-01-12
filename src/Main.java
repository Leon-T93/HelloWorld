import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        HashMap<String, List> proizvodi = new HashMap<>();


        List<String> voce = new ArrayList<>();
        List<String> povrce = new ArrayList<>();


        System.out.println("Za unos proizvoda birajte 1, za ispis birajte 2.");

        int odabir1= scanner.nextInt();

        while (odabir1 < 2) {
            System.out.println("Unesite ime proizvoda.");
            String nazivProizvoda = scanner.next();

            System.out.println("Odaberite 1 za voce, 2 za povrce.");

            int odabir = scanner.nextInt();

            if (odabir ==1){
                voce.add(nazivProizvoda);
            }
            if (odabir == 2){
                povrce.add(nazivProizvoda);
            }
            System.out.println("Za unos proizvoda birajte 1, za ispis birajte 2.");
            odabir1= scanner.nextInt();

        }


        proizvodi.put("voce", voce);
        proizvodi.put("povrce", povrce);


        System.out.println("Voce: " + proizvodi.get("voce"));
        System.out.println("Povrce: " + proizvodi.get("povrce"));

        System.out.println("Proizvodi: " + proizvodi);































    }


}