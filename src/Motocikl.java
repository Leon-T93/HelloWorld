public class Motocikl extends  Vozilo implements NeispravniPodaciException{


    private String tipMotora;


    public void setTipMotora (String tipMotora) {
        this.tipMotora = tipMotora;
    }

    public String getTipMotora () {
        return this.tipMotora;
    }




    public Motocikl(String registarskiBroj, String marka, Integer godinaProizvodnje, String tipMotora) {
        super(registarskiBroj, marka, godinaProizvodnje);
        this.tipMotora = tipMotora;
    }

    @Override
    public String prikaziPodatke() {
        return "Registarski broj: " + getRegistarskiBroj() + "\nMarka: " + getMarka() + "\nGodina proizvodnje: " + getGodinaProizvodnje() + "\nTip motora: " + getTipMotora();
    }

    @Override
    public void negativnaGodinaProizvodnje() throws Exception {
        if (getGodinaProizvodnje() < 0) {
            throw new Exception("Godina ne može biti negativna vrijednost!");
        }
    }

    @Override
    public void negativanBrojVrata() throws Exception {

    }
}
