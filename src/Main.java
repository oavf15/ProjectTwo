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
        // determine if the list is sorted by strong order or weak order
        Comparator<Polynomial> strongOrder = Comparator.comparingInt(p -> p.head.exponent);
        Comparator<Polynomial> weakOrder = (p1, p2) -> p2.head.exponent - p1.head.exponent;

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
        // Check if the list of polynomials is sorted by strong order and weak order
        System.out.println("Strong order: " + OrderedList.checkSorted(polynomials, strongOrder));
        System.out.println("Weak order: " + OrderedList.checkSorted(polynomials, weakOrder));

    }
}