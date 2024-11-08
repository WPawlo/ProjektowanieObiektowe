public class Kolokwium {
    public static boolean dokladnosc(int x,int y,int k){
        int roznica = x - y;
        if(roznica == k)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static int najblizszySasiad(int S){
        int sqrt = (int) Math.sqrt(S);
        return sqrt;
    }

    public static double pierwiastek(double S, int n, int k){
        double result = Math.pow(S, 1.0/n);
        double a = Math.pow(10, k);
        result = Math.round(result * a)/ a;
        return result;
    }

    public static int podciag(int[] tab) {
        if (tab.length == 0){
            return 0;
        }
        int max = 1;
        int now = 1;
        for (int i = 1; i < tab.length; i++){
            if (tab[i] < tab[i - 1]){
                now++;
                max = Math.max(max, now);
            }
            else{
                now = 1;
            }
        }
        return max;
    }

    public static int podciag2(int[] tab, int r){
        if (tab.length == 0){
            return 0;
        }
        int max = 1;
        int now = 1;
        for (int i = 1; i < tab.length; i++){
            if (tab[i - 1] - tab[i] == r) {
                now++;
                max = Math.max(max, now);
            }
            else{
                now = 1;
            }
        }
        return max;
    }

    public static boolean czyPalindrom(int n){
        if (n < 0) {
            return false;
        }
        int ory = n;
        int odw = 0;
        while (n != 0) {
            int ost = n % 10;
            odw = odw * 10 + ost;
            n /= 10;
        }
        return ory == odw;
    }

    public static boolean palindromLiczbowy(int m){
        int min = (int) Math.pow(10, m - 1);
        int max = (int) Math.pow(10, m) - 1;
        for (int i = min; i <= max; i++){
            for (int j = min;j <= max; j++){
                int iloczyn = i * j;
                if(czyPalindrom(iloczyn)){
                    System.out.println(i + " x " + j + " = " + iloczyn);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Zadanie 1:");
        System.out.println(dokladnosc(10, 5, 5));
        System.out.println("Zadanie 2:");
        System.out.println(najblizszySasiad(20));
        System.out.println("Zadanie 3:");
        System.out.println(pierwiastek(24,3,3));
        int[] tab = {1, 2, 0, 7, 5, 3, 2};
        System.out.println("Zadanie 4:");
        System.out.println(podciag(tab));
        System.out.println("Zadanie 5:");
        System.out.println(podciag2(tab, 2));
        System.out.println("Zadanie 6:");
        System.out.println(czyPalindrom(12321));
        System.out.println("Zadanie 7:");
        palindromLiczbowy(2);
    }
}