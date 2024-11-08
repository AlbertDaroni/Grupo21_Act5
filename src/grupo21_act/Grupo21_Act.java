package grupo21_act;

public class Grupo21_Act {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Suma: " + calculadora.sumar(7, 7));
        System.out.println("Resta: " + calculadora.restar(20, 14));
        System.out.println("División: " + calculadora.dividir(10, 0));
        System.out.println("Multiplicación: " + calculadora.multiplicar(10, 10));
    }
}

// Un comentario para ver si el proyecto ya está en GitHub