import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu para realizar operaciones matematicas");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular área de un rectángulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular área de un círculo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el peso (kg): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Ingresa la altura (m): ");
                    double altura = scanner.nextDouble();
                    System.out.println("Tu IMC es: " + calcularIMC(peso, altura));
                    break;

                case 2:
                    System.out.print("Ingresa la base: ");
                    double b = scanner.nextDouble();
                    System.out.print("Ingresa la altura: ");
                    double h = scanner.nextDouble();
                    System.out.println("El área del rectángulo es: " + calcularAreaRectangulo(b, h));
                    break;

                case 3:
                    System.out.print("Ingresa los grados Celsius: ");
                    double celsius = scanner.nextDouble();
                    System.out.println("Equivale a: " + convertirCelsiusAFahrenheit(celsius) + " °F");
                    break;

                case 4:
                    System.out.print("Ingresa el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("El área del círculo es: " + calcularAreaCirculo(radio));
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
            System.out.println();

        } while (opcion != 5);

        scanner.close();
    }

    /**
     * Calcula el índice de masa corporal basado en peso y altura.
     * @param peso Peso de la persona en kilogramos.
     * @param altura Altura de la persona en metros.
     * @return El valor del IMC calculado.
     */
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    /**
     * Calcula el área de un rectángulo multiplicando base por altura.
     * @param base La base del rectángulo.
     * @param altura La altura del rectángulo.
     * @return El área resultante.
     */
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
    /**
     * Convierte una temperatura de grados Celsius a Fahrenheit.
     * @param c Grados Celsius a convertir.
     * @return El resultado en grados Fahrenheit.
     */
    public static double convertirCelsiusAFahrenheit(double c) {
        return (c * 1.8) + 32;
    }
    /**
     * Calcula el área de un círculo usando el radio y la constante PI.
     * @param radio El radio del círculo.
     * @return El área total del círculo.
     */
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}