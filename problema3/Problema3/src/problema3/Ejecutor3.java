/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;
import paquete2.InstitucionesEducativas;
/**
 *
 * @author Jean Villavicencio
 */
public class Ejecutor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InstitucionesEducativas ie = new InstitucionesEducativas();
        String nI = "Daniel Alvarez Burneo";
        String tI = "Fiscomisional"; 
        int nA = 900;
        int nD = 570;
        int nS = 200;
        double gPE = 3000;
        
        ie.establecerNombre(nI);
        ie.establecerTipoInstitucion(tI);
        ie.establecerNumeroAlumnos(nA);
        ie.establecerNumeroDocentes(nD);
        ie.establecerNumeroSedes(nS);
        ie.establecerGastoProyectadoEstudiante(gPE);
        ie.calcularPresupuesto();
        
        
        System.out.println("Instituciones Educativas");
        System.out.println("========================");
        System.out.println("Nombre de la Institucion: "+ ie.obtenerNombre());
        System.out.println("Tipo de Institucion: "+ ie.obtenerTipoInstitucion());
        System.out.println("Numero de Alumnos: "+ ie.obtenerNumeroAlumnos());
        System.out.println("Numero de Docentes: "+ ie.obtenerNumeroDocentes());
        System.out.println("Numero de Sedes: "+ ie.obtenerNumeroSedes());
        System.out.println("Gastos proyectador por estudiante: "+ ie.obtenerGastoProyectadoEstudiante());
        System.out.println("Presupuesto: $"+ ie.obtenerPresupuesto());
                     
    }
    
}
