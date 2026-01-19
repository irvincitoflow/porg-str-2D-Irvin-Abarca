import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int limite = pedirEntero();
        int resultadoSuma = calcularSumaHastaN(limite);

        System.out.println("El resultado de la suma de los numeros es: " + resultadoSuma);
    }

    public static int pedirEntero() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Por favor, ingrese un numero entero positivo: ");

        int numero = lector.nextInt();
        return numero;
    }

    public static int calcularSumaHastaN(int limite) {
        int sumaTotal = 0;
        for (int i = 1; i <= limite; i++) {
            sumaTotal += i;
        }
        return sumaTotal;
    }
}