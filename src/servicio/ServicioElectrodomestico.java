/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class ServicioElectrodomestico {
    
    Scanner leer = new Scanner(System.in);
    
    public Electrodomestico crearElectrodomestico(){
        
                
        System.out.println("Ingres el color: ");
        String color = leer.next();
        System.out.println("Ingres la letra según el consumo: ");
        char consumo = leer.next().charAt(0);
        System.out.println("Ingres el peso: ");
        Double peso = leer.nextDouble();
        
        int precio = precioFinal(consumo, peso);
        
        return new Electrodomestico(color, consumo, peso, precio);
        
    }
    
    public int precioFinal(char letra, Double peso){
        
        int precio = 1000;
        int precioa = 1000;
        int preciob = 800;
        int precioc = 600;
        int preciod = 500;
        int precioe = 300;
        int preciof = 100;
        
        
        if (letra == 'a'){
            if (peso>=1 && peso<20){
                precio = (precio+precioa+100);
            }else if (peso>=20 && peso <50){
                precio = (precio+precioa+500);
            }else if (peso>=50 && peso <79){
                precio = (precio+precioa+800);
            }else if(peso>=80){
                precio = (precio+precioa+1000);
            }
        }
        
        if (letra == 'b'){
            if (peso>=1 && peso<20){
                precio = (precio+preciob+100);
            }else if (peso>=20 && peso <50){
                precio = (precio+preciob+500);
            }else if (peso>=50 && peso <79){
                precio = (precio+preciob+800);
            }else if(peso>=80){
                precio = (precio+preciob+1000);
            }
        }
                
        if (letra == 'c'){
            if (peso>=1 && peso<20){
                precio = (precio+precioc+100);
            }else if (peso>=20 && peso <50){
                precio = (precio+precioc+500);
            }else if (peso>=50 && peso <79){
                precio = (precio+precioc+800);
            }else if(peso>=80){
                precio = (precio+precioc+1000);
            }
        }        
        
        if (letra == 'd'){
            if (peso>=1 && peso<20){
                precio = (precio+preciod+100);
            }else if (peso>=20 && peso <50){
                precio = (precio+preciod+500);
            }else if (peso>=50 && peso <79){
                precio = (precio+preciod+800);
            }else if(peso>=80){
                precio = (precio+preciod+1000);
            }
        }
        
        if (letra == 'e'){
            if (peso>=1 && peso<20){
                precio = (precio+precioe+100);
            }else if (peso>=20 && peso <50){
                precio = (precio+precioe+500);
            }else if (peso>=50 && peso <79){
                precio = (precio+precioe+800);
            }else if(peso>=80){
                precio = (precio+precioe+1000);
            }
        }
                
        if (letra == 'f'){
            if (peso>=1 && peso<20){
                precio = (precio+preciof+100);
            }else if (peso>=20 && peso <50){
                precio = (precio+preciof+500);
            }else if (peso>=50 && peso <79){
                precio = (precio+preciof+800);
            }else if(peso>=80){
                precio = (precio+preciof+1000);
            }
        }
                
        return precio;
    }
    
    
    
    
}
