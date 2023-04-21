package main.java.application;

import main.java.domain.Calculator;
import main.java.infrastructure.CalculatorImpl;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        CalculatorService calculatorService = new CalculatorServiceImpl(calculator);
        try (Scanner scanner = new Scanner(System.in)) {
            boolean end = false;
            while (!end) {
                System.out.println("==================");
                System.out.println("Wybierz działanie:");
                System.out.println("==================");
                System.out.println("1. Dodawanie");
                System.out.println("2. Odejmowanie");
                System.out.println("3. Mnożenie");
                System.out.println("4. Dzielenie");
                System.out.println("0. Zakończ program");

                int choice = scanner.nextInt();
                float result = 0;

                switch (choice) {
                    case 1:
                        System.out.print("Podaj pierwszą liczbę: ");
                        float a = scanner.nextFloat();
                        System.out.print("Podaj drugą liczbę: ");
                        float b = scanner.nextFloat();
                        result = calculatorService.add(a, b);
                        break;
                    case 2:
                        System.out.print("Podaj pierwszą liczbę: ");
                        a = scanner.nextFloat();
                        System.out.print("Podaj drugą liczbę: ");
                        b = scanner.nextFloat();
                        result = calculatorService.subtract(a, b);
                        break;
                    case 3:
                        System.out.print("Podaj pierwszą liczbę: ");
                        a = scanner.nextFloat();
                        System.out.print("Podaj drugą liczbę: ");
                        b = scanner.nextFloat();
                        result = calculatorService.multiply(a, b);
                        break;
                    case 4:
                        System.out.print("Podaj pierwszą liczbę: ");
                        a = scanner.nextFloat();
                        System.out.print("Podaj drugą liczbę: ");
                        b = scanner.nextFloat();
                        result = calculatorService.divide(a, b);
                        break;
                    case 0:
                        end = true;
                        break;
                    default:
                        System.out.println("Nieprawidłowy wybór");
                }

                if (!end) {
                    System.out.println("Wynik: " + result);
                    System.out.print("Wciśnij dowolny klawisz aby kontynuować...");
                    scanner.nextLine();
                    scanner.nextLine();
                }
            }
        }

        System.out.println("Exiting program");
    }
}
