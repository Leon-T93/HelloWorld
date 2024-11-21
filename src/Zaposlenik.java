public class Zaposlenik {

    private String ime;

    private String prezime;

    private Double placa;

    public Zaposlenik () {}

    public Zaposlenik (String ime, String prezime, Double placa) {
        this.ime = ime;
        this.prezime = prezime;
        this.placa = placa;
    }


    public Double getPlaca () {
        return this.placa;
    }

    public String getIme () {
        return this.ime;
    }

    public String getPrezime () {
        return this.prezime;
    }

    public void setIme (String ime) {
        this.ime = ime;
    }

    public void setPrezime (String prezime) {
        this.prezime = prezime;
    }

    public void setPlaca (Double placa) {
        this.placa = placa;
    }


}
