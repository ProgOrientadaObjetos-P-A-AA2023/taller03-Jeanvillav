
package problema4;
import paquete2.DispositivosElectronicos;

/**
 *
 * @author Jean Villavicencio
 */
public class Ejecutor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        DispositivosElectronicos de = new DispositivosElectronicos();
        String sO = "IOS";
        double tP = 6.06; 
        double cI = 1150.90;
        double iP = 12;
        String dM = "00:1B:44:11:3A:B7";
        String i = "010928/00/389023/3.";
        
        de.establecerSistemaOperativo(sO);
        de.establecerTamanioPantalla(tP);
        de.establecerCostoInicial(cI);
        de.establecerIvaPorcentaje(iP);
        de.establecerDireccionMac(dM);
        de.establecerImei(i);
        de.calcularIvaCostoInicial();
        de.calcularCostoFinal();
        
        System.out.println("Dispositivos Electronicos");
        System.out.println("========================");
        System.out.println("Sistema Operativo: "+ de.obtenerSistemaOperativo());
        System.out.println("Tamanio de la Pantalla: "+ de.obtenerTamanioPantalla());
        System.out.println("Costo Inicial: "+ de.obtenerCostoInicial());
        System.out.println("Iva en porcentaje: "+ de.obtenerIvaPorcentaje()+"%");
        System.out.println("Direccion Mac: "+ de.obtenerDireccionMac());
        System.out.println("IMEI: "+ de.obtenerImei());
        System.out.println("Iva del costo inicial: $"+ de.obtenerIvaCostoInicial());
        System.out.println("Costo Final: $"+ de.obtenerCostoFinal());
                     
    }
        
    }

    

