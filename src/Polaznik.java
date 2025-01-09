public class Polaznik {

    private String ime;

    private String prezime;

    private String email;

    public Polaznik() {

    }

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIme() {
        return this.ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return " Ime: " +this.ime + " " + "Prezime: " + this.prezime ;
    }
}
