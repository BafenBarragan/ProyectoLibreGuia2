import java.util.*; 
import javax.swing.*;
/**
 * Clase controladora del programa. 
 * 
 * @author Bafen Ricardo Barragán
 * @version 3.0
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
        String nombreUsuario = JOptionPane.showInputDialog(null, "Por favor digite su nombre: ", "Ayudante de Mercado", JOptionPane.QUESTION_MESSAGE);
         
        
        //Llamada al método mensajeBienvenida y utiliza nombreUsuario. 
        miLista.mensajeBienvenida(nombreUsuario);
        
        //Inicialización de variables para solicitar productos.
        
        
                int control = 1, //variable de control para la solicitud
                i = 0; //variable contadora
                int cantidadProductos = 0, //variable para el total de productos
                precioTotal = 0, //variable para el costo total de la compra
                precioProducto = 0; //variable para almacenar el precio de un producto
        
                /**Como se va a manejar mediante JOptionPane se necesitan variables de tipo String que almacenen  
                   * los datos que el cliente ingresa para luego convertirlos al tipo correspondiente.
                     */
        
                    String nombreProducto = "", //Variable que almacena el nombre del producto (no necesita conversión)
                    precio = "", //Variable que almacena el nombre del producto (se convierte a variable precioProducto)
                    ctrl = ""; //Variable que almacena la decisión de seguir o parar (se convierte a variable control)
        
                    ArrayList<String> listaProductos = new ArrayList<String> (); //Lista de tamaño indefinido donde se almacenan los productos.
                    ArrayList<Integer> listaPrecios = new ArrayList <Integer> (); //Lista de tamaño indefinido donde se almacenan los precios.
        
                    String disponible = JOptionPane.showInputDialog(null, nombreUsuario +"; por favor ingrese el presupuesto disponible para la compra" 
                    + "!", "Ayudante de Mercado", JOptionPane.QUESTION_MESSAGE);
                    int presupuesto = Integer.parseInt(disponible); 
                    
                    //Método para agregar productos. 
                    
                    
                while (control == 1 ){
                nombreProducto = JOptionPane.showInputDialog("Nombre y características del producto: ");
                listaProductos.add(i, nombreProducto); 
          
                precio = JOptionPane.showInputDialog("Precio del producto: ");
                precioProducto = Integer.parseInt(precio);
                listaPrecios.add(i, precioProducto); 
                
                if (precioProducto > presupuesto){
                    JOptionPane.showMessageDialog(null, "El producto excede el presupuesto, \nNO LO LLEVE!", "Ayudante de Mercado",
                    JOptionPane.ERROR_MESSAGE);
                    
                    listaProductos.remove(i);
                    listaPrecios.remove(i);
                    
                    continue; 
                }
           
                cantidadProductos = listaProductos.size();
                precioTotal = precioTotal + precioProducto;
           
                i++;
                    
                presupuesto = presupuesto - precioProducto;
                
                
           
                ctrl = JOptionPane.showInputDialog(null, "Le quedan: $" + presupuesto + 
                ". \n Si desea añadir otro producto digite 1, si no, digite 0:", "Aydante de mercado", JOptionPane.INFORMATION_MESSAGE);
                control = Integer.parseInt(ctrl); 
                
            }
                    //Llamada al método de mostrar lista
                           
                    miLista.listaProductos(listaProductos, listaPrecios); 
                    
                    //Llamada al método para mostrar totales
                    miLista.totales(precioTotal, cantidadProductos, presupuesto); 
                    
                    
             
        }
}