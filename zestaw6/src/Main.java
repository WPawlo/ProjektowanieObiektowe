public class Main {
    public static void main(String[] args) {
        Produkt mikrofon = new Produkt("Mikrofon", 300.0, 10);
        mikrofon.wyswietlInformacje();
        mikrofon.dodajDoMagazynu(10);
        mikrofon.wyswietlInformacje();
        mikrofon.usunZMagazynu(2);
        mikrofon.wyswietlInformacje();
        Produkt sluchawki = new Produkt("Sluchawki",100.0,20);
        KoszykZakupowy zakupy = new KoszykZakupowy(mikrofon, sluchawki, mikrofon);
        zakupy.wyswietlZawartoscKoszyka();
    }
}
