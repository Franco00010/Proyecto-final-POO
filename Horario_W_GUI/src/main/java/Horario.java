public class Horario {
    private String dia;
    private String horaInicio;
    private String horaFin;
    private Asignatura asignatura;
    private Profesor profesor;

    public Horario(String dia, String horaInicio, String horaFin, Asignatura asignatura, Profesor profesor) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.asignatura = asignatura;
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "dia='" + dia + '\'' +
                ", horaInicio='" + horaInicio + '\'' +
                ", horaFin='" + horaFin + '\'' +
                ", asignatura=" + asignatura.getNombre() +
                ", profesor=" + profesor.getNombre() +
                '}';
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }
}
