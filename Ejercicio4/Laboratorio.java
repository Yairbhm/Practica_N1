import java.util.ArrayList;

public class Laboratorio {
    private int identificacion;
    private String instructor;
    private String horario;
    private int equiposDisponibles;
    private ArrayList<Estudiante> estudiantes;

    public Laboratorio(int identificacion, String instructor, String horario, int equiposDisponibles) {
        this.identificacion = identificacion;
        this.instructor = instructor;
        this.horario = horario;
        this.equiposDisponibles = equiposDisponibles;
        this.estudiantes = new ArrayList<>();
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getEquiposDisponibles() {
        return equiposDisponibles;
    }

    public void setEquiposDisponibles(int equiposDisponibles) {
        this.equiposDisponibles = equiposDisponibles;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) throws Exception {
        if (equiposDisponibles > 0) {
            estudiantes.add(estudiante);
            equiposDisponibles--;
            estudiante.setLaboratorioAsignado(this);
            System.out.println("El estudiante " + estudiante.getNombre() + " fue asignado al laboratorio " + identificacion);
        } else {
            System.out.println("No hay cupo disponible en el laboratorio " + identificacion);
        }
    }
    
    public void verEstudiantes() {
    System.out.println("Estudiantes del laboratorio " + identificacion + ":");
    for (Estudiante estudiante : estudiantes) {
        System.out.println(estudiante.getNombre() + " " + estudiante.getApellido() + " - Código: " + estudiante.getCodigo());
    }
}

}