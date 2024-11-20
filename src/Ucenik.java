public class Ucenik {

    private String ime;
    private String prezime;
    private Integer prosjekOcjena;

    public Ucenik(String ime, String prezime, Integer prosjekOcjena) {
        this.ime = ime;
        this.prezime = prezime;
        this.prosjekOcjena = prosjekOcjena;
    }

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Integer getProsjekOcjena () {
        return this.prosjekOcjena;
    }



    @Override
    public String toString() {
        return "Zovem se: " + this.ime + " " + this.prezime;
    }

    public void ispisiInfo() {
        System.out.println("Zovem se: " + this.ime + " " + this.prezime + " . Moj prosjek ocjena je: " +this.prosjekOcjena);
    }
}