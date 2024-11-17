 public void agregarHorario(Horario horario) {
        horarios.add(horario);
    }

    public void mostrarHorariosPorAsignatura(String nombreAsignatura) {
        boolean encontrado = false;
        for (Horario horario : horarios) {
            if (horario.getAsignatura().getNombre().equalsIgnoreCase(nombreAsignatura)) {
                System.out.println(horario);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron horarios para la asignatura " + nombreAsignatura);
        }
    }

    public List<Horario> getHorarios() {
        return horarios;
    }
}
