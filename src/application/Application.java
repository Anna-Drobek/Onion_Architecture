package application;

import domain.Calculator;
import infrastructure.CalculatorImpl;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        CalculatorService calculatorService = new CalculatorServiceImpl(calculator);
        Scanner scanner = new Scanner(System.in);

        boolean end = false;
        while (!end) {
            System.out.println("Wybierz działanie:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("0. Zakończ program");

            int choice = scanner.nextInt();
            int result = 0;

            switch (choice) {
                case 1:
                    System.out.print("Podaj pierwszą liczbę: ");
                    int a = scanner.nextInt();
                    System.out.print("Podaj drugą liczbę: ");
                    int b = scanner.nextInt();
                    result = calculatorService.add(a, b);
                    break;
                case 2:
                    System.out.print("Podaj pierwszą liczbę: ");
                    a = scanner.nextInt();
                    System.out.print("Podaj drugą liczbę: ");
                    b = scanner.nextInt();
                    result = calculatorService.subtract(a, b);
                    break;
                case 3:
                    System.out.print("Podaj pierwszą liczbę: ");
                    a = scanner.nextInt();
                    System.out.print("Podaj drugą liczbę: ");
                    b = scanner.nextInt();
                    result = calculatorService.multiply(a, b);
                    break;
                case 4:
                    System.out.print("Podaj pierwszą liczbę: ");
                    a = scanner.nextInt();
                    System.out.print("Podaj drugą liczbę: ");
                    b = scanner.nextInt();
                    result = calculatorService.divide(a, b);
                    break;
                case 0:
                    end = true;
                    break;
                default:
                    System.out.println("INieprawidłowy wybór");
            }

            if (!end) {
                System.out.println("Wynik: " + result);
                System.out.print("Wciśnij dowolny klawisz aby kontynuować...");
                scanner.nextLine();
                scanner.nextLine();
            }
        }

        System.out.println("Exiting program");
    }
}
