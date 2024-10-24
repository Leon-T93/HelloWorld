import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Tražiti od korisnika da unese broj elemenata u listi te popuni elemente liste.
//Nakon toga pretražiti po listi da li postoji ijedan duplikat, ukoliko postoji ispisi vrijednost true, ukoliko ne postoji ispisi vrijednost false.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> brojevi = new ArrayList<>();

        System.out.println("Unesite broj elemenata: ");
        int brojElemenata = scanner.nextInt();

        for (int i = 0; i < brojElemenata; i++) {
            System.out.println("Unesite željeni broj: ");
            brojevi.add(scanner.nextInt());
        }

        provjeraSortiranosti(brojevi);
    }

    public static Boolean provjeraSortiranosti(List<Integer> lista){

        Boolean sortirano = true;

        for (int i=0; i<lista.size()-1; i++){
            if (lista.get(i)>lista.get(i+1)){
                System.out.println("Lista nije uzlazna!");
                sortirano = false;
                break;
            }
        }
        if (sortirano == true){
            System.out.println("Lista je uzlazna");
        }

        return sortirano;

    }
}

















