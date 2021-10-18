


package Final;

import Final.*;

import java.util.*;
import java.util.ArrayList;

public class Final {

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

      empresa.agregarBusDisponible(
        new Bus(
          (new Date().getTime()+(3*60*60*24*1000)), // en 3 dias
          "Puerto Montt"
        )
      );


      ArrayList<Cliente> testClientes = new ArrayList<Cliente>();
      testClientes.add(new Cliente("18.934.986-7", "Francisco", 26));
      testClientes.add(new Cliente("19.644.566-2", "Ayleen", 7));
      testClientes.add(new Cliente("15.634.166-2", "Jose", 66));

      long fechaPasaje = (new Date().getTime()+(10*60*60*24*1000));
      
      empresa.reservarPasaje(
          testClientes,
          "Puerto Montt",
          fechaPasaje // en menos de 10 dias
      );

      empresa.reservarPasaje(
          testClientes,
          "Puerto Montt",
          fechaPasaje // en menos de 10 dias
      );


  }

}
