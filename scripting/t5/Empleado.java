
package Tarea5;

import java.util.*;


// https://www.w3schools.com/java/java_inheritance.asp

public class Empleado
{

  private String nombre;
  private String apellido;
  private double sueldo;
  private int edad;

  public Empleado(
  String nombre,
  String apellido,
  double sueldo,
  int edad){
    this.nombre = nombre;
    this.apellido = apellido;
    this.sueldo = sueldo;
    this.edad = edad;
  }




  public String getNombre(){
    return this.nombre;
  }
  public String getApellido(){
    return this.apellido;
  }
  public double getSueldo(){
    return this.sueldo;
  }



  public String devuelveNombre(Empleado empleado){
   return empleado.getNombre()+" "+empleado.getApellido();
  }
  public double devuelveSueldoLiquido(Empleado empleado){
   return empleado.getSueldo()*0.9;
  }





  public void view(){
    System.out.println("nombre:"+this.nombre);
    System.out.println("apellido:"+this.apellido);
    System.out.println("sueldo:"+this.sueldo);
    System.out.println("edad:"+this.edad);
  }



}
