import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Comparator<Polynomial> weakOrder = (p1, p2) -> {
            if (p1.getHighestExponent() < p2.getHighestExponent()) {
                return -1;
            } else if (p1.getHighestExponent() > p2.getHighestExponent()) {
                return 1;
            } else {
                return 0;
            }
        };

    }
}