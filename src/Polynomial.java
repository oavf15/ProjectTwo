/*
Polynomial.java
Oscar Vasquez-Flores
06/10/2023
Program that reads a file containing polynomials and checks if the list of polynomials is sorted by strong order and weak order.
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Polynomial implements Comparable<Polynomial>, Iterable<Polynomial.Term> {
    Term head;

    public Polynomial(String input) {
        String[] parts = input.split(" ");
        if (parts.length % 2 != 0) {
            throw new InvalidPolynomialSyntax("Input string should have an even number of elements.");
        }
        for (int i = 0; i < parts.length; i += 2) {
            double coefficient;
            int exponent;
            try {
                coefficient = Double.parseDouble(parts[i]);
            } catch (NumberFormatException e) {
                throw new InvalidPolynomialSyntax("Coefficients must be real numbers.");
            }
            try {
                exponent = Integer.parseInt(parts[i + 1]);
            } catch (NumberFormatException e) {
                throw new InvalidPolynomialSyntax("Exponents must be integers.");
            }
            this.addTerm(coefficient, exponent);
        }

        Term current = head;
        int previousExponent = Integer.MAX_VALUE;
        while (current != null) {
            if (current.exponent >= previousExponent) {
                throw new InvalidPolynomialSyntax("Exponents must be in strictly descending order.");
            }
            previousExponent = current.exponent;
            current = current.next;
        }
    }


    private void addTerm(double coefficient, int exponent) {
        Term newTerm = new Term(coefficient, exponent);
        if (head == null || head.exponent < exponent) {
            newTerm.next = head;
            head = newTerm;
        } else {
            Term current = head;
            while (current.next != null && current.next.exponent > exponent) {
                current = current.next;
            }
            newTerm.next = current.next;
            current.next = newTerm;
        }
    }

    @Override
    public int compareTo(Polynomial p) {
        Term thisTerm = this.head;
        Term pTerm = p.head;
        while (thisTerm != null && pTerm != null) {
            if (thisTerm.exponent != pTerm.exponent) {
                return Integer.compare(thisTerm.exponent, pTerm.exponent);
            } else {
                int coefCompare = Double.compare(pTerm.coefficient, thisTerm.coefficient);
                if (coefCompare != 0) {
                    return coefCompare;
                }
            }
            thisTerm = thisTerm.next;
            pTerm = pTerm.next;
        }
        if (thisTerm != null) return 1;
        if (pTerm != null) return -1;
        return 0;
    }

    @Override
    public Iterator<Term> iterator() {
        return new PolynomialIterator();
    }

    @Override
    public String toString() {
        if (head == null) return "0";
        StringBuilder sb = new StringBuilder();
        for (Term term : this) {
            sb.append(term.toString());
        }
        return sb.toString();
    }

    private class PolynomialIterator implements Iterator<Term> {
        private Term current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Term next() {
            if (current == null) {
                throw new NoSuchElementException();
            }
            Term temp = current;
            current = current.next;
            return temp;
        }
    }

    public static class Term {
        double coefficient;
        int exponent;
        Term next;

        Term(double coefficient, int exponent) {
            this.coefficient = coefficient;
            this.exponent = exponent;
        }

        @Override
        public String toString() {
            String coeff = coefficient == 1.0 ? "" : String.valueOf(coefficient);
            String var = exponent == 0 ? "" : "x";
            String exp = exponent <= 1 ? "" : "^" + exponent;
            String termString = coeff + var + exp;
            return (next == null) ? termString : termString + " + ";
        }
    }
}