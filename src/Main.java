public class Main {
    public static void main(String[] args) {
        Tarea[] tareas = new Tarea[6];
        tareas[0] = new Tarea("T-01", "Diseño de base de datos", 8, true);
        tareas[1] = new Tarea("T-02", "API de autenticación", 12, true);
        tareas[2] = new Tarea("T-03", "Interfaz de usuario", 15, false);
        tareas[3] = new Tarea("T-04", "Pruebas unitarias", 6, false);
        tareas[4] = new Tarea("T-05", "Despliegue en servidor", 4, false);
        tareas[5] = new Tarea("T-06", "Documentación técnica", 5, false);

        tareas[3].setCompletada(true);

        AnalizadorTareas analizador = new AnalizadorTareas(tareas);

        System.out.println("Tareas completadas: " + analizador.contarCompletadas());
        System.out.println("Horas totales estimadas: " + analizador.calcularHorasTotales() + "h");
        Tarea buscada = analizador.buscarPorCodigo("T-02");
        System.out.println("Búsqueda T-02: " + (buscada != null ? buscada.mostrarInformacion() : "No encontrada"));

        Tarea inexistente = analizador.buscarPorCodigo("T-99");
        System.out.println("Búsqueda T-99: " + (inexistente != null ? inexistente.mostrarInformacion() : "No encontrada"));

        Tarea mayor = analizador.obtenerTareaMayorDuracion();
        System.out.println("Tarea de mayor duración: " + (mayor != null ? mayor.mostrarInformacion() : "Ninguna"));
    }
}