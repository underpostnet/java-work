


package Final;

import Final.*;
import java.util.Date;

public class Final {

  /*

  String
  double
  int
  boolean isJavaFun = true;

  status class arr[];

  */

  public static void main(String[] args){

      String testDestinos[] = {
        "Concepcion",
        "Valdivia",
        "Ozorno",
        "Puerto Montt",
        "Puerto Varas",
        "Chiloe"
      };

      Empresa empresa = new Empresa("Buses Chile", testDestinos);

      empresa.agregarBusDisponible(new Bus(
            new Date().getTime(), "Puerto Montt"
      ));


  }

}
