import java.math.BigDecimal;

public class TekuciRacun extends Racun{

    private BigDecimal kamatnaStopa;

    public TekuciRacun(String brojRacuna, BigDecimal stanje, String vlasnik,BigDecimal kamatnaStopa) {
        super(brojRacuna, stanje, vlasnik);
        this.kamatnaStopa= kamatnaStopa;
    }

    public BigDecimal obracunKamate(){
        BigDecimal racunanjeKamate= getStanje().multiply(kamatnaStopa).divide(BigDecimal.valueOf(100));
        BigDecimal novoStanjeSaKamatom= getStanje().add(racunanjeKamate);
        return novoStanjeSaKamatom;
    }

    public BigDecimal getKamatnaStopa(){
        return this.kamatnaStopa;
    }
}
