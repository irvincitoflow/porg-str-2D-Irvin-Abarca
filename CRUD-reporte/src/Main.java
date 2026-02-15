import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[25];
        int opc;
        do {
            System.out.println("----------------Menu-------------------");
            System.out.println("1-alta alumno");
            System.out.println("2-buscar por ID (solo activos)");
            System.out.println("3-actualizar promedio por ID (solo activos)");
            System.out.println("4-baja logica por ID");
            System.out.println("5-listar activos");
            System.out.println("6-Reportes");
            System.out.println("0-Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    AlumnoService.alta(sc, alumnos);
                    break;
                case 2:
                    AlumnoService.buscarPorId(sc, alumnos);
                    break;
                case 3:
                    AlumnoService.actualizarPromedio(sc, alumnos);
                    break;
                case 4:
                    AlumnoService.bajaLogica(sc, alumnos);
                    break;
                case 5:
                    AlumnoService.listarActivos(alumnos);
                    break;
                case 6:
                    AlumnoService.reportes(alumnos);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opc != 0);
    }
}