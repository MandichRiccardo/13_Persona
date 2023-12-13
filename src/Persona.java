public class Persona {
    protected String nome;
    protected String cognome;
    protected String dataNascita;
    protected String codiceFiscale;

    public Persona(String nome, String cognome, String dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }
    public Persona() {
        this.nome = Interazione.strput("come mi chiamo?");
        this.cognome = Interazione.strput("qual'è il mio cognome?");
        this.dataNascita = Interazione.strput("quando sono Nato?");
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String chiSono() {
        return "sono una Persona";
    }
}
