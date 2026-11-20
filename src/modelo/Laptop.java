
package modelo;

public class Laptop extends EquipoTI {
    private int ramGB;
    private double pulgadasPantalla;

    public Laptop(int id, String nombre, String marca, double precio, int ramGB, double pulgadasPantalla) {
        super(id, nombre, marca, precio);
        this.ramGB = ramGB;
        this.pulgadasPantalla = pulgadasPantalla;
    }

    public void abrirTapa() {
        System.out.println("Laptop " + nombre + " encendida. RAM: " + ramGB + "GB | Pantalla: " + pulgadasPantalla + " pulgadas");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | [LAPTOP] " + nombre + " | Marca: " + marca + " | Precio: $" + precio + " | Asignado a: " + usuarioAsignado);
        System.out.println("  -> RAM: " + ramGB + "GB | Pantalla: " + pulgadasPantalla + "\"");
    }
}