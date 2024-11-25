package Controlador; 
import Modelo.LenguajeProgramacion;
import java.util.Arrays;

public class GestionLenguaje {
    private LenguajeProgramacion[] arregloLenguajes = new LenguajeProgramacion[2];
    private int contadorLenguajes = 0;
    private static final int FACTOR_CRECIMIENTO = 2;

    public void agregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        
        if (contadorLenguajes == arregloLenguajes.length) {
            arregloLenguajes = Arrays.copyOf(arregloLenguajes, arregloLenguajes.length * FACTOR_CRECIMIENTO);
        }
        arregloLenguajes[contadorLenguajes++] = new LenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
    }

    public LenguajeProgramacion buscarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
                return arregloLenguajes[i];
            }
        }
        return null;
    }

    public boolean eliminarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
                // Mover los elementos hacia atrás para llenar el espacio vacío
                for (int j = i; j < contadorLenguajes - 1; j++) {
                    arregloLenguajes[j] = arregloLenguajes[j + 1];
                }
                arregloLenguajes[--contadorLenguajes] = null;
                return true;
            }
        }
        return false;
    }

    public LenguajeProgramacion[] getArregloLenguajes() {
        return Arrays.copyOf(arregloLenguajes, contadorLenguajes);
    }

    public void imprimirLenguajes() {
        if (contadorLenguajes == 0) {
            System.out.println("No hay lenguajes registrados.");
            return;
        }
        System.out.println("\n--- Lista de Lenguajes de Programacion ---");
        for (int i = 0; i < contadorLenguajes; i++) {
            LenguajeProgramacion lp = arregloLenguajes[i];
            System.out.printf("Lenguaje #%d:%n", i + 1);
            System.out.printf(" - Nombre: %s%n", lp.getNombre());
            System.out.printf(" - Año de Creacion: %d%n", lp.getAnioCreacion());
            System.out.printf(" - Caracteristica Principal: %s%n", lp.getCaracteristicaPrincipal());
            System.out.printf(" - Utilizacion: %s%n", lp.getUtilizacion());
            System.out.println("-----------------------------");
        }
    }
}
