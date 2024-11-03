public class Pas {

    // varijabla u koju se sprema vrijednost imena svakog psa
    private String ime;

    // varijabla u koju se sprema vrijednost pasmine svakog psa
    private String pasmina;

    private Integer godina;

    // konstruktor koji prima ime i pasminu psa kao parametre te postavlja prosljedene vrijednosti na odgovarajuce varijable
    public Pas(String imePsa, String pasminaPsa) {
        this.ime = imePsa;
        this.pasmina = pasminaPsa;
    }


    // konstruktor koji prima ime  psa kao parametar te postavlja prosljedenu vrijednost na odgovarajucu varijablu
    public Pas(String imePsa) {
        this.ime = imePsa;
    }

    public Pas(String imePsa, String pasminaPsa, Integer godina) {
        this.ime = imePsa;
        this.pasmina = pasminaPsa;
        this.godina = godina;
    }

    public Pas(String ime, Integer godina, String pasmina) {
        this.ime = ime;
        this.godina = godina;
        this.pasmina = pasmina;
    }

    public Pas() {
    }

    public void glasujSe() {
        System.out.println("Vau vau");
    }

    public String dohvatiIme() {
        return this.ime;
    }

    public String dohvatiPasminu() {
        return this.pasmina;
    }

    public String dohvatiGodinuUStringu() {
        return this.godina.toString();
    }

    public Integer dohvatiGodinu() {
        return this.godina;
    }

    public void promjeniGodinu(Integer novaVrijednostGdoine) {
        this.godina = novaVrijednostGdoine;
    }
}
