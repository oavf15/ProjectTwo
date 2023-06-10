/*
OrderedList.java
Oscar Vasquez-Flores
06/10/2023
This program checks if a list is sorted by strong order and weak order.
 */
import java.util.Comparator;
import java.util.List;

public class OrderedList {
    public static <T extends Comparable<? super T>> boolean checkSorted(List<T> list) {
        return checkSorted(list, Comparator.naturalOrder());
    }

    public static <T> boolean checkSorted(List<T> list, Comparator<? super T> comparator) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (comparator.compare(list.get(i), list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}
