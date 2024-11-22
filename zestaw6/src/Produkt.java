public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;


    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje() {
        System.out.println("Produkt:" + nazwa);
        System.out.println("Cena:" + cena);
        System.out.println("Ilość na magazynie:" + iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ilosc) {
        if (ilosc > 0) {
            iloscNaMagazynie += ilosc;
            System.out.println("Dodano " + ilosc + " sztuk produktu " + nazwa + ".");
        } else {
            System.out.println("Błąd");
        }
    }

    public boolean usunZMagazynu(int ilosc) {
        if (ilosc > 0 && ilosc <= iloscNaMagazynie) {
            iloscNaMagazynie -= ilosc;
            System.out.println("Usunięto " + ilosc + " sztuk produktu" + nazwa + ".");
            return true;
        } else {
            System.out.println("Błąd");
            return false;
        }
    }
}