package app;
import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EquipoTI> inventario = new ArrayList<>();
        int opcion = 0;
        int contadorId = 1;

        inventario.add(new Laptop(contadorId++, "Laptop HP", "HP", 14500.0, 16, 15.6));
        inventario.add(new Servidor(contadorId++, "Servidor Dell", "Dell", 85000.0, 8, 16));

        while (opcion != 5) {
            System.out.println("\n=== SISTEMA DE GESTION DE RECURSOS TI ===");
            System.out.println("1. Agregar Laptop");
            System.out.println("2. Agregar Servidor");
            System.out.println("3. Mostrar Inventario (Polimorfismo)");
            System.out.println("4. Asignar Recurso");
            System.out.println("5. Salir");
            System.out.print("Escoge una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Nombre: "); String n = sc.nextLine();
                System.out.print("Marca: "); String m = sc.nextLine();
                System.out.print("Precio: "); double p = sc.nextDouble();
                System.out.print("RAM GB: "); int ram = sc.nextInt();
                System.out.print("Pantalla pulgadas: "); double pul = sc.nextDouble(); sc.nextLine();
                inventario.add(new Laptop(contadorId++, n, m, p, ram, pul));
                System.out.println("Laptop agregada!");
            } else if (opcion == 2) {
                System.out.print("Nombre: "); String n = sc.nextLine();
                System.out.print("Marca: "); String m = sc.nextLine();
                System.out.print("Precio: "); double p = sc.nextDouble();
                System.out.print("Capacidad TB: "); int tb = sc.nextInt();
                System.out.print("Nucleos: "); int nuc = sc.nextInt(); sc.nextLine();
                inventario.add(new Servidor(contadorId++, n, m, p, tb, nuc));
                System.out.println("Servidor agregado!");
            } else if (opcion == 3) {
                System.out.println("\n--- INVENTARIO ---");
                for (EquipoTI equipo : inventario) {
                    equipo.mostrarInfo();
                    System.out.println();
                }
            } else if (opcion == 4) {
                System.out.print("ID del equipo a asignar: "); int idBuscar = sc.nextInt(); sc.nextLine();
                System.out.print("Nombre del usuario: "); String usuario = sc.nextLine();
                for (EquipoTI equipo : inventario) {
                    if (equipo.getId() == idBuscar) {
                        equipo.asignarRecurso(usuario);
                    }
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo del sistema...");
            } else {
                System.out.println("Opcion invalida");
            }
        }
        sc.close();
    }
}
