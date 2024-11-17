public class Clase {
    private String nombre;
    private String profesor;
    private String horaInicio;
    private String horaFin;
    private String diaSemana;

    public Clase(String nombre, String profesor, String horaInicio, String horaFin, String diaSemana) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.diaSemana = diaSemana;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void cambiarHora(String nuevaHoraInicio, String nuevaHoraFin) {
        this.horaInicio = nuevaHoraInicio;
        this.horaFin = nuevaHoraFin;
    }

    public void cambiarDia(String nuevoDiaSemana) {
        this.diaSemana = nuevoDiaSemana;
    }

    @Override
    public String toString() {
        return "Clase: " + nombre + ", Profesor: " + profesor + ", Día: " + diaSemana + ", Hora: " + horaInicio + " - " + horaFin;
    }
}
