public class Polaznik {

    private String Ime;

    private String Prezime;

    private Integer Dob;

    private String spol;


    public Polaznik (String xIme, String xPrezime) {
        this.Ime= xIme;
        this.Prezime= xPrezime;
    }

    public Polaznik (String xIme, String xPrezime, Integer xDob, String xspol) {
        this.Ime= xIme;
        this.Prezime= xPrezime;
        this.Dob= xDob;
        this.spol= xspol;
    }

    public Polaznik () {

    }

    public String dohvatiIme (){
        return this.Ime;
    }

    public String dohvatiPrezime (){
        return this.Prezime;
    }

    public void promjeniDob(Integer novaVrijednostDobi) {
        this.Dob = novaVrijednostDobi;
    }

    public void dodajIme(String postavljanjeImena) {
        this.Ime = postavljanjeImena;
    }

    public void dodajPrezime(String postavljanjePrezimena) {
        this.Prezime = postavljanjePrezimena;
    }



}
