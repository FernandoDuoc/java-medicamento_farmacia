package cl.duoc.bodegaFarmacia.dominio;


public class Laboratorio {
    
    //atributos
    private String nombre;
    private String direccion;
    private String pais;
    
    //Constructor vacío
    public Laboratorio() {
    }
    
    //Constructor Con parámetros
    public Laboratorio(String nombre, String direccion, String pais) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais = pais;
    }

    //Encapsulamiento
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getPais() {
        return pais;
    }


    public void setPais(String pais) {
        this.pais = pais;
    }
    
    //Métodos
    public void mostrar(){
        System.out.println("DATOS LABORATORIO");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Dirección: "+this.direccion);
        System.out.println("País: "+this.pais);
    
    }
    
}
