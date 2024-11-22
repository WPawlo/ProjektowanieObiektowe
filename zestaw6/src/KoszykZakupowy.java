import java.util.ArrayList;

public class KoszykZakupowy {
    ArrayList<Produkt> lista_produktow = new ArrayList<Produkt>();
    public KoszykZakupowy(Produkt... args) {
        for(int i=0;i<args.length;i++){
            lista_produktow.add(args[i]);
        }
    }
    public void dodajProdukt(Produkt produkt, int ilosc) {
        if(ilosc <= produkt.iloscNaMagazynie) {
            lista_produktow.add(produkt);
            produkt.iloscNaMagazynie-=ilosc;
        }
        else {
            System.out.println("Nie ma tyle produktu na magazynie!");
        }
    }
    public void wyswietlZawartoscKoszyka() {
        ArrayList<Produkt> unikalne_produkty = new ArrayList<Produkt>();
        for(int i=0;i<lista_produktow.size();i++) {
            if(unikalne_produkty.contains(lista_produktow.get(i))) {
            }
            else {
                unikalne_produkty.add(lista_produktow.get(i));
            }
        }
        for(int i=0;i<unikalne_produkty.size();i++) {
            int ilosc = 0;
            for(int j=0;j<lista_produktow.size();j++) {
                if(unikalne_produkty.get(i)==lista_produktow.get(j)) {
                    ilosc++;
                }
            }
            System.out.print(unikalne_produkty.get(i).nazwa);
            System.out.println(" , Ilosc: " + ilosc);
        }
    }
    public double obliczCalkowitaWartosc() {
        double suma = 0;
        for(int i=0;i<lista_produktow.size();i++) {
            suma += lista_produktow.get(i).cena;
        }
        return suma;
    }
}
