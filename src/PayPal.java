public class PayPal implements Placanje{


    private double payPalIznos;


    @Override
    public void platiti(double iznos) {
        this.payPalIznos=iznos;
    }

    @Override
    public String getDetalje() {
        return "Plaćanje putem PayPal-a u iznosu od: " +this.payPalIznos + "EUR.";
    }
}
