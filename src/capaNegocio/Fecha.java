package capaNegocio;

public class Fecha {
  private int dia,mes,anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public Fecha(){}

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Fecha retornarFecha(String string){
        setDia(Integer.parseInt(string.substring(0,2)));
        setMes(Integer.parseInt(string.substring(3,5)));
        setAnio(Integer.parseInt(string.substring(6)));
        return new Fecha(getAnio(),getDia(),getMes());
    }

}
