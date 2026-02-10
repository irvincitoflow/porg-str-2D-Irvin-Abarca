import java.util.Scanner;

public class PersonaService {

    public void alta(Scanner sc, Persona[] personas) {
        InputValidator input = new InputValidator();
        System.out.println("Ingresa el Id: ");
        int id = input.getIntNumber(sc, "Ingresa el Id del nuevo usuario");

        if (id <= 0) {
            System.out.println("ERROR: El Id debe ser mayor a 0");
            return;
        }

        if (existeId(personas, id)) {
            System.out.println("ERROR: El Id ya existe");
            return;
        }

        System.out.println("Ingresa el nombre del usuario: ");
        sc.nextLine(); // Limpiar el buffer del Enter anterior
        String name = sc.nextLine(); // Usamos nextLine para nombres completos

        if (name.trim().isEmpty()) {
            System.out.println("ERROR: El nombre del usuario no puede estar vacio");
            return;
        }

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) {
                personas[i] = new Persona(id, name);
                System.out.println("Alta exitosa");
                return;
            }
        }
    }

    public void BuscarId(Scanner sc, Persona[] personas) {
        System.out.println("Id a buscar:");
        int id = sc.nextInt();
        for (Persona persona : personas) {
            // Usamos isSctive() porque así lo escribiste en tu clase Persona
            if (persona != null && persona.getId() == id && persona.isSctive()) {
                System.out.println("Encontrado: " + persona);
                return;
            }
        }
        System.out.println("Persona no encontrada o inactiva");
    }

    public void bajaLogica(Scanner sc, Persona[] personas) {
        System.out.print("ID para dar de baja: ");
        int id = sc.nextInt();
        for (Persona persona : personas) {
            if (persona != null && persona.getId() == id) {
                persona.setSctive(false); // Cambiamos estado a inactivo
                System.out.println("Baja lógica realizada.");
                return;
            }
        }
        System.out.println("ID no encontrado.");
    }

    public void listarActivas(Persona[] personas) {
        System.out.println("--- Listado de Personas Activas ---");
        boolean hayActivas = false;
        for (Persona persona : personas) {
            if (persona != null && persona.isSctive()) {
                System.out.println(persona);
                hayActivas = true;
            }
        }
        if (!hayActivas) System.out.println("No hay personas activas.");
    }

    public void actualizarNombre(Scanner sc, Persona[] personas) {
        System.out.print("ID a actualizar: ");
        int id = sc.nextInt();
        for (Persona persona : personas) {
            if (persona != null && persona.getId() == id && persona.isSctive()) {
                System.out.print("Nuevo nombre: ");
                sc.nextLine();
                persona.setName(sc.nextLine());
                System.out.println("Nombre actualizado.");
                return;
            }
        }
        System.out.println("No se puede actualizar: inactiva o no existe.");
    }

    private static boolean existeId(Persona[] personas, int id) {
        for (Persona persona : personas) {
            if (persona != null && persona.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
