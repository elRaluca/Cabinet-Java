package main.Detalii;
public class Doctori extends Persoana {
    private String ora;

    public Doctori(String firstname, String lastname, String ora) {
        super(firstname, lastname);
        this.ora = ora;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }



    public String toString() { return super.toString() + "/" + ora; }
}