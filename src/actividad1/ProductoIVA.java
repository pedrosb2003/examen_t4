package actividad1;

public class ProductoIVA extends Producto {
    public double iva;

    public ProductoIVA(double iva) {
        this.iva = iva;
    }

    public ProductoIVA(String descripcion, double precioBruto, double iva) {
        super(descripcion, precioBruto);
        this.iva = iva;
    }

    public double CalculoIVA(){
        return precioBruto * (1 + (double) 21 / 100);
    }

    @Override
    public String toString() {
        return descripcion + ": " + precioBruto + " €" + "21.0% = " ;
    }
}
