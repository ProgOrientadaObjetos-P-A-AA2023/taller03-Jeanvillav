
package paquete1;

/**
 *
 * @author Jean Villavicencio
 */
public class Terreno1 {
    private double costo_terreno;
    private double largo;
    private double ancho;
    private double area;
    private double valorMetroCuadrado;
    
    public void establecerMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }
    
    public void establecerLargo(double c){
        largo = c;
    }
    
    public void establecerAncho(double c){
        ancho = c;
    }
     public void establecerArea(){
        area = largo * ancho;
    }
    
    // public void establecerCostoTerreno(){
    public void calcularCostoTerreno(){
        costo_terreno = valorMetroCuadrado * area ;
    }
    
    public double obtenerMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerArea(){
        return area;
    }
    public double obtenerCostoTerreno(){
        return costo_terreno;
    }
            
}
