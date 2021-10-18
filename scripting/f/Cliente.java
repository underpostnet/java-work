


package Final;

import Final.*;

import java.util.*;
import java.util.ArrayList;


public class Cliente {

  private String rut;
  private String nombre;
  private int edad;

  public Cliente(String rut, String nombre, int edad){
    this.rut = rut;
    this.nombre = nombre;
    this.edad = edad;
  }

  public int getEdad(){
    return this.edad;
  }

  public String getNombre(){
    return this.nombre;
  }

  public String getRut(){
    return this.rut;
  }


}
