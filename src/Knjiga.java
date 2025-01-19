public class Knjiga {

    String naslov;
    Integer godinaIzdanja;
    Integer autorID;

    public Knjiga(String naslov, Integer godinaIzdanja, Integer autorID) {
        this.naslov = naslov;
        this.godinaIzdanja = godinaIzdanja;
        this.autorID = autorID;
    }

    public String getNaslov() {
        return naslov;
    }

    public Integer getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public Integer getAutorID() {
        return autorID;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setGodinaIzdanja(Integer godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public void setAutorID(Integer autorID) {
        this.autorID = autorID;
    }
}
