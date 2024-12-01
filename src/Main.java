import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> listaStudenata = new ArrayList<>();

        Student student1= new Student("Marko", "Maric",2.5);
        listaStudenata.add(student1);
        Student student2= new Student("Ivan", "Ivic",4.5);
        listaStudenata.add(student2);
        Student student3= new Student("Sara", "Saric",3.5);
        listaStudenata.add(student3);

        double najboljiProsjekOcjena=0;
        Student najboljiStuden = null;
        for (int i=0; i<listaStudenata.size(); i++) {
            if (najboljiProsjekOcjena < listaStudenata.get(i).getProsjekOcjena()) {
                najboljiProsjekOcjena = listaStudenata.get(i).getProsjekOcjena();
                najboljiStuden = listaStudenata.get(i);
            }
        }

        System.out.println("Najbolji student: "+ "\n" +najboljiStuden.getIme() +" " + najboljiStuden.getPrezime() +" sa prosjekom ocjena: " + najboljiStuden.getProsjekOcjena());


    }


}