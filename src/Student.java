public class Student {

    private String ime;

    private String prezime;

    private String brojIndeksa;

    private Double prosjekOcjena;


    public Student (String xime, String xprezime, String xbrojIndeksa, Double xprosjekOcjena) {
        this.ime= xime;
        this.prezime=xprezime;
        this.brojIndeksa=xbrojIndeksa;
        this.prosjekOcjena=xprosjekOcjena;
    }

    public void dodajIme (String xIme){
        this.ime= xIme;
    }

    public void dodajPrezime (String xPrezime){
        this.prezime= xPrezime;
    }

    public void dodajBrojIndeksa (String xBrojIndeksa){
        this.brojIndeksa= xBrojIndeksa;
    }

    public void dodajProsjekOcjena (Double xProsjekOcjena){
        this.prosjekOcjena= xProsjekOcjena;
    }




    public String getIme () {
        return this.ime;
    }

    public String getPrezime () {
        return this.prezime;
    }

    public String getBrojIndeksa () {
        return this.brojIndeksa;
    }

    public Double getProsjekOcjena () {
        return this.prosjekOcjena;
    }




}
