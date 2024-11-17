import java.util.ArrayList;
import java.util.List;

public class Semestre {
    private int numero;
    private List<Asignatura> asignaturas;

    public Semestre(int numero) {
        this.numero = numero;
        this.asignaturas = new ArrayList<>();
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public int getNumero() {
        return numero;
    }
}

    @Override
    public String toString() {
        return "Clase: " + nombre + ", Profesor: " + profesor + ", Día: " + diaSemana + ", Hora: " + horaInicio + " - " + horaFin;
    }
}
