package capaNegocio;

import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();

    public Hotel(String nombre) {
        this.nombre = nombre;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public Habitacion consultarDisponibilidad() {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.isDisponible()) {
                return habitacion;
            }
        }
        return null;
    }

    public Reserva crearReserva(int numReserva, Fecha check_inFecha, Fecha check_outFecha) {
        Habitacion habitacionDisponible = consultarDisponibilidad();
        if (habitacionDisponible != null) {
            habitacionDisponible.setDisponibilidad(false);
            return new Reserva(numReserva, habitacionDisponible, check_inFecha, check_outFecha);
        }
        return null;
    }
}



