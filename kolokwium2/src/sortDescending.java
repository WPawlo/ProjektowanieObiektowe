import java.util.Arrays;
import java.util.Comparator;

class sortDescending {
    public static <T extends Comparable<T>> void sortDescending(T[] array){
        Arrays.sort(array, Comparator.reverseOrder());
    }
}
