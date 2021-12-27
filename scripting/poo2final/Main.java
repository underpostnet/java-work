
package Main;

import Main.*;

import java.util.*;
import java.util.ArrayList;




interface Human {

   String getRut();

}


class Employee implements Human {

	 private String rut;

	 public Employee(String rut){
		 this.rut = rut;
	 }


   @Override
   public String getRut() {
      return this.rut;
   }
}

class Client implements Human {

	 private String rut;

	 public Client(String rut){
		 this.rut = rut;
	 }

   @Override
   public String getRut() {
      return this.rut;
   }
}

abstract class AbstractFactory {
   abstract Human getHuman(String humanType, String rut);
}


class HumanFactory extends AbstractFactory {
   @Override
   public Human getHuman(String humanType, String rut){
      if(humanType.equalsIgnoreCase("CLIENTE")){
         return new Client(rut);
      }else if(humanType.equalsIgnoreCase("EMPLEADO")){
         return new Employee(rut);
      }
      return null;
   }
}



public class Main {

  public static void main(String[] args){

      System.out.println(" \n \n Main test -> \n");
      System.out.println(" -------------------------------------------- \n");


			AbstractFactory humanFactory = new HumanFactory();

      Human clientA = humanFactory.getHuman(
				"CLIENTE",
				"16538675-3"
			);
			System.out.println(clientA.getRut());

			Human employeeA = humanFactory.getHuman(
				"EMPLEADO",
				"18648175-3"
			);
			System.out.println(employeeA.getRut());






  }


}







// end
