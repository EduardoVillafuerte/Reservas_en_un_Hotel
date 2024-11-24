package capaNegocio;

public class Habitacion {
    private int dias;
    private boolean disponibilidad;
    private double precioNoche;
    private Tipo tipo;

    public Habitacion(int dias, boolean disponibilidad, double precioNoche, Tipo tipo) {
        this.dias = dias;
        this.disponibilidad = disponibilidad;
        this.precioNoche = precioNoche;
        this.tipo = tipo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }



}
