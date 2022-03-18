package leaseManager;

public class Pachtgegenstand {
    private int laufendeNummerGrundbuch;
    private String flurstueckNummer;
    private String gemarkung;
    private int groesse;
    private String wirtschaftsart;
    private String bezeichnungORflurlage;
    private double euro;

    public void setLaufendeNummerGrundbuch(int laufendeNummerGrundbuch) {
        this.laufendeNummerGrundbuch = laufendeNummerGrundbuch;
    }
    public int getLaufendeNummerGrundbuch() {
        return laufendeNummerGrundbuch;
    }
    public void setFlurstueckNummer(String flurstueckNummer) {
        this.flurstueckNummer = flurstueckNummer;
    }
    public String getFlurstueckNummer() {
        return flurstueckNummer;
    }
    public void setGemarkung(String gemarkung) {
        this.gemarkung = gemarkung;
    }
    public String getGemarkung() {
        return gemarkung;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setWirtschaftsart(String wirtschaftsart) {
        this.wirtschaftsart = wirtschaftsart;
    }

    public String getWirtschaftsart() {
        return wirtschaftsart;
    }

    public void setBezeichnungORflurlage(String bezeichnungORflurlage){
        this.bezeichnungORflurlage = bezeichnungORflurlage;
    }

    public String getBezeichnungORflurlage() {
        return bezeichnungORflurlage;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getEuro() {
        return euro;
    }
}
