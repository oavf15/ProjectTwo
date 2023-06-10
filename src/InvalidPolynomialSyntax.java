/*
InvalidPolynomialSyntax.java
Oscar Vasquez-Flores
06/10/2023
Checks polynomial and throws exception if invalid syntax is found.
 */
public class InvalidPolynomialSyntax extends RuntimeException {
    public InvalidPolynomialSyntax(String message) {
        super(message);
    }
}
