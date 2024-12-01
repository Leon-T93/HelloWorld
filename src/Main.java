import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Knjiga> listaKnjiga = new ArrayList<>();

        Knjiga knjiga1= new Knjiga("Horror u sumi", "Marko Markic",1995);
        listaKnjiga.add(knjiga1);
        Knjiga knjiga2= new Knjiga("Cudo na moru", "Marko Markic",1800);
        listaKnjiga.add(knjiga2);
        Knjiga knjiga3= new Knjiga("Vanzemaljci", "Svemirko Svemir",3050);
        listaKnjiga.add(knjiga3);

        System.out.println("Unesite ime autora");

        String imeAutora= scanner.nextLine();

        System.out.println("Knjige od autora " +imeAutora+ " su: ");
        for (int i=0; i<listaKnjiga.size(); i++) {
            if (imeAutora.equals(listaKnjiga.get(i).getAutor())){
                System.out.println(listaKnjiga.get(i).getNaslov() + " ,godina izdavanja : " + listaKnjiga.get(i).getGodinaIzdanja());
            }
        }


    }


}