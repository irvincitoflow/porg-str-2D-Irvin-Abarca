import java.util.*;
public class InputDataVal {
    public double getValidDouble(Scanner leer, String mensaje, double max, double min){
        double value;
        while (true){
            System.out.println(mensaje);
            if(leer.hasNextDouble()){
                value = leer.nextDouble();
                if (value<=max && value>=min){
                    return value;
                }
                System.out.println("No esta en el rango");
            }
            else{
                System.out.println("No es un dato numerico");
                leer.next();
            }
        }
    }
    public int getValidInt(Scanner leer, String mensaje1, String mensaje2, int min, int max){
        int value;
        while(true){
            System.out.println(mensaje1);
            if(leer.hasNextInt()){
                value = leer.nextInt();
                if (value<=max && value>=min){
                    return value;
                }
                System.out.println(mensaje2);
            }else{
                System.out.println("No es un valor entero");
                leer.next();
            }
        }

    }
    public boolean getValidBoolean(Scanner leer){
        while(true){
            System.out.println("Su paquete va hacia alguna zona remota? (true/false)");
            if(leer.hasNextBoolean()){
                return leer.nextBoolean();
            }else{
                System.out.println("Opcion Invalida");
                leer.next();
            }

        }
    }
}