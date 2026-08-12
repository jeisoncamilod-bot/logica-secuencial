public class Inscripcion {

    Estudiante estudiante;
    Asignatura asignatura;

    public Inscripcion(Estudiante estudiante, Asignatura asignatura) {
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    public void mostrarInformacion() {

        System.out.println("===== INSCRIPCION =====");

        System.out.println("\nESTUDIANTE:");
        estudiante.mostrarInformacion();

        System.out.println("\nASIGNATURA:");
        asignatura.mostrarInformacion();
    }

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante(
                "Jeison Camilo",
                "12345"
        );

        Asignatura asignatura = new Asignatura(
                "Programacion",
                4
        );

        Inscripcion inscripcion = new Inscripcion(
                estudiante,
                asignatura
        );

        inscripcion.mostrarInformacion();
    }
}
