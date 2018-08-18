import java.util.*; 
/**
 * Clase controladora del programa. 
 * 
 * @author Bafen Ricardo Barragán
 * @version 1.0
 */
public class ListadeMercado
{
    //Método para iniciar la ejecución del programa.
    public static void main (String [] args){
        //Se crea un scanner para recibir las entradas del teclado. 
        Scanner teclado = new Scanner(System.in) ; 
               
        //Se crea un nuevo objeto de tipo M_ListadeMercado
        M_ListadeMercado miLista = new M_ListadeMercado();
        
        //pide el nombre de usuario y lo almacena 
        System.out.println("Por favor digite su nombre: ");
        String nombreUsuario = teclado.nextLine(); 
        System.out.println(); 
        
        
        //Llamada al método mensajeBienvenida y utilza nombreUsuario. 
        miLista.mensajeBienvenida(nombreUsuario);
        
        
    }
}
