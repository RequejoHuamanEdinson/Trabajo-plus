package Modelo;  

public class LenguajeProgramacion {
    private int anioCreacion;
    private String caracteristicaPrincipal;
    private String nombre;
    private String utilizacion;

    public LenguajeProgramacion(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        this.anioCreacion = anioCreacion;
        this.caracteristicaPrincipal = caracteristicaPrincipal;
        this.nombre = nombre;
        this.utilizacion = utilizacion;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getCaracteristicaPrincipal() {
        return caracteristicaPrincipal;
    }

    public void setCaracteristicaPrincipal(String caracteristicaPrincipal) {
        this.caracteristicaPrincipal = caracteristicaPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUtilizacion() {
        return utilizacion;
    }

    public void setUtilizacion(String utilizacion) {
        this.utilizacion = utilizacion;
    }

    @Override
    public String toString() {
        return "LenguajeProgramacion{" +
                "anioCreacion=" + anioCreacion +
                ", caracteristicaPrincipal='" + caracteristicaPrincipal + '\'' +
                ", nombre='" + nombre + '\'' +
                ", utilizacion='" + utilizacion + '\'' +
                '}';
    }
}