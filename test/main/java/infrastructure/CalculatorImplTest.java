package main.java.infrastructure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorImplTest {

    private final CalculatorImpl calculator = new CalculatorImpl();

    @Test
    public void testAdd() {

        Assertions.assertEquals(4, calculator.add(2, 2));
        Assertions.assertEquals(-2, calculator.add(-1, -1));
        Assertions.assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(3, calculator.subtract(5, 2));
        Assertions.assertEquals(1, calculator.subtract(0, -1));
        Assertions.assertEquals(0, calculator.subtract(2, 2));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(6, calculator.multiply(2, 3));
        Assertions.assertEquals(0, calculator.multiply(0, 5));
        Assertions.assertEquals(-15, calculator.multiply(3, -5));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(4, calculator.divide(12, 3));
        Assertions.assertEquals(0, calculator.divide(0, 5));
        Assertions.assertEquals(-2, calculator.divide(10, -5));
    }

    @Test//test sprawdza, czy metoda rzuci wyjątek IllegalArgumentException, gdy próbujemy podzielić przez zero
    public void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(7, 0));
    }

}
