/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author lucho
 */
public class Electrodomestico {
    
    protected int precio = 1000;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico( String color, char consumoEnergetico, Double peso, int precio) {
        
       // El color ingresado, que va a definir el color. Primero para por el metodo comprobarColor.
        this.color = comprobarColor(color);      
        //La letra del consumoEnergetico primero para por el metodo comprobarConsumoEnergetica, devolviendo el valor correspondiente.
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    //Metodo que comprueba si la letra ingresada no esta en la lista, coloca la letra f por defecto.
    private char comprobarConsumoEnergetico(char letra){
        
               
        if ((letra!='a') && (letra!='b') && (letra!='c') && (letra!='c') && (letra!='d') && (letra!='e') && (letra!='f')){
            
            letra = 'f';
           
        }    

                
        return letra;
    }
    
    
    // Metodo que comprueba si el color esta en la lista, sino coloca el color blanco por defecto.
    
    private String comprobarColor(String color){
        
        if (!color.equalsIgnoreCase("blanco") && 
        !color.equalsIgnoreCase("negro") && 
        !color.equalsIgnoreCase("rojo") && 
        !color.equalsIgnoreCase("azul") && 
        !color.equalsIgnoreCase("gris")) {
            color = "blanco";
            
        }
                
        
        return color;
    }
    
    
    
    
    
}
