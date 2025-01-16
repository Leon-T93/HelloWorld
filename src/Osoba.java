import java.util.Date;

public class Osoba {

    String ime;
    String prezime;
    String datum;

    public Osoba(String ime, String prezime, String datum) {
        this.ime = ime;
        this.prezime = prezime;
        this.datum = datum;
    }

    public String getIme() {
        return ime;
    }

    public String getDatum() {
        return datum;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}
