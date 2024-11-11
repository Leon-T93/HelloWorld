import java.math.BigDecimal;

public class Sezonski extends OsnovniZaposlenik{

    private BigDecimal sezonskiBonusOver200h;


    public Sezonski(){}



    public Sezonski(String imeZaposlenika, BigDecimal osnovnaPlaca, BigDecimal brojRadnihSati) {
        super(imeZaposlenika, osnovnaPlaca, brojRadnihSati);
    }



    public void sezonskiIzracunBonusaAkoImaPreko200h () {
        BigDecimal izracun = getOsnovnaPlaca().multiply(getBrojRadnihSati()).multiply(BigDecimal.valueOf(10)).divide(BigDecimal.valueOf(100));
        this.sezonskiBonusOver200h = izracun;
    }

    public BigDecimal getSezonskiBonusOver200h () {
        return this.sezonskiBonusOver200h;
    }
}
