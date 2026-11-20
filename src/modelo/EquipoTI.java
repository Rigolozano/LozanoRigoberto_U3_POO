package modelo;

public abstract class EquipoTI {
    protected int id;
    protected String nombre;
    protected String marca;
    protected double precio;
    protected String usuarioAsignado;

    public EquipoTI(int id, String nombre, String marca, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.usuarioAsignado = "Sin asignar";
    }

    public void asignarRecurso(String usuario) {
        this.usuarioAsignado = usuario;
        System.out.println("Recurso " + nombre + " asignado a: " + usuario);
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }

    public abstract void mostrarInfo();
}
