// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Test {
    public static void main(String[] args) {
        Persona p1 = new Persona("Mario", "Rossi", "12/12/2000");

        Studente p2 = new Studente("Gianni", "Verdi", "13/12/2000", 24);

        Persona p3 = new Studente("Vitoria", "Viola", "14/12/2000", 24);

        Persona p4 = p2;

        Studente p5 = (Studente) p1;

        System.out.println(p1);
        System.out.println("#######################");
        System.out.println(p2);
        System.out.println("#######################");
        System.out.println(p3);
        System.out.println("#######################");
        System.out.println(p4);
        System.out.println("#######################");
        System.out.println(p5);
        System.out.println("#######################");

        p2.iscrizione("Fermi", "4D");
    }
}