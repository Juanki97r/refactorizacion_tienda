package tienda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * CÓDIGO CON CODESMELLING
 * 
 *   TODO: Este código necesita un refactorización urgente.
 * - Eliminar la "Clase Dios" que es todo el main
 * - Usar programación orientada a objetos
 * - Eliminar números fijos introducidos en el código (no están dentro de variables).
 * - Mejorar la gestión de logs (Patrón Singleton).
 */
public class Tienda {

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /** El primer cambio se trata de la forma de alamacenar y gestionar los productos y el inventario
         * tendremos una clase producto y una lista de inventario que tendran los metodos necesarios para la
         * operarotia de la tienda. Además es mejor asi ya que permite a la tienda dividir los inventarios por tipos
         * de producto su lo quisiera (lista de chaquetas, de pantalones, de ropa de hombre, de mujer, etc)
         */

        /**Creamos la lista y probamos que las acciones de añadir productos y vender funcinen correctamente */
        ListaProductos inventario = new ListaProductos();
       

         
        //  inventario.aniadir(new Productos("Camiseta", 20.0,2));
        //  inventario.aniadir(new Productos("Pantalon", 30.0,1));
        //  inventario.aniadir(new Productos("Chaleco", 15.0,1));
        //  inventario.aniadir(new Productos("blusa", 10.0,1));
        //  System.out.println(inventario);
        //  System.out.println("------------Despues de hacer una venta----------");
        //  inventario.vender("Camiseta");
        //  inventario.vender("blusa");
        //   System.out.println(inventario);
       
        /** vamos a refactorizar el bucle añadiendo dentro un Switch en lugar de la estructura if else que tiene
         * 
         */
        
            System.out.println("\n--- TIENDA ---");
            System.out.println("1. Añadir producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Realizar venta");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            int op = sc.nextInt();
            boolean control = true;
            while(control){
            switch (op) {
                case 1 ->{
                    System.out.println("Introduce el nombre:");
                    String nombre = sc.next();
                    System.out.println("Introduce el precio:");
                    double precio= sc.nextDouble();
                    System.out.println("Introduce el stock que vas a añadir:");
                    int stock = sc.nextInt();
                    inventario.aniadir(nombre, precio, stock);
                }

                case 2->{
                    System.out.println("--INVENTARIO ACTUAL--");
                    System.out.println(inventario);
                }
                case 3->{
                    System.out.println("Introduce el producto que quieres vender:");
                    String venta = sc.next();
                    inventario.vender(venta);
                    System.out.println("Venta satisfactoria");
                }
                case 4->{
                    control =false;
                }
            }
              sc.close();
        }
       
       
    }
    }


