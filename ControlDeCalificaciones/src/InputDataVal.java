import java.util.Scanner;

public class InputDataVal {

    // Método para leer el nombre (Texto no vacío)
    public String leerTextoNoVacio(Scanner sc, String msg) {
        String texto;
        do {
            System.out.println(msg);
            texto = sc.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("Error: El nombre no puede estar vacío.");
            }
        } while (texto.isEmpty());
        return texto;
    }

    // Método para leer las calificaciones (Double en rango 0-100)
    public double leerDoubleEnRango(Scanner sc, String msg, double min, double max) {
        double valor;
        while (true) {
            System.out.println(msg);
            if (sc.hasNextDouble()) {
                valor = sc.nextDouble();
                if (valor >= min && valor <= max) {
                    return valor; // Retorna el valor si es válido [cite: 19]
                }
            }
            System.out.println("Error: El valor debe estar entre " + min + " y " + max);
            sc.nextLine(); // Limpiar el buffer del Scanner [cite: 27]
        }
    }

    // Método para leer la asistencia (Int en rango 0-100)
    public int leerIntEnRango(Scanner sc, String msg, int min, int max) {
        int valor;
        while (true) {
            System.out.println(msg);
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                if (valor >= min && valor <= max) {
                    return valor; // Retorna el valor si es válido [cite: 43]
                }
            }
            System.out.println("Error: Ingrese un número entero entre " + min + " y " + max);
            sc.nextLine(); // Limpiar el buffer
        }
    }

    // Método para leer el proyecto (Boolean true/false)
    public boolean leerBoolean(Scanner sc, String msg) {
        while (true) {
            System.out.println(msg);
            if (sc.hasNextBoolean()) {
                return sc.nextBoolean(); // Retorna true o false [cite: 51]
            } else {
                System.out.println("Error: Solo se acepta 'true' o 'false'.");
                sc.next(); // Limpiar entrada inválida [cite: 54]
            }
        }
    }
}