package capaNegocio;

public class Reserva {
    private int numReserva;
    private Habitacion habitacion;
    private Fecha check_inFecha;
    private Fecha check_outFecha;

    public Reserva(int numReserva, Habitacion habitacion, Fecha check_inFecha, Fecha check_outFecha) {
        this.numReserva = numReserva;
        this.habitacion = habitacion;
        this.check_inFecha = check_inFecha;
        this.check_outFecha = check_outFecha;
    }

    public int getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Fecha getCheck_inFecha() {
        return check_inFecha;
    }

    public void setCheck_inFecha(Fecha check_inFecha) {
        this.check_inFecha = check_inFecha;
    }

    public Fecha getCheck_outFecha() {
        return check_outFecha;
    }

    public void setCheck_outFecha(Fecha check_outFecha) {
        this.check_outFecha = check_outFecha;
    }
}
