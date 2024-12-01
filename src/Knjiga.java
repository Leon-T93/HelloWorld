public class Knjiga {

    private String naslov;

    private String autor;

    private Integer godinaIzdanja;

    public Knjiga(String naslov, String autor, Integer godinaIzdanja) {
        this.naslov = naslov;
        this.autor = autor;
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getNaslov() {
        return naslov;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGodinaIzdanja(Integer godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }
}
