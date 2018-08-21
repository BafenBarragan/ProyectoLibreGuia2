import java.util.*;
import javax.swing.*;

/**
 * Esta es una de las partes del desarrollo del proyecto libre para la guía 2 del bloque de estudios Construcción de Software.
 * En esta clase se encuentran los métodos que se van a ejecutar directamente desde la clase ListadeMercado. 
 * 
 * @author Bafen Ricardo Barragán 
 * @version 3.0
 */
public class M_ListadeMercado
{
    //Método para enviar el mensaje de bienvenida a la aplicación. 
    public void mensajeBienvenida (String nombreUsuario){
        JOptionPane.showMessageDialog(null, "Bienvenido al seguidor de precios para " + nombreUsuario + 
        "!", "Ayudante de Mercado", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Método para mostrar la lista final de los productos.
    public void listaProductos(ArrayList <String> listaProductos, ArrayList<Integer> listaPrecios){
        System.out.printf("Su lista final es:\n\n %10s%22s\n\n", "Producto", "Precio");
        
        for (int i = 0; i < listaProductos.size(); i++)
            System.out.printf("%s%22d\n\n", listaProductos.get(i), listaPrecios.get(i));
    }
    
    //Método para mostrar totales. 
    public void totales (int precioTotal, int cantidadProductos, int presupuesto){
        System.out.printf("En total compró %d productos. \nCosto total: %d \nSu presupuesto quedó en: %d " ,
        cantidadProductos, precioTotal, presupuesto);
        System.out.println();
    }
    
    //Método para mostrar mensaje de salida de la aplicación.
    public void mensajeSalida (String nombreUsuario){
        JOptionPane.showMessageDialog(null, "\nMuchas gracias por utilizar la aplicación " +nombreUsuario +
        "!", "Ayudante de Mercado", JOptionPane.INFORMATION_MESSAGE); 
    }
    
}
