public class Student {

    private String ime;

    private String prezime;

    private Integer brIndexa;


    public Student (String ime, String prezime, Integer brIndexa){
        this.ime=ime;
        this.prezime=prezime;
        this.brIndexa=brIndexa;
    }


    public String getStudentInfo () {
        return "Ime: "+ this.ime + "\n" + "Prezime: " + this.prezime + "\n"+ "Broj Indexa: "+ this.brIndexa;
    }
}
