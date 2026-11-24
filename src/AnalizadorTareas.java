public class AnalizadorTareas {
    private Tarea[] tareas;

    public AnalizadorTareas(Tarea[] tareas) {
        this.tareas = tareas;
    }

    public int contarCompletadas() {
        if (tareas == null) {
            return 0;
        }
        int contador = 0;
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null && tareas[i].isCompletada()) {
                contador++;
            }
        }
        return contador;
    }

    public int calcularHorasTotales() {
        if (tareas == null) {
            return 0;
        }
        int totalHoras = 0;
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null) {
                totalHoras += tareas[i].getHorasEstimadas();
            }
        }
        return totalHoras;
    }

    public Tarea buscarPorCodigo(String codigo) {
        if (tareas == null || codigo == null) {
            return null;
        }
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null && tareas[i].getCodigo().equals(codigo)) {
                return tareas[i];
            }
        }
        return null;
    }

    public Tarea obtenerTareaMayorDuracion() {
        if (tareas == null) {
            return null;
        }
        Tarea mayor = null;
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null) {
                if (mayor == null || tareas[i].getHorasEstimadas() > mayor.getHorasEstimadas()) {
                    mayor = tareas[i];
                }
            }
        }
        return mayor;
    }
}