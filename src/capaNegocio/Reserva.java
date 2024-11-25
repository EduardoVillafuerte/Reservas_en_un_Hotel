package capaNegocio;

public class Reserva {
    private int numReserva;
    private Habitacion habitacion;
    private int dias;
    private Fecha check_inFecha;
    private Fecha check_outFecha;
    private String nombre;
    private String formaDePago;

    public Reserva(String nombre,int dias,Fecha check_inFecha,Fecha check_outFecha,String formaDePago, Habitacion habitacion) {
//        this.numReserva = numReserva;
        this.habitacion = habitacion;
        habitacion.setDisponibilidad(false);
        this.dias = dias;
        this.check_inFecha = check_inFecha;
        this.check_outFecha = check_outFecha;
        this.nombre = nombre;
        this.formaDePago = formaDePago;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
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
