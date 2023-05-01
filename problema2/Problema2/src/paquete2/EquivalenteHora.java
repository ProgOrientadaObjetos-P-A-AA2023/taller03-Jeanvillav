/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;


public class EquivalenteHora {
    
    private double horas;
    private double dias;
    private double segundos;
    private double minutos;

    
    public void establecerHoras(double c){
        horas = c;
    }
    
    public void calcularDias(){
        dias = horas / 24;
    }
    
    public void calcularMinutos(){
        minutos = horas * 60 ;
    }
     public void calcularSegundos(){
        segundos = horas * 3600;
    }
    
    // public void establecerCostoTerreno(){
    public double obtenerHoras(){
        return horas;
    }
    
    public double obtenerDias(){
        return dias;
    }
    
    public double obtenerMinutos(){
        return minutos;
    }
    
    public double obtenerSegundos(){
        return segundos;
    }
    

    
}
