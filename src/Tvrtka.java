import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Tvrtka {

    private String ime; //ime tvrtke

    private List<Zaposlenik> zaposlenici;

    public Tvrtka () {}

    public Tvrtka (String ime, List<Zaposlenik> zaposlenici) {
        this.ime = ime;
        this.zaposlenici = new ArrayList<>();
    }

    public void setImeTvrtke (String ime) {
        this.ime = ime;
    }

    public String toString() {
        return "Zaposlenici: " + this.zaposlenici;
    }

    public List<Zaposlenik> getZaposlenici () {
        return this.zaposlenici;
    }


    public void dodajZaposlenika (Zaposlenik zaposlenik) {
        this.zaposlenici.add(zaposlenik);
    }

    public void ispisiZaposlenike () {
        System.out.println("Zaposlenici su: " + zaposlenici);
    }

    public void pronadjiNajvecuPlacu () {
        Double najvecaPlaca=0d;
        Zaposlenik zaposlenikSaNajvecomPlacom= null;

        for (int i=0; i < this.zaposlenici.size(); i++){
            if (zaposlenici.get(i).getPlaca() > najvecaPlaca){
                najvecaPlaca = zaposlenici.get(i).getPlaca();
                zaposlenikSaNajvecomPlacom = zaposlenici.get(i);
            }
        }

        System.out.println("Najvecu placu ima: " + zaposlenikSaNajvecomPlacom.getIme() + " " + zaposlenikSaNajvecomPlacom.getPrezime() + " , sa placom vrijednosti: "+ zaposlenikSaNajvecomPlacom.getPlaca());
    }


}
