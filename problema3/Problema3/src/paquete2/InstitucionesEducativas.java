/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Jean Villavicencio
 */
public class InstitucionesEducativas {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastoProyectadoEstudiante;
    private double presupuesto;

    
    public void establecerNombre(String c){
        nombre = c;
    }
    public void establecerTipoInstitucion(String c){
        tipoInstitucion= c;
    }
    
    public void establecerNumeroAlumnos(int c){
        numeroAlumnos = c;
    }
    
    public void establecerNumeroDocentes(int c){
        numeroDocentes = c;
    }
     public void establecerNumeroSedes(int c){
        numeroSedes = c;
    }
    public void establecerGastoProyectadoEstudiante (double c){
        gastoProyectadoEstudiante = c;
    }
    public void calcularPresupuesto(){
        presupuesto =  numeroAlumnos * gastoProyectadoEstudiante;
    }
    // public void establecerCostoTerreno(){
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    
    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }
    public double obtenerGastoProyectadoEstudiante(){
        return gastoProyectadoEstudiante;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
