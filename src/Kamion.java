public class Kamion extends Vozilo{

    private Integer nosivost;

    private Boolean prikolica;



    public Kamion(String marka, String model, String registracija, Integer nosivost, Boolean prikolica) {
        super(marka, model, registracija);
        this.nosivost = nosivost;
        this.prikolica = prikolica;
    }

    @Override
    public String detaljanOpisVozila() {
        return "Marka: " + getMarka() + "\nModel: " +getModel() +"\nRegistracija: " + getRegistracija() +"\nNosivost: " +this.nosivost +"\nPrisutnost prikolice: " + this.prikolica;
    }
}
