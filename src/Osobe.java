public class Osobe {

    private String ime;

    private String prezime;

    private Integer clanskiBroj;


    public Osobe () {}

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setClanskiBroj(Integer clanskiBroj) {
        this.clanskiBroj = clanskiBroj;
    }

    public String getIme () {
        return this.ime;
    }

    public String getPrezime () {
        return this.prezime;
    }

    public Integer getClanskiBroj () {
        return this.clanskiBroj;
    }
}
