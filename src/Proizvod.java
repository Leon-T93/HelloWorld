import java.math.BigDecimal;

public class Proizvod {

    private String naziv;

    private BigDecimal cijena;

    private BigDecimal popust;

    private BigDecimal konacnaCijena;



    public Proizvod () {}


    public void dodajNaziv (String xNaziv){
        this.naziv= xNaziv;
    }

    public void dodajCijenu (BigDecimal xCijna){
        this.cijena= xCijna;
    }

    public void dodajPopust (BigDecimal xPopust){
        this.popust= xPopust;
    }

    public String dohvatiNaziv () {
        return this.naziv;
    }

    public BigDecimal dohvatiCijenu () {
        return this.cijena;
    }

    public BigDecimal dohvatiPopust() {
        return this.popust;
    }







    public BigDecimal dohvatikonacnuCijenu (){
        BigDecimal xRacunica = this.cijena.multiply(this.popust).divide(BigDecimal.valueOf(100));
        BigDecimal xRezultat = this.cijena.subtract(xRacunica);
        return xRezultat;
    }

    public void racunanjePopusta (){
        BigDecimal xRacunica = this.cijena.multiply(this.popust).divide(BigDecimal.valueOf(100));
        BigDecimal xRezultat = this.cijena.subtract(xRacunica);
        this.konacnaCijena = xRezultat;
    }

    public BigDecimal dohvatikonacnuCijenux (){
        return this.konacnaCijena;
    }






}
