package tienda;

import java.util.ArrayList;
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

    public void aniadir(Productos producto){
        inventario.add(producto);
    }
    
    public void vender (String nombreProducto){
        //creo un prodcuto referencia al cual voy a cogerle el nombre
        //para ver si esta en la lista y si esta, le descuento en una unidad el stock
        Productos productoAVender = new Productos(nombreProducto);

        
        for(int i =0; i<inventario.size(); i++){
            if ( inventario.get(i).equals(productoAVender)) {
                productoAVender.setStock(productoAVender.getStock()-1);

                if(productoAVender.getStock()==0){
                    inventario.remove(productoAVender);
                }
            }
        }
    }
}
