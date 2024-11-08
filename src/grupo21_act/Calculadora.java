package grupo21_act;

public class Calculadora {
    public Calculadora () {}
    
    public Double sumar(double a, double b) {
        return a + b;
    }
    public Double restar(double a, double b) {
        return a - b;
    }
    public Double multiplicar(double a, double b) {
        return a * b;
    }
    public Double dividir(double a, double b) {
        if (b == 0) throw new ArithmeticException("División por cero");
        return a / b;
    }
}