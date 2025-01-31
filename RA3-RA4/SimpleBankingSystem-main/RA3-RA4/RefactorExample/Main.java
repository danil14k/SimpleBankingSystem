package RefactorExample;
/**
*
* @author Flor Martinez
*/
public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura();
        factura.establecerSubtotal(1000);
        factura.calcularImpuestos(21);  // 21% de IVA
        factura.calcularTotal();
        factura.mostrarFactura();
    }
}
