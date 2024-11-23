public class Knjige {

    private String naziv;

    private Integer kolicinaKnjigeNaStanju;

    public String getNaziv () {
        return this.naziv;
    }

    public Integer getKolicinaKnjigeNaStanju () {
        return this.kolicinaKnjigeNaStanju;
    }

    public void setNazivKnjige (String nazivKnjige) {
        this.naziv = nazivKnjige;
    }

    public void setKolicinaKnjigeNaStanju (Integer kolicinaKnjigeNaStanju) {
        this.kolicinaKnjigeNaStanju = kolicinaKnjigeNaStanju;
    }
}
