package main.java.application;

import main.java.domain.Calculator;

public class CalculatorServiceImpl implements CalculatorService {

    private Calculator calculator;

    public CalculatorServiceImpl(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public float add(float a, float b) {
        return calculator.add(a, b);
    }

    @Override
    public float subtract(float a, float b) {
        return calculator.subtract(a, b);
    }

    @Override
    public float multiply(float a, float b) {
        return calculator.multiply(a, b);
    }

    @Override
    public float divide(float a, float b) {
        return calculator.divide(a, b);
    }
}
