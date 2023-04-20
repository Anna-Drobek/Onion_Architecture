package application;

import domain.Calculator;
import infrastructure.CalculatorImpl;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        CalculatorService calculatorService = new CalculatorServiceImpl(calculator);

        // TODO: Use the calculatorService to perform calculations
    }
}
