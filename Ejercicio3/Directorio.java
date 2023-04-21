import java.util.ArrayList;

public class Directorio {
    private ArrayList<Documento> listaDocumentos;
    
    public Directorio() {
        listaDocumentos = new ArrayList<Documento>();
    }
    
    public void agregarDocumento(Documento documento) {
        listaDocumentos.add(documento);
        System.out.println("El documento ha sido agregado al directorio.");
    }
    
    public void eliminarDocumento(Documento documento) {
        listaDocumentos.remove(documento);
        System.out.println("El documento ha sido eliminado del directorio.");
    }
    
    public void mostrarDocumentos() {
        System.out.println("Documentos en el directorio:");
        for (Documento documento : listaDocumentos) {
            System.out.println(documento.getTitulo());
        }
    }
}
