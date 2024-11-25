package capaNegocio;

public class Reserva {
    private Habitacion habitacion;
    private int dias;
    private Fecha check_inFecha;
    private Fecha check_outFecha;
    private String nombre;
    private String formaDePago;

    public Reserva(String nombre,int dias,Fecha check_inFecha,Fecha check_outFecha,String formaDePago, Habitacion habitacion) {
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

    public String getNombre() {
        return nombre;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Fecha getCheck_outFecha() {
        return check_outFecha;
    }

}
