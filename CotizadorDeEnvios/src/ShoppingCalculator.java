public class ShoppingCalculator {
    public final double IVA = 0.16;
    public double subtotal;
    public double iva;
    public double total;
    public void proceso(double peso, int distancia, int tipo, boolean zona){
        calcularSubtotal(peso,distancia,tipo,zona);
        calcularIVA(this.subtotal);
        calcularTotal(this.subtotal,this.iva);
    }
    private void calcularSubtotal(double peso, int distancia, int tipo, boolean zona){
        double base;
        double precioPorPeso = peso*12;
        double precioPorDistancia;
        if (tipo==1){
            base = 50;
        }else{
            base = 90;
        }
        if (distancia<=50){
            precioPorDistancia = 20;
        }else if (distancia<=200){
            precioPorDistancia = 60;
        }else{
            precioPorDistancia = 120;
        }
        double subtotal;
        if (zona){
            subtotal = (base+precioPorDistancia+precioPorPeso)*1.1;
        }else{
            subtotal = base+precioPorDistancia+precioPorPeso;
        }
        this.subtotal= subtotal;

    }
    private void calcularIVA(double subtotal){
        this.iva = subtotal*IVA;
    }
    private void calcularTotal(double subtotal, double IVA){
        this.total = subtotal+IVA;
    }
    public void imprimirTicket(int servicio, double peso, int distancia, boolean zona){
        System.out.print("El tipo de servicio fue el: ");
        if (servicio==1) {
            System.out.println("estandar");
        }else{
            System.out.println("express");
        }
        System.out.println("El peso fue de "+peso+ " kg");
        System.out.println("La distancia fue de "+distancia+" km");
        if (zona){
            System.out.println("Se encontraba en zona remota");
        }else{
            System.out.println("No se encontraba en zona remota");
        }
        System.out.println("Su subtotal fue: "+this.subtotal);
        System.out.println("El iva fue de: "+this.iva);
        System.out.println("El total sera de: "+this.total);
    }
}