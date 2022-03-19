package leaseManager;

public class Pachtdauer {

    private String befristungText;
    private String datum;
    private int jahre;
    private int monate;

    public Pachtdauer() {
        createText(Befristung.UNBEFRISTET);
    }
    public Pachtdauer(String datum) {
        setDatum(datum);
        createText(Befristung.BEFRISTET_DATUM);
    }
    public Pachtdauer(int jahre, int monate) {
        setJahre(jahre);
        setMonate(monate);
        createText(Befristung.BEFRISTET_JAHREN_MONATE);
    }

    private void createText(Befristung befristung) {
        switch (befristung) {
            case UNBEFRISTET:
                setBefristungText("Das Pachtverhältnis wird abgeschlossen auf unbestimmte Dauer.");
                break;
            case BEFRISTET_DATUM:
                setBefristungText("Das Pachtverhältnis wird befristet abgeschlossen bis zum " + getDatum() +".");
                break;
            case BEFRISTET_JAHREN_MONATE:
                setBefristungText("Das Pachtverhältnis wird befristet abgeschlossen auf die Dauer von " + getJahre() +
                        " Jahre(n) und " + getMonate() + " Monate(n).");
                break;
        }
    }

    private void setDatum(String datum) {
        this.datum = datum;
    }

    private String getDatum() {
        return datum;
    }

    private void setJahre(int jahre) {
        this.jahre = jahre;
    }

    private int getJahre() {
        return jahre;
    }

    private void setMonate(int monate) {
        this.monate = monate;
    }

    private int getMonate() {
        return monate;
    }

    private void setBefristungText(String befristungText) {
        this.befristungText = befristungText;
    }

    public String getBefristungText() {
        return befristungText;
    }

}
