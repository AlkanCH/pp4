public class Pozycja {
    private String nazwa;
    private double wartosc_netto;
    private int vat;

    public Pozycja(String nazwa, double wartosc_netto, int vat) {
        this.nazwa = nazwa;
        this.wartosc_netto = wartosc_netto;
        this.vat = vat;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getWartosc_netto() {
        return wartosc_netto;
    }

    public int getVat() {
        return vat;
    }

    
}