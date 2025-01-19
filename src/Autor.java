public class Autor {

    String ime;
    String prezime;
    String nacionalonst;

    public Autor(String ime, String prezime, String nacionalonst) {
        this.ime = ime;
        this.prezime = prezime;
        this.nacionalonst = nacionalonst;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getNacionalonst() {
        return nacionalonst;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setNacionalonst(String nacionalonst) {
        this.nacionalonst = nacionalonst;
    }
}
