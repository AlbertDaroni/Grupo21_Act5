package grupo21_act;

import org.junit.*;

public class DivisionTest {
    @Test(expected = ArithmeticException.class)
    public void testDivisionEntreCero() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(10, 0);
    }
}