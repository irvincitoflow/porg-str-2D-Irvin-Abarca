import java.util.*;
class Main{
    public double pesoKG;
    public int dostanciaKm;
    public int tipoServicio;
    public boolean esZonaRemota;

    public static void main(String[] args) {
        //creacion de objetos
        Scanner leer = new Scanner(System.in);
        InputDataVal inputDataVal = new InputDataVal();
        ShoppingCalculator shoppingCalculator = new ShoppingCalculator();

        //input
        double pesoKg = inputDataVal.getValidDouble(leer, "Dame el peso en Kg (Rango = 0.1-50) ",50,0.1);
        int distanciaKm = inputDataVal.getValidInt(leer,"Dame los Km (Rango = 1-2000)","Fuera de rango",1,2000);
        int tipoServicio = inputDataVal.getValidInt(leer, "Seleccione el tipo de servicio (Estandar=1 Express=2)","Opcion no valida",1,2);
        boolean zonaRemota = inputDataVal.getValidBoolean(leer);

        //process
        shoppingCalculator.proceso(pesoKg,distanciaKm,tipoServicio,zonaRemota);

        //output
        shoppingCalculator.imprimirTicket(tipoServicio,pesoKg,distanciaKm,zonaRemota);

    }
}