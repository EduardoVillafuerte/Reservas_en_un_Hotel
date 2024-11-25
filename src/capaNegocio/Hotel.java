package capaNegocio;

import javax.swing.*;
import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public Hotel() {
        this.habitaciones.add(new Habitacion(1,true,60.0,Tipo.FAMILIAR));
        this.habitaciones.add(new Habitacion(2,true,62.0,Tipo.DOBLE));
        this.habitaciones.add(new Habitacion(3,true,54.0, Tipo.INDIVIDUAL));
        this.nombre = "Tropical";
    }

    public Habitacion consultarDisponibilidad(int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if(habitacion.getNumHabitacion() == numeroHabitacion) {
                if (habitacion.isDisponible()) {
                    return habitacion;
                }
            }
        }
        return null;
    }

    public boolean crearReserva(String nombre, int numeroHabitacion, int dias, String fechaCheckiIn, String fechaCheckiOut, String formaDePago, Habitacion habitacion) {
        Fecha fecha = new Fecha();
        if (habitacion != null) {
            Reserva nuevaReserva = new Reserva(
                    nombre,
                    dias,
                    fecha.retornarFecha(fechaCheckiIn),
                    fecha.retornarFecha(fechaCheckiOut),
                    formaDePago,
                    habitacion
            );
            reservas.add(nuevaReserva);
            System.out.println("Reserva creada: " + nuevaReserva.getNombre());
            return true;
        }
        System.out.println("No se pudo crear la reserva, la habitación no está disponible.");
        return false;
    }

    public void imprimirReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            for (Reserva reservas : reservas) {
                String reserva= "Nombre: "+reservas.getNombre()+"\n"+
                                "Dias de estancia: "+reservas.getDias()+"\n"+
                                "Check In: "+ reservas.getCheck_outFecha().getDia()+"/"+reservas.getCheck_outFecha().getMes()+"/"+reservas.getCheck_outFecha().getAnio()+"/"+"\n"+
                                "Check Out: "+ reservas.getCheck_outFecha().getDia()+"/"+reservas.getCheck_outFecha().getMes()+"/"+reservas.getCheck_outFecha().getAnio()+"/"+"\n"+
                                "Forma de pago: " + reservas.getFormaDePago()+"\n"+
                                "Numero habitacion "+ reservas.getHabitacion().getNumHabitacion()+"\n"+
                                "Precio x noche: " + reservas.getHabitacion().getPrecioNoche()+"\n"+
                                "Tipo: " + reservas.getHabitacion().getTipo().toString()+"\n"+
                                "Presione ok para ver las siguientes";
                JOptionPane.showMessageDialog(null,reserva);
            }
        }
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

}
