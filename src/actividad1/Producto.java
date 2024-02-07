package actividad1;

public class Producto {
    public String descripcion;
    public double precioBruto;

    public Producto() {
    }

    public Producto(String descripcion, double precioBruto) {
        this.descripcion = descripcion;
        this.precioBruto = precioBruto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getPrecioNeto(){
        return precioBruto;
    }

    @Override
    public String toString() {
        return descripcion + ": " + precioBruto + " €";
    }
}