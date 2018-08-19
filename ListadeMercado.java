import java.util.*; 
/**
 * Clase controladora del programa. 
 * 
 * @author Bafen Ricardo Barragán
 * @version 2.0
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
        System.out.println();
        
        //pide los productos y los precios
        int control = 1, //variable de control para la solicitud
        i = 0, //variable contadora
        j = 0; 
        ArrayList<String> listaProductos = new ArrayList<String> (); 
        ArrayList<Integer> listaPrecios = new ArrayList <Integer> (); 
        
        while (control == 1){
            System.out.print("Ingrese el nombre y la descripción del producto: ");
            listaProductos.add(i, teclado.nextLine());
            System.out.println();
            
            System.out.print("Ingrese el valor del producto: "); 
            listaPrecios.add(i, teclado.nextInt()); 
            System.out.println();
            
            i ++;
            
            System.out.print("Si desea añadir otro producto digite 1, si no, digite 0:"); 
            control = teclado.nextInt(); 
            System.out.println();
        }
             System.out.println();
             miLista.listaProductos(listaProductos, listaPrecios);
             miLista.mensajeSalida(nombreUsuario);
            
    }
    }    
