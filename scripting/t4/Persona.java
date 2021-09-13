
package Tarea4;

import java.util.*;

public class Persona
{

  private String nombre;
  private String RUT;
  private String apellido;
  private int edad;
  private char sexo;
  private double peso;
  private double altura;

  public Persona(){
    this.sexo = 'H';
    this.RUT = this.generRut();
  }

  public Persona(String nombre, int edad, char sexo){
    this.sexo = this.comprobarSexo(sexo);
    this.edad = edad;
    this.nombre = nombre;
    this.RUT = this.generRut();
  }

  public Persona(
  String nombre,
  String RUT,
  String apellido,
  int edad,
  char sexo,
  double peso,
  double altura
  ){
    this.nombre = nombre;
    this.RUT = RUT;
    this.apellido = apellido;
    this.edad = edad;
    this.sexo = this.comprobarSexo(sexo);
    this.peso = peso;
    this.altura = altura;
  }

  private String generRut(){
    return this.randomNumber(10000000, 99999999)+"-"+this.randomNumber(0, 9);
  }

  private int randomNumber(int max, int min){
    return (int)Math.floor(Math.random()*(max-min+1)+min);
  }



  public int calcularIMC(){
    final int nose = -1;
    final int bajopeso = 0;
    final int sobrepeso = 1;
    //   (peso enkg/(altura^2 en m)),
    double IMC = (this.peso/Math.pow(this.altura,2));
    if(IMC < 20){
      return nose;
    }
    if( (IMC >= 20)&&(IMC <=25) ){
      return bajopeso;
    }
    return sobrepeso;
  }

  public boolean esMayorDeEdad(){
    return this.edad >= 18;
  }

  private char comprobarSexo(char sexo){
    if(sexo=='H' || sexo=='M'){
      return sexo;
    }else{
      return 'H';
    }
  }




  public void setNombre(String nombre){this.nombre = nombre;}
  public void setApellido(String apellido){this.apellido = apellido;}
  public void setRUT(){this.RUT = this.generRut();}
  public void setEdad(int edad){this.edad = edad;}
  public void setSexo(char sexo){this.sexo = this.comprobarSexo(sexo);}
  public void setPeso(double peso){this.peso = peso;}
  public void setAltura(double altura){this.altura = altura;}



  public void view(){
    System.out.println("nombre:"+this.nombre);
    System.out.println("RUT:"+this.RUT);
    System.out.println("apellido:"+this.apellido);
    System.out.println("edad:"+this.edad);
    System.out.println("sexo:"+this.sexo);
    System.out.println("peso:"+this.peso);
    System.out.println("altura:"+this.altura);
  }



}
