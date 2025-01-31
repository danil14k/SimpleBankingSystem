package RefactorExample;
/**
*
* @author Flor Martinez
*/
public class Factura {
    private double subtotal;
    private double impuestos;
    private double total;

    // Método para establecer el subtotal
    public void establecerSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    // Método para calcular los impuestos
    public void calcularImpuestos(double porcentajeImpuesto) {
        this.impuestos = this.subtotal * porcentajeImpuesto / 100;
    }

    // Método para calcular el total
    public void calcularTotal() {
        this.total = this.subtotal + this.impuestos;
    }

    // Método para mostrar los resultados
    public void mostrarFactura() {
        System.out.println("Subtotal: " + this.subtotal);
        System.out.println("Impuestos: " + this.impuestos);
        System.out.println("Total: " + this.total);
    }
}
