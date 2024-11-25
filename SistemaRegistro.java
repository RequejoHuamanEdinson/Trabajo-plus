package Vista;

import Controlador.GestionLenguaje;
import Modelo.LenguajeProgramacion;
import java.util.Scanner;

public class SistemaRegistro {
    
private static GestionLenguaje gestionLenguaje = new GestionLenguaje();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Agregar lenguaje");
            System.out.println("2. Buscar lenguaje");
            System.out.println("3. Eliminar lenguaje");
            System.out.println("4. Imprimir lenguajes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Anio de creacion: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Caracteristica principal: ");
                    String caracteristica = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Utilizacion: ");
                    String utilizacion = scanner.nextLine();
                    gestionLenguaje.agregarLenguaje(anio, caracteristica, nombre, utilizacion);
                    System.out.println("Lenguaje agregado.");
                }
                case 2 -> {
                    System.out.print("Ingrese el nombre del lenguaje a buscar: ");
                    String nombre = scanner.nextLine();
                    LenguajeProgramacion lenguaje = gestionLenguaje.buscarLenguaje(nombre);
                    System.out.println((lenguaje != null) ? lenguaje : "Lenguaje no encontrado.");
                }
                case 3 -> {
                    System.out.print("Ingrese el nombre del lenguaje a eliminar: ");
                    String nombre = scanner.nextLine();
                    boolean eliminado = gestionLenguaje.eliminarLenguaje(nombre);
                    System.out.println(eliminado ? "Lenguaje eliminado." : "Lenguaje no encontrado.");
                }
                case 4 -> gestionLenguaje.imprimirLenguajes();
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}