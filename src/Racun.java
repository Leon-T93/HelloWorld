import java.math.BigDecimal;

public class Racun {

    private String brojRacuna;

    private BigDecimal stanje;

    private String vlasnik;

    public Racun (String brojRacuna, BigDecimal stanje, String vlasnik){
        this.brojRacuna=brojRacuna;
        this.stanje=stanje;
        this.vlasnik=vlasnik;
    }

    public void uplataNaRacun (BigDecimal uplacenoNaRacun){
        BigDecimal novoStanjeRacuna= this.stanje.add(uplacenoNaRacun);
        this.stanje= novoStanjeRacuna;
    }

    public void isplataSaRacuna (BigDecimal isplatitiSaRacuna){
        BigDecimal novoStanjeRacuna= this.stanje.subtract(isplatitiSaRacuna);
        this.stanje= novoStanjeRacuna;
    }

    public BigDecimal getStanje(){
        return this.stanje;
    }


}
