public class Estudiante {
    private int codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private Laboratorio laboratorioAsignado;

    public Estudiante(int codigo, String nombre, String apellido, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Laboratorio getLaboratorioAsignado() {
        return laboratorioAsignado;
    }

    public void setLaboratorioAsignado(Laboratorio laboratorioAsignado) {
        this.laboratorioAsignado = laboratorioAsignado;
    }
}