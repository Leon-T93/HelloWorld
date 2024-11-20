public class Main {
    public static void main(String[] args) {
        Razred razred = new Razred("1B", "Petar");

        Ucenik ucenik1 = new Ucenik("Ana", "Anic", 4);
        razred.dodajUcenika(ucenik1);

        Ucenik ucenik2 = new Ucenik("Ivan", "Ivic", 3);
        razred.dodajUcenika(ucenik2);

        Ucenik ucenik3 = new Ucenik("Marko", "Maric", 2);
        razred.dodajUcenika(ucenik3);

        Ucenik ucenik4 = new Ucenik("Filip", "Filipic", 5);
        razred.dodajUcenika(ucenik4);

        for (Ucenik ucenik : razred.getUcenici()) {
            ucenik.ispisiInfo();
        }

        razred.pronadiNajboljegUcenikaPoProsjekuOcjena();






    }
}