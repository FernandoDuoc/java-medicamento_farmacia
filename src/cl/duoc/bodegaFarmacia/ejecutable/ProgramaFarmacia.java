package cl.duoc.bodegaFarmacia.ejecutable;

import cl.duoc.bodegaFarmacia.dominio.*;
import java.util.Scanner;

public class ProgramaFarmacia {


    public static void main(String[] args) {
        
        Laboratorio lab = new Laboratorio("bayer","calle 123", "alemania");
        Medicamento med = new Medicamento("tapsin", 1200, 500, lab);
        med.mostrar();
    }
    
}
