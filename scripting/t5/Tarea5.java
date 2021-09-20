


package Tarea5;

import Tarea5.*;

public class Tarea5 {

  public static void main(String[] args){

          System.out.println("\n instancia: \n");
          Empleado test = new Empleado("francisco", "verdugo", 10000.5, 26);
          test.view();

          System.out.println("\n test: \n\ndevuelveNombre() -> "+test.devuelveNombre(test));
          System.out.println("devuelveSueldoLiquido() -> "+test.devuelveSueldoLiquido(test));

  }

}
