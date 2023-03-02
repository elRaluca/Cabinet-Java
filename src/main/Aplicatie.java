package main;
import main.Detalii.Clienti;
import main.Detalii.Doctori;
import main.service.CabinetService;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Aplicatie {
    public static void main(String[] args) throws IOException {
        CabinetService cabinetService = new CabinetService();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Scrie una dintre urmatoarele comenzi: Adauga Client, Verifica Client, Verifica Programari, Numar De Programari, Exit");
            String str = scanner.nextLine();
            switch (str) {
                case "Adauga Client": {
                    adaugareDoctori(cabinetService, scanner);
                    adaugareClienti(cabinetService, scanner);
                    break;
                }
                case "Verifica Client": {
                    verificare();
                    break;
                }
                case "Verifica Programari": {
                    verificareProgramari();
                    break;
                }
                case "Numar De Programari":{
                    numarDeProgramari();
                    break;
                }
                case "exit": {
                    System.out.println("Programul se inchide");
                    System.exit(0);

                }

                default:
                    System.out.println("Comanda nu exista");
            }
        }

    }

    private static void adaugareClienti(CabinetService cabinetService, Scanner scanner) {
        System.out.println("Adaugati:Nume Client/Prenume Client/Afectiune:Ortopedie-Stomatologie/Telefon");
        try {
            Clienti clienti = cabinetService.build(scanner.nextLine());
            cabinetService.adaugareClienti(clienti);
        } catch (NumberFormatException e) {
            System.out.println("invalid");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("not enough");
        }
    }

    private static void adaugareDoctori(CabinetService cabinetService, Scanner scanner) {
        System.out.println("Adaugati:Nume Doctor/Prenume Doctor/Ora");
        try {
            Doctori doctori = cabinetService.adaugareDoctori(scanner.nextLine());
            cabinetService.adaugareDoctori(doctori);
        } catch (NumberFormatException e) {
            System.out.println("invalid");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("not enough");
        }
    }

    public static void verificare() throws IOException {
        String line, a, c;
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("n"));
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] pieces = line.split(" ");
            a = pieces[3];
            c = pieces[4];
            Scanner sc = new Scanner(System.in);
            System.out.println("Nume Client");
            String b = sc.next();
            System.out.println("Prenume Client");
            String d = sc.next();
            if (b.equals(a) && d.equals(c)) {
                System.out.println("Programarea exista");
                break;
            } else {
                System.out.println("Programarea nu exista");
                break;
            }
        }
    }

    public static void verificareProgramari() throws IOException {
        String line, a,c;
        int m = 0;
        boolean k = true;
            System.out.println("Nume Doctor");
            Scanner scanner = new Scanner(System.in);
            String b1 = scanner.nextLine();
            BufferedReader reader;
            reader = new BufferedReader(new FileReader("n"));
            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                String[] pieces = line.split(" ");
                a = pieces[0];
                if (Objects.equals(a, b1)) {
                    m = m + 1;
                }
            }
            Map<String, Integer> programariDoctori = new HashMap<>();
            programariDoctori.put(b1, m);
            for (String doctor : programariDoctori.keySet()) {
                System.out.println(doctor + " are " + programariDoctori.get(doctor) + " programari ");
            }

        }

    public static void numarDeProgramari() throws IOException {
        String line, a;
        int m = 0, n = 0;
        ArrayList<Integer> al = new ArrayList<Integer>(50);
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("n"));
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] pieces = line.split(" ");
            a = pieces[5];
            if (Objects.equals(a, "Ortopedie")) {
                n = n + 1;
                al.add(0, n);
            } else {
                m = m + 1;
                al.add(1, m);
            }
        }
        System.out.println("Numar total de programari la cabinetul de Ortopedie");
        System.out.println(al.get(0));
        System.out.println("Numar total de programari la cabinetul de Stomtologie");
        System.out.println(al.get(1));

    }
}



