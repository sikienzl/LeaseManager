package leaseManager;

public class Person {
    private String nachname;
    private String vorname;
    private String strasse;
    private String hausnummer;
    private int plz;
    private String stadt;


    public void setNachname(String nachname){
        this.nachname = nachname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public int getPlz() {
        return plz;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public String getStadt() {
        return stadt;
    }
}
