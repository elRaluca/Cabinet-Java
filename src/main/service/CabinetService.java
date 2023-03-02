package main.service;
import main.Detalii.Clienti;
import main.Detalii.Doctori;
import main.Detalii.TipulAfectiunii;
import main.Programari.Programare;
public class CabinetService {
    private Programare programare;

    public CabinetService() {
        this.programare = new Programare();
    }

    public Clienti build(String clientiDetalii) {
        String[] attributes = clientiDetalii.split("/");
        String Firstname= attributes[0];
        String Lastname=attributes[1];
        TipulAfectiunii afectiune = TipulAfectiunii.valueOf(attributes[2]);
        long telefon = Long.valueOf(attributes[3]);
        return new Clienti(Firstname, Lastname,  afectiune, telefon);
    }

    public Doctori adaugareDoctori(String doctoriDetalii) {
        String[] attributes = doctoriDetalii.split("/");
        String Firstname= attributes[0];
        String Lastname=attributes[1];
        String ora=attributes[2];
        return new Doctori(Firstname, Lastname, ora);

    }
    public void adaugareClienti(Clienti clienti) {programare.adaugareClienti(clienti);}
    public void adaugareDoctori(Doctori doctori) {programare.adaugareDoctori(doctori);}
}


