package problema1.paquete2;
import paquete1.Terreno1;
/**
 *
 * @author Jean Villavicencio
 */
public class Ejecutor1 {
    public static void main (String[] args){
         // Crear un objeto de tipo Terreno1
        Terreno1 tr = new Terreno1();
        // Valores de entrada
        double largo = 60;
        double ancho = 40;
        double metroCuadrado = 1000; 
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        tr.establecerMetroCuadrado(metroCuadrado);
        tr.establecerAncho(ancho);
        tr.establecerLargo(largo);
        // hasta aquí el objeto ya tiene valores para sus atributos:
        // ancho,largo,valor del metro cuadrado
        // LLamo al método calcularValorFactura, no se envía parámetros,
        // pues trabaja con los valores de los atributos: ancho,largo,valor del metro cuadrado;
        // que ya los tiene el 
        // objeto.
        
        tr.establecerArea();
        tr.calcularCostoTerreno();
        
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
        System.out.printf("Costo de Terreno\n\nAncho del Terreno: %s\n"
                + "Largo del Terreno: %.2f\nValor del metro cuadrado: %.2f\n"
                + "Costo Total del Terreno: %.2f\n", tr.obtenerAncho(),
                tr.obtenerLargo(), tr.obtenerMetroCuadrado(),
                tr.obtenerCostoTerreno());
    }
    }

