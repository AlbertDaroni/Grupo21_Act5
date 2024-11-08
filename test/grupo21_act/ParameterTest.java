package grupo21_act;

import org.junit.*;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class ParameterTest {
    private static Calculadora calculadora;
    private static Double a, b, resultadoEsperado;
    
    public ParameterTest(Double a, Double b, Double resultadoEsperado){
        ParameterTest.calculadora = new Calculadora();
        ParameterTest.a = a;
        ParameterTest.b = b;
        ParameterTest.resultadoEsperado = resultadoEsperado;
    }
    
    @Parameterized.Parameters
    public static Iterable<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
            {8.0, 7.0, 15.0}, 
            {2.0, 0.0, 20.0}, 
            {10.0, -1.0, -9.0}
        });
    }
    
    @BeforeClass
    @SuppressWarnings("empty-statement")
    public static void setUpClass() {
        System.out.println("\n\nHola desde la clase ParameterTest");
    }

    @Before
    public void setUp() {}

    @Test
    public void testSumar() {
        System.out.println("Método testSumar");
        Double result = calculadora.sumar(a, b);
        assertEquals(resultadoEsperado, result, 0.001);
    }

    @Test
    public void testRestar() {
        System.out.println("Método testRestar");
        Double result = calculadora.restar(a, b);
        assertEquals(resultadoEsperado, result, 0.001);
    }

    @Test
    public void testMultiplicar() {
        System.out.println("Método testMultiplicar");
        Double result = calculadora.multiplicar(a, b);
        assertEquals(resultadoEsperado, result);
    }

    @Test
    public void testDividir() {
        System.out.println("Método testDividir");
        Double result = calculadora.dividir(a, b);
        assertEquals(resultadoEsperado, result);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDividirEntre0() {
        System.out.println("Método testDividir");
        Double result = calculadora.dividir(a, b);
        assertEquals(resultadoEsperado, result);
    }

    @After
    public void tearDown() {}

    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operación ha finalizado");
    }
}