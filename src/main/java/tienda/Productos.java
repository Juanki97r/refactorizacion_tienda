package tienda;

public class Productos {
    private String nombre;
    private double precio;
    private int stock;
    
    public Productos(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //constructor vacio que podria ser útil
    public Productos() {
    }
    
    //constructor solo con el nombre 
    public Productos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
    public String toString() {
        return "Producto => " + nombre + ", precio: " + precio + ", stock: " + stock +"\n";
    }

    
    //hago el equals con el nombre para que se comparen los productos por el nombre

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Productos other = (Productos) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    
    
    
}
