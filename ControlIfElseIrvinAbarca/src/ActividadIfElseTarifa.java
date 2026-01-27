import java.util.Scanner;

public class ActividadIfElseTarifa {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = lectura.nextInt();
        System.out.print("¿Eres estudiante? (true/false): ");

        boolean esEstudiante = lectura.nextBoolean();

        int tarifa = 0;

        if (edad < 0 || edad > 120) {
            System.out.println("Edad inválida");
            return;
        }

        if (edad < 12) {
            tarifa = 50;
        } else if (edad >= 12 && edad <= 17) {
            if (esEstudiante) {
                tarifa = 60;
            } else {
                tarifa = 80;
            }
        }

        else {
            if (esEstudiante) {
                tarifa = 90;
            } else {
                tarifa = 120;
            }
        }

        System.out.println("Edad ingresada: " + edad);
        System.out.println("¿Es estudiante?: " + (esEstudiante ? "Sí" : "No"));
        System.out.println("Tarifa final: $" + tarifa);

        lectura.close();
    }
}
