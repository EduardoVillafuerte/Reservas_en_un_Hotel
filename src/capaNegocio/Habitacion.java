package capaNegocio;

import java.util.ArrayList;

public class Habitacion {
    private boolean disponibilidad;
    private int numHabitacion;
    private double precioNoche;
    private Tipo tipo;


    public Habitacion(int numHabitacion, boolean disponibilidad, double precioNoche, Tipo tipo) {
        this.numHabitacion = numHabitacion;
        this.disponibilidad = disponibilidad;
        this.precioNoche = precioNoche;
        this.tipo = tipo;
    }
    public Habitacion(){}

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
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

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

}
