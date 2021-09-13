


package Tarea4;

import Tarea4.*;

public class Tarea4 {

  public static void main(String[] args){

          System.out.println("\n > test instancia: \n");
          Persona test = new Persona("fco", "18935903-9", "verdugo", 26, 't', 68.0, 1.73);
          test.view();

          System.out.println("calcularIMC() -> "+test.calcularIMC());
          System.out.println("esMayorDeEdad() -> "+test.esMayorDeEdad());

          System.out.println("\n > test seteo: \n");
          test.setNombre("ayleen");
          test.setApellido("bertini");
          test.setRUT();
          test.setEdad(17);
          test.setSexo('M');
          test.setPeso(30.2);
          test.setAltura(1.72);
          test.view();

          System.out.println("calcularIMC() -> "+test.calcularIMC());
          System.out.println("esMayorDeEdad() -> "+test.esMayorDeEdad());


  }

}
