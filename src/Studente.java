public class Studente extends Persona{
    protected String classe;
    protected String scuola;
    protected int anni;

    public Studente(String nome, String cognome, String dataNascita, int anni) {
        super(nome, cognome, dataNascita);
        this.anni = anni;
    }

    public Studente() {
        super();
        this.anni = Interazione.input("quanti anni hai?");
    }

    public String chiSono() {
        return "sono uno studente";
    }

    public void iscrizione(String scuola, String classe){
        this.scuola = scuola;
        this.classe = classe;
    }
    public void iscrizione(){
        this.scuola = Interazione.strput();
        this.classe = classe;
    }
}
