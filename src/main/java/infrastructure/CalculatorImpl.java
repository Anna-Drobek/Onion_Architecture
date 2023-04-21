package main.java.infrastructure;

import main.java.domain.Calculator;

public class CalculatorImpl implements Calculator {

    @Override
    public float add(float a, float b) {
        return a + b;
    }

    @Override
    public float subtract(float a, float b) {
        return a - b;
    }

    @Override
    public float multiply(float a, float b) {
        return a * b;
    }

    @Override
    public float divide(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("Nie możemy dzielić przez zero!!!");
        }
        return a / b;
    }
}
