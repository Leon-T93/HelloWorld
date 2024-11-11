import java.math.BigDecimal;

public class OsnovniZaposlenik {

    private String imeZaposlenika;

    private BigDecimal osnovnaPlaca;

    private BigDecimal brojRadnihSati;



    public OsnovniZaposlenik (){}

    public OsnovniZaposlenik (String imeZaposlenika, BigDecimal osnovnaPlaca, BigDecimal brojRadnihSati) {
        this.imeZaposlenika= imeZaposlenika;
        this.osnovnaPlaca = osnovnaPlaca;
        this.brojRadnihSati = brojRadnihSati;
    }

    public void setImeZaposlenika (String xIme) {
        this.imeZaposlenika=xIme;
    }

    public void setOsnovnaPlaca (BigDecimal xOsvnovnaPlaca){
        this.osnovnaPlaca= xOsvnovnaPlaca;
    }

    public void setBrojRadnihSati (BigDecimal xBrojRadnihSati) {
        this.brojRadnihSati = xBrojRadnihSati;
    }





    public String getImeZaposlenika () {
        return this.imeZaposlenika;
    }

    public BigDecimal getOsnovnaPlaca () {
        return this.osnovnaPlaca;
    }

    public BigDecimal getBrojRadnihSati () {
        return this.brojRadnihSati;
    }

    public BigDecimal izracunPlace () {
        BigDecimal izracunPlace = this.osnovnaPlaca.multiply(this.brojRadnihSati);
        return izracunPlace;

    }

}
