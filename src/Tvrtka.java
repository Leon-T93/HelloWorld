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
        Zaposlenik zaposlenik;
        for (int i=0; i < this.zaposlenici.size(); i++){
            zaposlenik = zaposlenici.get(i);
            System.out.println("Zaposlenici su: " + zaposlenik.getIme() + " " + zaposlenik.getPrezime() + " , sa placom vrijednosti: "+ zaposlenik.getPlaca());

        }
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
