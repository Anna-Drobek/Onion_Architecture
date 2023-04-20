package application;

import domain.Calculator;

public class CalculatorServiceImpl implements CalculatorService {

    private Calculator calculator;

    public CalculatorServiceImpl(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        return calculator.add(a, b);
    }

    @Override
    public int subtract(int a, int b) {
        return calculator.subtract(a, b);
    }

    @Override
    public int multiply(int a, int b) {
        return calculator.multiply(a, b);
    }

    @Override
    public int divide(int a, int b) {
        return calculator.divide(a, b);
    }
}
