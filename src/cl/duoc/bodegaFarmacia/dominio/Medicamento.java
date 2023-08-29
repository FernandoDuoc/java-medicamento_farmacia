package cl.duoc.bodegaFarmacia.dominio;


public class Medicamento {
    //Atributo
    private String nombre;
    private int precio;
    private int stock;
    private Laboratorio laboratorio;
    
    //COnstructor vacío
    public Medicamento() {
        laboratorio = new Laboratorio(); //Instanciar
    }
    
    //Constructor con parámetros
    public Medicamento(String nombre, int precio, int stock, Laboratorio laboratorio) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.laboratorio = laboratorio;
    }
    
    //Encapsulamiento
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getPrecio() {
        return precio;
    }


    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public int getStock() {
        return stock;
    }


    public void setStock(int stock) {
        this.stock = stock;
    }


    public Laboratorio getLaboratorio() {
        return laboratorio;
    }


    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
    
    //Métodos
    public void mostrar(){
        System.out.println("DATOS MEDICAMENTOS");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Stock: "+this.stock);
        this.getLaboratorio().mostrar();
    }
    
    public int Valorizar(){
        return (this.precio*this.stock);
    }
}
