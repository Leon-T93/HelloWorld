public abstract class Vozilo {

    private String marka;

    private String model;

    private String registracija;

    public Vozilo (String marka, String model, String registracija) {
        this.marka = marka;
        this.model = model;
        this.registracija = registracija;
    }

    public void setMarka (String marka){
        this.marka = marka;
    }

    public void setModel (String model){
        this.model = model;
    }

    public void setRegistracija (String registracija){
        this.registracija = registracija;
    }

    public String getMarka() {
        return this.marka;
    }

    public String getModel() {
        return this.model;
    }

    public String getRegistracija() {
        return this.registracija;
    }


    public abstract String detaljanOpisVozila ();
}
