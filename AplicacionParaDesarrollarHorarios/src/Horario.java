import java.util.ArrayList;
import java.util.List;

public class Horario {
    private List<Clase> listaClases;
    private List<String> horasLibres;

    public Horario() {
        this.listaClases = new ArrayList<>();
        this.horasLibres = new ArrayList<>();
    }

    public List<Clase> getListaClases() {
        return listaClases;
    }

    public List<String> getHorasLibres() {
        return horasLibres;
    }

    public void agregarClase(Clase nuevaClase) {
        listaClases.add(nuevaClase);
    }

    public void eliminarClase(Clase clase) {
        listaClases.remove(clase);
    }

    public void modificarHorario(Clase clase, String nuevaHoraInicio, String nuevaHoraFin, String nuevoDia) {
        clase.cambiarHora(nuevaHoraInicio, nuevaHoraFin);
        clase.cambiarDia(nuevoDia);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Clase clase : listaClases) {
            sb.append(clase.toString()).append("\n");
        }
        return sb.toString();
    }
}
