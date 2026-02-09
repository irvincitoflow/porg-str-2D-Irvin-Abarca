import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeService service = new GradeService();

        // 1. INPUT (Entradas)
        String nombre = leerTextoNoVacio(sc, "Ingrese nombre del alumno:");
        double p1 = leerDoubleEnRango(sc, "Calificación Parcial 1 (0-100):", 0, 100);
        double p2 = leerDoubleEnRango(sc, "Calificación Parcial 2 (0-100):", 0, 100);
        double p3 = leerDoubleEnRango(sc, "Calificación Parcial 3 (0-100):", 0, 100);
        int asistencia = leerIntEnRango(sc, "Asistencia (0-100):", 0, 100);
        boolean proyecto = leerBoolean(sc, "¿Entregó proyecto? (true/false):");

        // 2. PROCESS (Llamada a la lógica)
        double promedio = service.calcularPromedio(p1, p2, p3);
        double notaFinal = service.calcularFinal(promedio, asistencia);
        String estado = service.determinarEstado(notaFinal, asistencia, proyecto);

        // 3. OUTPUT (Imprimir reporte)
        imprimirReporte(nombre, p1, p2, p3, promedio, asistencia, proyecto, notaFinal, estado);
    }

    // --- MÉTODOS DE INPUT OBLIGATORIOS ---

    public static String leerTextoNoVacio(Scanner sc, String msg) {
        String texto;
        do {
            System.out.println(msg);
            texto = sc.nextLine().trim();
        } while (texto.isEmpty());
        return texto;
    }

    public static double leerDoubleEnRango(Scanner sc, String msg, double min, double max) {
        double valor;
        while (true) {
            System.out.println(msg);
            if (sc.hasNextDouble()) {
                valor = sc.nextDouble();
                if (valor >= min && valor <= max) break;
            }
            System.out.println("Error: Valor fuera de rango.");
            sc.nextLine(); // Limpiar buffer
        }
        return valor;
    }

    public static int leerIntEnRango(Scanner sc, String msg, int min, int max) {
        int valor;
        while (true) {
            System.out.println(msg);
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                if (valor >= min && valor <= max) break;
            }
            System.out.println("Error: Ingrese un entero válido.");
            sc.nextLine();
        }
        return valor;
    }

    public static boolean leerBoolean(Scanner sc, String msg) {
        while (true) {
            System.out.println(msg);
            if (sc.hasNextBoolean()) {
                return sc.nextBoolean();
            }
            System.out.println("Error: Solo acepta true o false.");
            sc.next();
        }
    }

    // --- MÉTODO DE OUTPUT ---

    public static void imprimirReporte(String nom, double p1, double p2, double p3,
                                       double prom, int asis, boolean proy, double fin, String est) {
        System.out.println("REPORTE FINAL DEL ALUMNO");
        System.out.println("Alumno: " + nom);
        System.out.printf("Parciales: %.1f, %.1f, %.1f\n", p1, p2, p3);
        System.out.printf("Promedio Parciales: %.2f\n", prom);
        System.out.println("Asistencia: " + asis + "%");
        System.out.println("Entregó Proyecto: " + (proy ? "SÍ" : "NO"));
        System.out.printf("Calificación Final: %.2f\n", fin);
        System.out.println("ESTADO: " + est);
    }
}