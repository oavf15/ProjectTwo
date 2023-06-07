import java.util.Iterator;

public class Polynomial implements Comparable<Polynomial>, Iterable<Polynomial.term>{
    private Node head;

    public static class Term {
        double coefficient;
        int exponent;

        public Term(double coefficient, int exponent) {
            this.coefficient = coefficient;
            this.exponent = exponent;
        }

        public String toString() {
            if (exponent == 0) {
                return "" + coefficient;
            } else if (exponent == 1) {
                return coefficient + "x";
            } else {
                return coefficient + "x^" + exponent;
            }
        }
    }

    @Override
    public int compareTo(Polynomial o) {
        return 0;
    }

    @Override
    public Iterator<Polynomial.term> iterator() {
        return null;
    }
}
