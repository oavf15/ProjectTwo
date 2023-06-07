import java.util.Iterator;
import java.util.NoSuchElementException;

public class Polynomial implements Comparable<Polynomial>, Iterable<Polynomial.term> {
    private Node head;

    // Term class
    public static class Term {
        double coefficient;
        int exponent;

        public Term(double coefficient, int exponent) {
            this.coefficient = coefficient;
            this.exponent = exponent;
        }

        public String toString() {
            if (exponent == 0) {
                return String.valueOf(coefficient);
            } else if (exponent == 1) {
                return coefficient + "x";
            } else {
                return coefficient + "x^" + exponent;
            }
        }
    }

    // Node class
    private static class Node {
        Term term;
        Node next;

        public Node(Term term, Node next) {
            this.term = term;
            this.next = next;
        }
    }

    // Constructor
    public Polynomial(String input) {

    }

    @Override
    public Iterator<Polynomial.term> iterator() {
        return new Iterator<Term>() {
            @Override
            public boolean hasNext() {
                return current = head;
            }
            @Override
            public Term next() {
                if (current == null) throw new NoSuchElementException();
                Term term = current.term;
                current = current.next;
                return term;
            }
        };
    }

    @Override
    public int compareTo(Polynomial o) {
        return 0;
    }
}
