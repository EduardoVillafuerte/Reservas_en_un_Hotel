package capaNegocio;

public class Facturacion {
    private String nombre;
    private String apellido;
    private String cedula;
    private Habitacion precio;

    public Facturacion(String nombre, String apellido, String cedula, Habitacion precio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Habitacion getPrecio() {
        return precio;
    }

    public void setPrecio(Habitacion precio) {
        this.precio = precio;
    }
}
