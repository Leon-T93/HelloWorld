public class Student {

    private String ime;

    private String prezime;

    private Integer brIndexa;


    public Student (String ime, String prezime, Integer brIndexa){
        this.ime=ime;
        this.prezime=prezime;
        this.brIndexa=brIndexa;
    }

    public String getIme () {
        return this.ime;
    }

    public String getPrezime () {
        return this.prezime;
    }

    public Integer getBrIndexa () {
        return this.brIndexa;
    }
}
