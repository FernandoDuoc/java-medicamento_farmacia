package cl.duoc.bodegaFarmacia.ejecutable;

import cl.duoc.bodegaFarmacia.dominio.*;
import java.util.Scanner;


public class ProgramaFarmacia2 {


    public static void main(String[] args) {
        int opcion = 0;
        Scanner ingreso = new Scanner(System.in);
        Laboratorio lab = new Laboratorio();
        Medicamento med = new Medicamento();
        do{
            
            System.out.println("MENÚ");
            System.out.println("1.- Registrar medicamento");
            System.out.println("2.- Mostrar datos del medicamento");
            System.out.println("3.- Valorizar medicamento");
            System.out.println("4.- Salir");
            System.out.println("Ingrese su opcion (1 - 4): ");
            opcion = ingreso.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingreso de laboratorio");
                    System.out.println("Ingrese nombre del laboratorio: ");
                    String varNombreLab = ingreso.next();
                    lab.setNombre(varNombreLab);
                    
                    System.out.println("Ingrese la dirección: ");
                    String varDireccion = ingreso.next();
                    lab.setDireccion(varDireccion);
                    
                    System.out.println("Ingrese el país: ");
                    String varPais = ingreso.next();
                    lab.setPais(varPais);
                    
                    System.out.println("Ingreso del medicamento");
                    System.out.println("Ingrese nombre del medicamento: ");
                    String varNombreMed = ingreso.next();
                    med.setNombre(varNombreMed);
                    
                    System.out.println("Ingrese su precio: ");
                    int varPrecio = ingreso.nextInt();
                    med.setPrecio(varPrecio);
                    
                    System.out.println("Ingrese el stock: ");
                    int varStock = ingreso.nextInt();
                    med.setStock(varStock);
                    med.setLaboratorio(lab);
                    break;
                    
                case 2:
                    med.mostrar();
                    break;
                    
                case 3:
                    int valor = med.Valorizar();
                    System.out.println("Valor: $"+valor);
                    break;
            
            }
        
        
        
        }while(opcion != 4);
    }
    
}
