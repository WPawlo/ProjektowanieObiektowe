import java.util.ArrayList;
import java.util.Collections;

public class Zestaw5 {
    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> result = new ArrayList<>(tab1);
        result.addAll(tab2);
        return result;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> result2 = new ArrayList<>();
        int i = 0, j = 0;
        while (i < tab1.size() && j < tab2.size()) {
            result2.add(tab1.get(i++));
            result2.add(tab2.get(j++));
        }
        while (i < tab1.size()){
                result2.add(tab1.get(i++));
            }
        while (j < tab2.size()) {
            result2.add(tab2.get(j++));
        }
        return result2;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> result3 = new ArrayList<>(tab1);
        result3.addAll(tab2);
        Collections.sort(result3);
        return result3;
    }

    public static ArrayList<Character> toArrayList(String napis){
        ArrayList<Character> result4 = new ArrayList<>();
        for(char ch : napis.toCharArray()){
            result4.add(ch);
        }
        Collections.sort(result4);
        return result4;
    }

    public static ArrayList<Integer> toArrayList(int liczba){
        ArrayList<Integer> result4 = new ArrayList<>();
        String liczbastring = String.valueOf(liczba);
        for(char ch : liczbastring.toCharArray()){
            result4.add(Character.getNumericValue(ch));
        }
        Collections.sort(result4);
        return result4;
    }

    public static boolean checkChar(ArrayList<Character> tab, char znak){
        return tab.contains(znak);
    }

    public static boolean checkDigit(ArrayList<Integer> tab, int cyfra){
        return tab.contains(cyfra);
    }

    public static int countChar(ArrayList<Character> tab, char znak) {
        int count = 0;
        for(Character element : tab){
                if(element == znak){
                    count++;
                }
            }
        return count;
    }

    public static int countDigit(ArrayList<Integer> tab, int cyfra){
        int count = 0;
        for(int element : tab){
            if(element == cyfra){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        ArrayList<Integer> tab1 = new ArrayList<>();
        tab1.add(1);
        tab1.add(3);
        tab1.add(2);

        ArrayList<Integer> tab2 = new ArrayList<>();
        tab2.add(4);
        tab2.add(6);
        tab2.add(5);

        String napis = "kokos";
        int liczba = 45231;

        ArrayList<Integer> result = append(tab1, tab2);
        System.out.println(result);
        ArrayList<Integer> result2 = merge(tab1, tab2);
        System.out.println(result2);
        ArrayList<Integer> result3 = mergeSorted(tab1, tab2);
        System.out.println(result3);
        ArrayList<Character> charresult4 = toArrayList(napis);
        System.out.println(charresult4);
        ArrayList<Integer> intresult4 = toArrayList(liczba);
        System.out.println(intresult4);
        System.out.println(checkDigit(intresult4, 5));
        System.out.println(checkChar(charresult4, 'a'));
        System.out.println(countChar(charresult4, 'k'));
        System.out.println(countDigit(intresult4, 2));
    }
}
