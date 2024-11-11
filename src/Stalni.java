import java.math.BigDecimal;

public class Stalni extends OsnovniZaposlenik{

    private BigDecimal stalniBonusOver160h;



    public Stalni(){}



    public Stalni(String imeZaposlenika, BigDecimal osnovnaPlaca, BigDecimal brojRadnihSati) {
        super(imeZaposlenika, osnovnaPlaca, brojRadnihSati);
    }


    public void stalniIzracunBonusaAkoImaPreko160h () {
        BigDecimal izracun = getOsnovnaPlaca().multiply(getBrojRadnihSati()).multiply(BigDecimal.valueOf(15)).divide(BigDecimal.valueOf(100));
        this.stalniBonusOver160h = izracun;
    }


    public BigDecimal getStalniBonusOver160h () {
        return this.stalniBonusOver160h;
    }
}
