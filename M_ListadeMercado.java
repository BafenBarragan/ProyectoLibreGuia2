import java.util.*;
import javax.swing.*;
/**
 * Esta es una de las partes del desarrollo del proyecto libre para la guía 2 del bloque de estudios Construcción de Software.
 * En esta clase se encuentran los métodos que se van a ejecutar directamente desde la clase ListadeMercado. 
 * 
 * @author Bafen Ricardo Barragán 
 * @version 2.0
 */
public class M_ListadeMercado
{
    //Método para enviar el mensaje de bienvenida a la aplicación. 
    public void mensajeBienvenida (String nombreUsuario){
        System.out.printf("Bienvenido al seguidor de precios para \n%s!\n", nombreUsuario);
    }
    public void listaProductos(ArrayList <String> listaProductos, ArrayList<Integer> listaPrecios){
        System.out.printf("Su lista final es:\n\n %10s%25s\n\n", "Producto", "Precio");
        for (int i = 0; i < listaProductos.size(); i++)
        System.out.printf("%s%22d\n\n", listaProductos.get(i), listaPrecios.get(i));
    }
    public void mensajeSalida (String nombreUsuario){
        System.out.printf("Muchas gracias por utilizar la aplicación %s!", nombreUsuario); 
    }
    
}
