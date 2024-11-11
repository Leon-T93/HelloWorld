public class Gotovina implements Placanje{

    private double gotovinaIznos;

    @Override
    public void platiti(double iznos) {
        this.gotovinaIznos=iznos;
    }

    @Override
    public String getDetalje() {
        return "Plaćanje putem gotovine u iznosu od: " +this.gotovinaIznos + "EUR.";
    }
}
