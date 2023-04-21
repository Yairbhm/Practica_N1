public class Documento {
    private String titulo;
    private String contenido;
    private String autor;
    
    public Documento(String titulo, String contenido, String autor) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void imprimir() {
        System.out.println("Imprimiendo documento...");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Contenido: " + contenido);
    }
    
    public void mostrar() {
        System.out.println("Mostrando documento...");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Contenido: " + contenido);
    }
    
    public void modificar(String contenido) {
        this.contenido = contenido;
        System.out.println("El contenido del documento ha sido modificado.");
    }
    
    public void eliminar() {
        System.out.println("El documento ha sido eliminado.");
    }
}

