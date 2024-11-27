public abstract class Vozilo {

    private String registarskiBroj;

    private String marka;

    private Integer godinaProizvodnje;

    public Vozilo () {}

    public abstract String prikaziPodatke ();



    public Vozilo (String registarskiBroj, String marka, Integer godinaProizvodnje) {
        this.registarskiBroj = registarskiBroj;
        this. marka = marka;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public void setRegistarskiBroj (String registarskiBroj) {
        this.registarskiBroj = registarskiBroj;
    }

    public void setMarka (String marka) {
        this.marka = marka;
    }

    public void setGodinaProizvodnje (Integer godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getRegistarskiBroj () {
        return this.registarskiBroj;
    }

    public String getMarka () {
        return this.marka;
    }

    public Integer getGodinaProizvodnje () {
        return this.godinaProizvodnje;
    }



}
