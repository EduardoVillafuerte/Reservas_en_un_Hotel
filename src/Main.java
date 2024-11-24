import capaNegocio.*;

public class Main {
    public static void main(String[] args) {
        Habitacion h1 = new Habitacion(3,true,54.0, Tipo.INDIVIDUAL);
        Habitacion h2 = new Habitacion(5,true,60.0,Tipo.FAMILIAR);
        Habitacion h3 = new Habitacion(4,true,62,Tipo.DOBLE);

        Hotel hotel = new Hotel("Tropical");

        hotel.agregarHabitacion(h1);
        hotel.agregarHabitacion(h2);
        hotel.agregarHabitacion(h3);

        Habitacion habitacioDisponible = hotel.consultarDisponibilidad();
        if(habitacioDisponible != null){
            System.out.println("Encontrada");
            System.out.println("Precio por noche: " + habitacioDisponible);
        } else{
            System.out.println("No se encontro habitación Disponible");
        }

        if(habitacioDisponible != null){
            Fecha checkIn = new Fecha(1,12,2024);
            Fecha chechOut= new Fecha(5,12,2024);

            Reserva reserva = hotel.crearReserva(1,checkIn,chechOut );

            if(reserva != null){
                System.out.println("Proceso exitoso.");
            } else{
                System.out.println("No se pudo realizar");
            }
        }
        System.out.println("ja");



    }
}