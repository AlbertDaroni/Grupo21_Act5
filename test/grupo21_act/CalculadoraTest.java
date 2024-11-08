package grupo21_act;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculadoraTest {
    private static Calculadora calculadora;

    public CalculadoraTest() {}

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Bienvenido");
        calculadora = new Calculadora();
    }

    @Before
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void testSumar() {
        System.out.println("Método testSumar");
        double a = 7.0;
        double b = 7.0;
        Double expResult = 14.0;
        Double result = calculadora.sumar(a, b);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    public void testRestar() {
        System.out.println("Método testRestar");
        double a = 20.0;
        double b = 14.0;
        Double expResult = 6.0;
        Double result = calculadora.restar(a, b);
        assertEquals(expResult, result, 0.001);
    }

    @Test
    public void testMultiplicar() {
        System.out.println("Método testMultiplicar");
        double a = 10.0;
        double b = 10.0;
        Double expResult = 100.0;
        Double result = calculadora.multiplicar(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDividir() {
        System.out.println("Método testDividir");
        double a = 10.0;
        double b = 1.0;
        Double expResult = 10.0;
        Double result = calculadora.dividir(a, b);
        assertEquals(expResult, result);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDividirEntre0() {
        System.out.println("Método testDividir");
        double a = 10.0;
        double b = 0.0;
        Double result = calculadora.dividir(a, b);
    }

    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operación ha finalizado");
    }
}