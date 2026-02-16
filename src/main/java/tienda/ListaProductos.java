package tienda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaProductos {
    private List<Productos> inventario;
    
    public ListaProductos(){
        this.inventario = new ArrayList<>();
    }


    public List<Productos> getInventario() {
        return inventario;
    }
    public int tamanio(){
       return inventario.size();
    }
    

    public void setInventario(List<Productos> inventario) {
        this.inventario = inventario;
    }

   
    public String toString() {
        return "Inventario total => " + inventario+ "\n";
    }

    public Productos verProducto(int pos){
      return inventario.get(pos);
    }

    public void aniadir(String nombre, double precio, int stock){
        Productos producto = new Productos(nombre,precio,stock);
       if(inventario.add(producto)){
        System.out.println("Producto añadido correctamente");
       } 
    }
   
    
    public void vender (String nombreProducto){
        //creo un prodcuto referencia al cual voy a cogerle el nombre
        //para ver si esta en la lista y si esta, le descuento en una unidad el stock
        Productos productoAVender = new Productos(nombreProducto);

        
        for(int i =0; i<inventario.size(); i++){
            if ( inventario.get(i).equals(productoAVender)) {
                this.inventario.get(i).setStock(this.inventario.get(i).getStock()-1);

                if(this.inventario.get(i).getStock()==0){
                    this.inventario.remove(this.inventario.get(i));
                }
            } else{ System.out.println("Producto no encontrado");}
        }
    }
}
