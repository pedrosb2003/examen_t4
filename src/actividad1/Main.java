package actividad1;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Teclado", 8.99);
        Producto p2 = new Producto("Ratón",5.99);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.ProductoIVA());
        System.out.println(p1.getPrecioNeto());
    }
}
