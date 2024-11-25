import capaNegocio.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        int opcion;
        do{
            opcion = Integer.parseInt(menu());
            switch (opcion){
                case 1:
                    crearReserva(hotel);
                    break;
                case 2:
                    imprimirReservas(hotel);
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }while (opcion != 3);
    }

    public static String menu(){
        return JopInput( "Bienvenido/a al hotel Tropical\n" +
                            "Ingrese una opcion:\n" +
                            "1.Agendar reserva\n" +
                            "2.Imprimir reservas\n" +
                            "3.Salir");
    }

    public static void imprimirReservas(Hotel hotel){
        hotel.imprimirReservas();
    }

    public static void crearReserva(Hotel hotel){
        int contador = 0;
        Habitacion habitacion;
        String[] habitaciones = new String[3] ;
        String nombre = JopInput("Ingrese su nombre");
        for(Habitacion hb: hotel.getHabitaciones()){
            habitaciones[contador] = "Numero de habitacion: "+hb.getNumHabitacion()+", Tipo: "+hb.getTipo().toString()+",Precio x Noche: "+hb.getPrecioNoche()+"\n";
            contador ++;
        }
        int numeroHabitacion = Integer.parseInt(JopInput("Ingrese el numero de habitacion: \n"+habitaciones[0]+habitaciones[1]+habitaciones[2]));

        habitacion = hotel.consultarDisponibilidad(numeroHabitacion);
        if(habitacion == null) {
            JOptionPane.showMessageDialog(null,"Esta habitacion no se encuentra disponible");
            return;
        }

        int dias = Integer.parseInt(JopInput("Ingrese cuántos días se quedara en el hotel"));
        String fechaCheckiIn = JopInput("Ingrese la fecha del CheckIn en forma \"dd/mm/aaaa\"");
        String fechaCheckiOut = JopInput("Ingrese la fecha del CheckOut en forma \"dd/mm/aaaa\"");
        int formaPago = Integer.parseInt(JopInput("Ingrese su forma de pago:\n1.Tarjeta\n2.Efectivo\n3.Transferencia"));
        String formaDePago = switch (formaPago){
            case 1 -> "Tarjeta";
            case 2 -> "Efectivo";
            case 3 -> "Transferencia";
            default -> "Efectivo";
        };
        if(hotel.crearReserva(nombre,numeroHabitacion,dias,fechaCheckiIn,fechaCheckiOut,formaDePago,habitacion))
            System.out.println("Se creo la reserva");
        else
            System.out.println("Fallo la reserva");
    }

    public static String JopInput(String string){
        return JOptionPane.showInputDialog(null,string);
    }
}