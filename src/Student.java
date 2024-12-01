public class Student {

    private String ime;

    private String prezime;

    private Double prosjekOcjena;


    public Student(String ime, String prezime, Double prosjekOcjena) {
        this.ime = ime;
        this.prezime = prezime;
        this.prosjekOcjena = prosjekOcjena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Double getProsjekOcjena() {
        return prosjekOcjena;
    }

    public void setProsjekOcjena(Double prosjekOcjena) {
        this.prosjekOcjena = prosjekOcjena;
    }
}
