/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;
import paquete2.EquivalenteHora;
/**
 *
 * @author Jean Villavicencio
 */
public class Ejecutor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EquivalenteHora eh = new EquivalenteHora();
       int h = 78;
       
       eh.establecerHoras(h);
       eh.calcularDias();
       eh.calcularMinutos();
       eh.calcularSegundos();
       
       System.out.printf("Equivalente Horas\n\nCantidad de horas: %1s\n"
                + "Su equivalente de horas a dias es: %1s\nSu equivalente de horas a minutos es: %2s\n"
                + "Su equivalente de horas a segundos es: %2s\n", eh.obtenerHoras(),
                eh.obtenerDias(), eh.obtenerMinutos(),
                eh.obtenerSegundos());
    }
    
}
