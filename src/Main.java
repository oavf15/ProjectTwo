/*
Main.java
Oscar Vasquez-Flores
06/10/2023
This program reads a file containing polynomials and checks if the list of polynomials is sorted by strong order and weak order.
 */
import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;

public class Main {
    public static void main(String[] args) {
        // Define a comparator for comparing polynomials by their highest exponent
        Comparator<Polynomial> weakOrder = (p1, p2) -> {
            Iterator<Polynomial.Term> t1Iterator = p1.iterator();
            Iterator<Polynomial.Term> t2Iterator = p2.iterator();

            while (t1Iterator.hasNext() && t2Iterator.hasNext()) {
                Polynomial.Term t1 = t1Iterator.next();
                Polynomial.Term t2 = t2Iterator.next();

                if (t1.exponent != t2.exponent) {
                    return Integer.compare(t1.exponent, t2.exponent);
                } else if (t1.coefficient != t2.coefficient) {
                    return Double.compare(t1.coefficient, t2.coefficient);
                }
            }

            if (t1Iterator.hasNext()) {
                return 1;
            }

            if (t2Iterator.hasNext()) {
                return -1;
            }

            return 0;
        };

        // Implement JFileChooser to allow user to select input file
        JFileChooser chooser = new JFileChooser();
        // Create the list of polynomials
        List<Polynomial> polynomials = new ArrayList<>();
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    try {
                        Polynomial polynomial = new Polynomial(line);
                        polynomials.add(polynomial);
                        System.out.println(polynomial);
                    } catch (InvalidPolynomialSyntax e) {
                        System.out.println("Invalid polynomial syntax: " + e.getMessage());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // Check if the list is sorted by strong order
        boolean isSortedStrongOrder = OrderedList.checkSorted(polynomials);
        System.out.println("Is the list sorted by strong order? " + isSortedStrongOrder);

        // Check if the list is sorted by weak order
        boolean isSortedWeakOrder = OrderedList.checkSorted(polynomials, weakOrder);
        System.out.println("Is the list sorted by weak order? " + isSortedWeakOrder);
    }
}