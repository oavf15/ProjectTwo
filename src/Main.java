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
            Polynomial.Term t1 = p1.getHighestTerm();
            Polynomial.Term t2 = p2.getHighestTerm();
            return Integer.compare(t1.exponent, t2.exponent);
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