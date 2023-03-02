package main.Detalii;
abstract class Persoana implements PersoanaInt{
    private String Firstname;
    private String Lastname;

    public Persoana(String firstname, String lastname) {
        Firstname = firstname;
        Lastname = lastname;
    }
    public  String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }



}
