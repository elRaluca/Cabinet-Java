package main.Detalii;

public class Clienti extends Persoana {
    private TipulAfectiunii afectiune;
    private long telefon;

    public Clienti(String firstname, String lastname, TipulAfectiunii afectiune, long telefon) {
        super(firstname, lastname);
        this.afectiune = afectiune;
        this.telefon = telefon;
    }

    public TipulAfectiunii getAfectiune() {
        return afectiune;
    }

    public void setAfectiune(TipulAfectiunii afectiune) {
        this.afectiune = afectiune;
    }

    public long getTelefon() {
        return telefon;
    }

    public void setTelefon(long telefon) {
        this.telefon = telefon;
    }

    public String toString() {return super.toString() + " / " + afectiune + " / " + telefon;}

}



