/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;
/**
 *
 * @author Lupe Carolina
 */
public class DispositivosElectronicos {
    private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String imei;
    

    
    public void establecerSistemaOperativo(String c){
        sistemaOperativo = c;
    }
    public void establecerTamanioPantalla(double c){
        tamanioPantalla = c;
    }
    
    public void establecerCostoInicial(double c){
        costoInicial = c;
    }
    
    public void establecerIvaPorcentaje(double c){
        ivaPorcentaje = c;
    }
     public void calcularIvaCostoInicial(){
        ivaCostoInicial = (ivaPorcentaje/100) * costoInicial;
    }
    public void calcularCostoFinal (){
        costoFinal = costoInicial + ivaCostoInicial;
    }
    

    public void establecerDireccionMac(String c){
        direccionMac = c;
    }
    public void establecerImei(String c){
        imei = c;
    }

    
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public double obtenerTamanioPantalla(){
        return tamanioPantalla;
    }
    
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    
    public double obtenerIvaPorcentaje(){
        return ivaPorcentaje;
    }
    public double obtenerIvaCostoInicial(){
        return ivaCostoInicial;
    }
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    public String obtenerImei(){
    return imei;
    }
}
