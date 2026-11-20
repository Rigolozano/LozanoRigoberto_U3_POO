package modelo;

public class Servidor extends EquipoTI {
    private int capacidadTB;
    private int nucleos;

    public Servidor(int id, String nombre, String marca, double precio, int capacidadTB, int nucleos) {
        super(id, nombre, marca, precio);
        this.capacidadTB = capacidadTB;
        this.nucleos = nucleos;
    }

    public void reiniciarServidor() {
        System.out.println("Servidor " + nombre + " reiniciado. Capacidad: " + capacidadTB + "TB | Nucleos: " + nucleos);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | [SERVIDOR] " + nombre + " | Marca: " + marca + " | Precio: $" + precio + " | Asignado a: " + usuarioAsignado);
        System.out.println("  -> Almacenamiento: " + capacidadTB + "TB | Nucleos: " + nucleos);
    }
}