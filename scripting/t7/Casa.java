
package Tarea7;

import java.util.*;


// https://www.w3schools.com/java/java_inheritance.asp

public class Casa extends Vivienda
{

  private double superficieTechada;

  public Casa(double superficieTechada, String direccion, double superficie){
    super(direccion, superficie);
    this.superficieTechada = superficieTechada;
  }

  public double gerPorcentajeSuperficieTechada(){

    return (this.superficieTechada/super.superficie)*100;
  }

}
