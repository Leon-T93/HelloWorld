import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Knjiznica implements RadsKnjigama {

    private List<Osobe> clanovi;

    private List<Knjige> dostupneKnjige;


    public Knjiznica(List<Osobe> clanovi, List<Knjige> dostupneKnjige) {
        this.clanovi = new ArrayList<>();
        this.dostupneKnjige = new ArrayList<>();
    }

    public List<Osobe> getClanovi() {
        return this.clanovi;
    }

    public void setClanovi(List<Osobe> clanovi) {
        this.clanovi = clanovi;
    }

    public void dodajClanove(Osobe osobe) {
        this.clanovi.add(osobe);
    }

    public List<Knjige> getDostupneKnjige() {
        return this.dostupneKnjige;
    }

    public void setDostupneKnjige(List<Knjige> dostupneKnjige) {
        this.dostupneKnjige = dostupneKnjige;
    }


    @Override
    public void dodajKnjigu() {

    }

    @Override
    public void posudiKnjigu() {

    }
}
