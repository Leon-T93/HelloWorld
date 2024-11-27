public class Automobil extends Vozilo implements NeispravniPodaciException{


    private Integer brojVrata;




    public Automobil(String registarskiBroj, String marka, Integer godinaProizvodnje, Integer brojVrata) {
        super(registarskiBroj, marka, godinaProizvodnje);
        this.brojVrata = brojVrata;
    }



    public void setBrojVrata (Integer brojVrata) {
        this.brojVrata = brojVrata;
    }

    public Integer getBrojVrata () {
        return this.brojVrata;
    }

    @Override
    public String prikaziPodatke() {
        return "Registarski broj: " + getRegistarskiBroj() + "\nMarka: " + getMarka() + "\nGodina proizvodnje: " + getGodinaProizvodnje() + "\nBroj vrata: " + getBrojVrata();
    }

    @Override
    public void negativnaGodinaProizvodnje() throws Exception {
        if (getGodinaProizvodnje() < 0) {
            throw new Exception("Godina ne može biti negativna vrijednost!");
        }
    }

    @Override
    public void negativanBrojVrata()  throws Exception {
        if (getBrojVrata() < 0) {
            throw new Exception("Broj vrata ne može biti negativna vrijednost!");
        }
    }
}
