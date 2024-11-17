import java.util.List;

// Calse estudiante, esta clase contiene todos los datos del estudiante registrado en la universidad
public class Estudiante {
    private String carrera;
    private int semestre;
    private Horario horarioActual;
    private List<Asignatura> listaAsignaturas;

    public Estudiante(String carrera, int semestre, Horario horarioActual, List<Asignatura> listaAsignaturas) {
        this.carrera = carrera;
        this.semestre = semestre;
        this.horarioActual = horarioActual;
        this.listaAsignaturas = listaAsignaturas;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public Horario getHorarioActual() {
        return horarioActual;
    }

    public List<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void verHorario() {
        System.out.println("Horario Actual:");
        System.out.println(horarioActual);
    }

    public void verAsignaturasSemestre() {
        System.out.println("Asignaturas del Semestre:");
        for (Asignatura asignatura : listaAsignaturas) {
            System.out.println(asignatura);
        }
    }

    public void solicitarAyuda() {
        System.out.println("Solicitando ayuda a soporte...");
    }
}
