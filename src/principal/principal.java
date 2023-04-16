/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Electrodomestico;
import servicio.ServicioElectrodomestico;

/**
 *
 * @author lucho
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioElectrodomestico se = new ServicioElectrodomestico();
        
        Electrodomestico aparato1 = se.crearElectrodomestico();
        
        System.out.println(" ");
        System.out.println("DATOS DEL PRODUCTO");
        System.out.println("Precio: $"+ aparato1.getPrecio());
        System.out.println("Letra: "+aparato1.getConsumoEnergetico());
        System.out.println("Peso: "+aparato1.getPeso());
        System.out.println("Color: "+ aparato1.getColor());
        
        
        
    }
    
}
