public class KreditnaKartica implements Placanje{

    private double kreditnaKarticaIznos;


    @Override
    public void platiti(double iznos) {
        this.kreditnaKarticaIznos=iznos;
    }

    @Override
    public String getDetalje() {
        return "Plaćanje putem kreditne kartice u iznosu od: " +this.kreditnaKarticaIznos + "EUR.";
    }
}
