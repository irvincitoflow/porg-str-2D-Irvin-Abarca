import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       Scanner sc= new Scanner(System.in);
       Persona [] persona= new Persona[20];
       PersonaService Service = new PersonaService();

       int opc;

       do {
           System.out.println("----------MENU--------------");
           System.out.println("Ingresa 1) para alta");
           System.out.println("Ingresa 2) para buscar el id");
           System.out.println("Ingresa 3) para realizar una baja logica de el id");
           System.out.println("Ingresa 4) para listar los Id activos");
           System.out.println("Ingresa 5) para actualizar nombre por id(solo activas)");
           System.out.println("Ingresa 0) para salir");
           opc= sc.nextInt();
           switch (opc) {
               case 1:
                  Service.alta(sc,persona);
                  break;
               case 2:
                   Service.BuscarId(sc, persona);
                   break;
               case 3:
                   Service.bajaLogica(sc,persona);
                   break;
               case 4:
                   Service.listarActivas(persona);
                   break;
               case 5:
                   Service.actualizarNombre(sc,persona);
                   break;
               case 0:
                   System.out.println("Saliendo ...");
                    default:
                   System.out.println("Opcion invalida");
           }
       }while(opc!=0);
    }
}