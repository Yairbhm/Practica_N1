import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Documento> listaDocumentosPropios;
    
    public Usuario(String nombre) {
        this.nombre = nombre;
        listaDocumentosPropios = new ArrayList<Documento>();
    }
    
    public Documento crearDocumento(String titulo, String contenido) {
        Documento documento = new Documento(titulo, contenido, nombre);
        listaDocumentosPropios.add(documento);
        System.out.println("El documento ha sido creado y agregado a la lista de documentos del usuario.");
        return documento;
    }
    
    public void imprimirDocumento(Documento documento) {
        documento.imprimir();
    }
    
    public void mostrarDocumento(Documento documento) {
        documento.mostrar();
    }
    
    public void modificarDocumento(Documento documento, String contenido) {
        documento.modificar(contenido);
    }
    
    public void eliminarDocumento(Documento documento) {
        listaDocumentosPropios.remove(documento);
        System.out.println("El documento ha sido eliminado de la lista de documentos del usuario.");
    }
}


