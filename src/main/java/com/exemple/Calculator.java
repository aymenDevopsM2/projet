
package com.exemple;

public class Calculator {

    // Addition
    public int addition(int a, int b) {
        return a + b;
    }

    // Soustraction
    public int soustraction(int a, int b) {
        return a - b;
    }

    // Multiplication
    public int multiplication(int a, int b) {
        return a * b;
    }

    // Division
    public double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException(
                "Division par zéro impossible"
            );
        }

        return (double) a / b;
    }
}
