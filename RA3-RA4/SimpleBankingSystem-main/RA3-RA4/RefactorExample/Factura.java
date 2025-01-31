package RefactorExample;
/**
*
* @author Flor Martinez
*/
public class Factura {
    private double subtotal;
    private double impuestos;
    private double total;

    public void calcularFactura(double subtotal, double impuestos) {
        this.subtotal = subtotal;
        this.impuestos = impuestos;
        this.total = subtotal + impuestos;

        // Mostrar los resultados
        System.out.println("Subtotal: " + this.subtotal);
        System.out.println("Impuestos: " + this.impuestos);
        System.out.println("Total: " + this.total);
    }
}

