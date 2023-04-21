import java.util.ArrayList;
public class Biblioteca
{
private ArrayList<Libros> listarLibros;
private ArrayList<Mapas> listarMapas;
private ArrayList<Cartillas> listarCartillas;
private ArrayList<Revistas> listarRevistas;
private ArrayList<Enciclopedias> listarEnciclopedias;
public Biblioteca()
 {
 listarLibros = new ArrayList<Libros>();
 listarMapas = new ArrayList<Mapas>();
 listarCartillas = new ArrayList<Cartillas>();
 listarRevistas = new ArrayList<Revistas>();
 listarEnciclopedias = new ArrayList<Enciclopedias>();
 }

 public void addlibross(Libros libros)
 {
   listarLibros.add(libros); 
 }

 public void addmapass(Mapas mapas)
 {
   listarMapas.add(mapas); 
 }

  public void addcartillas(Cartillas cartillas)
 {
   listarCartillas.add(cartillas); 
 }

  public void addrevistas(Revistas revistas)
 {
   listarRevistas.add(revistas); 
 }

  public void addenciclopedias(Enciclopedias enciclopedias)
 {
   listarEnciclopedias.add(enciclopedias); 
 }

 public void listarLibros()
 {
  if (listarLibros.size()>0)  
  {
   for (Libros item : listarLibros){
    item.mostrarLibros();
   }
  }
   else {
    System.out.println("No hay nigun libro");
    } 
 }
 
  public void listarMapas()
 {
  if (listarMapas.size()>0)  
  {
   for (Mapas item : listarMapas){
    item.mostrarMapas();
   }
  }
   else {
    System.out.println("No hay mapas");
    } 
 }
 
 public void listarCartillas()
 {
  if (listarCartillas.size()>0)  
  {
   for (Cartillas item : listarCartillas){
    item.mostrarCartillas();
   }
  }
   else {
    System.out.println("No hay Cartilla");
    } 
 }

  public void listarRevistas()
 {
  if (listarRevistas.size()>0)  
  {
   for (Revistas item : listarRevistas){
    item.mostrarRevistas();
   }
  }
   else {
    System.out.println("No hay revistas");
    } 
 }

  public void listarEnciclopedias()
 {
  if (listarEnciclopedias.size()>0)  
  {
   for (Enciclopedias item : listarEnciclopedias){
    item.mostrarEnciclopedias();
   }
  }
   else {
    System.out.println("No hay Enciclopedias");
    } 
 }
}






