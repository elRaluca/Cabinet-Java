package main.Programari;
import main.Detalii.Clienti;
import main.Detalii.Doctori;
import java.io.*;
public class Programare {
    
    public void adaugareClienti(Clienti clienti) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("n", true));
            writer.append(clienti.getFirstname()).append(" ");
            writer.append(clienti.getLastname()).append(" ");
            writer.append(clienti.getAfectiune().toString()).append(" ");
            writer.append(Long.toString(clienti.getTelefon())).append("\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void adaugareDoctori(Doctori doctori) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("n", true));
            writer.append(doctori.getFirstname()).append(" ");
            writer.append(doctori.getLastname()).append(" ");
            writer.append(doctori.getOra()).append(" ");
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}


