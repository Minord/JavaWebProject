package app.models;

/**
 *
 * @author Orellana
 * 
 * Esta clase es parte de paquete models (Modelos) por el hecho de que en este 
 * modulo existen las clases que en realidad no dependen del framework de java
 * ni de la base de datos solo  define un tipo Producto al que manejaremos como
 * tipo de objeto para hacer mas claro y facil la gestion de objetos ya en la
 * recuperacion en la base de datos
 */
public class Producto {
    
    //Esto es para crear las variables del producto
    private int id;         //Identificacdor del prducto en la base de datos
    private String nombre;  //Nombre del producto
    private int cantidadEnStock; //Cantidad de de productos en stock
    private String categoria;   //El nombre de la categoria a la que pertenece
    private float precio;       //El precio en USD dolares
    
    
    
    public Producto(){}
    
    //Constructor de producto sin id
    public Producto(String nombre, int cantidadEnStock,
                    String categoria,float precio){
        this.nombre = nombre;
        this.cantidadEnStock = cantidadEnStock;
        this.categoria = categoria;
        this.precio = precio;
        //Añadir mas elementos
    }
    
    //Constructor de producto para entidad ya existente
    public Producto(int id, String nombre, int cantidadEnStock,
                    String categoria,float precio){
        this.id = id;
        this.nombre = nombre;
        this.cantidadEnStock = cantidadEnStock;
        this.categoria = categoria;
        this.precio = precio;
        //Añadir mas elementos
    }
    
    //Todos los Getters y los Setters 
    
    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPrecio() {
        return precio;
    }
    
    //Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
