import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EvidencijaVozila  {

    private List<Vozilo> listaVozila;

    public EvidencijaVozila () {
        this.listaVozila = new ArrayList<>();
    }


    public void dodajVoziloUListuVozila (Vozilo vozilo) {
        this.listaVozila.add(vozilo);
    }

    public String getListaVozila () {
        return this.listaVozila.toString();
    }





    public void spremiPodatkeUDatoteku (String vozilo) throws IOException {
            File inputFile = new File(vozilo);
            File outputFile = new File("ListaVozila.txt");
            FileReader in = new FileReader(inputFile);
            FileWriter out = new FileWriter(outputFile);

            in.close();
            out.close();

    }






}
