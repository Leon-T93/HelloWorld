public class Automobil extends Vozilo {


    private Integer brojSjedala;

    private String vrstaGoriva;


    public Automobil(String marka, String model, String registracija, Integer brojSjedala, String vrstaGoriva) {
        super(marka, model, registracija);
        this.brojSjedala = brojSjedala;
        this.vrstaGoriva = vrstaGoriva;
    }

    @Override
    public String detaljanOpisVozila() {
        return "Marka: " + getMarka() + "\nModel: " +getModel() +"\nRegistracija: " + getRegistracija() +"\nBroj sjedala: " + this.brojSjedala +"\nVrsta goriva: " + this.vrstaGoriva;
    }
}
