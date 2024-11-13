public class Roman implements Knjiga{

    private String naslov;

    private String autor;

    private Integer godinaIzdavanja;

    private Integer brojStranica;

    private Boolean stanje;


    public Roman (String naslov, String autor) {
        this.naslov= naslov;
        this.autor= autor;
    }

    public Roman (Integer godinaIzdavanja, Integer brojStranica) {
        if (godinaIzdavanja >= 1900 && godinaIzdavanja <= 2024){
            this.godinaIzdavanja= godinaIzdavanja;

        if (brojStranica > 0) {
            this.brojStranica=brojStranica;
        }
        }
    }

    public Roman (Boolean stanje) {
        this.stanje=stanje;
    }





    @Override
    public String getNaslov() {
        return "Naslov romana: " + this.naslov;
    }

    @Override
    public String getAutor() {
        return "Autor romana: " + this.autor;
    }

    @Override
    public String getGodinaIzdavanja() {
        return "Godina izdavanja romana: " + this.godinaIzdavanja;
    }

    @Override
    public String getBrojStranica() {
        return "Broj stranica romana: " + this.brojStranica;
    }

    @Override
    public String getStanje() {
        return "Stanje romana: " + this.stanje;
    }

    @Override
    public void posudi() {
        this.stanje = stanje;
    }

    @Override
    public void vrati() {
        this.stanje=  stanje;
    }
}
