public class Strip implements Knjiga{

    private String naslov;

    private String autor;

    private Integer godinaIzdavanja;

    private Integer brojStranica;

    private Boolean stanje;



    public Strip (String naslov, String autor) {
        this.naslov= naslov;
        this.autor= autor;
    }

    public Strip (Integer godinaIzdavanja, Integer brojStranica) {
        if (godinaIzdavanja >= 1900 && godinaIzdavanja <= 2024){
            this.godinaIzdavanja= godinaIzdavanja;

            if (brojStranica > 0) {
                this.brojStranica=brojStranica;
            }
        }
    }

    public Strip (Boolean stanje) {
        this.stanje=stanje;
    }





    @Override
    public String getNaslov() {
        return "Naslov stripa: " + this.naslov;
    }

    @Override
    public String getAutor() {
        return "Autor stripa: " + this.autor;
    }

    @Override
    public String getGodinaIzdavanja() {
        return "Godina izdavanja stripa: " + this.godinaIzdavanja;
    }

    @Override
    public String getBrojStranica() {
        return "Broj stranica stripa: " + this.brojStranica;
    }

    @Override
    public String getStanje() {
        return "Stanje stripa: " + this.stanje;
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
