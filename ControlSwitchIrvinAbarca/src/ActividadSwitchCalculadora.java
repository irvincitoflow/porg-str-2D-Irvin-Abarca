import java.util.Scanner;

public class ActividadSwitchCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, resultado;

        System.out.println("Operaciones matemáticas:");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");

        System.out.print("¿Qué operación desea realizar? (1-4): ");
        int operacion = scanner.nextInt();

        if (operacion < 1 || operacion > 4) {
            System.out.println("Opción inválida");
        } else {

            System.out.print("Ingresar el primer valor: ");
            a = scanner.nextDouble();
            System.out.print("Ingresar el segundo valor: ");
            b = scanner.nextDouble();


            switch (operacion) {
                case 1:
                    resultado = a + b;
                    System.out.println("Operación elegida: Sumar");
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = a - b;
                    System.out.println("Operación elegida: Restar");
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = a * b;
                    System.out.println("Operación elegida: Multiplicar");
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    System.out.println("Operación elegida: Dividir");
                    if (b == 0) {
                        System.out.println("No se puede dividir entre cero");
                    } else {
                        resultado = a / b;
                        System.out.println("Resultado: " + resultado);
                    }
                    break;
            }
        }
    }
}