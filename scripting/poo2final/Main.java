
package Main;

import Main.*;

import java.util.*;
import java.util.ArrayList;

// ABSTRACT FACTORY

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

// FACADE

interface Location {

   String getDirection();

}


class Supplier implements Location {

	 private String direction;

	 public Supplier(String direction){
		 this.direction = direction;
	 }


   @Override
   public String getDirection() {
      return this.direction;
   }
}

class BranchOffice implements Location {

	 private String direction;

	 public BranchOffice(String direction){
		 this.direction = direction;
	 }


   @Override
   public String getDirection() {
      return this.direction;
   }
}


class FacadeLocationMaker {
   private Location branchOffice;
   private Location supplier;

   public FacadeLocationMaker(String directionBranchOffice, String directionSupplier) {
      this.branchOffice = new BranchOffice(directionBranchOffice);
      this.supplier = new Supplier(directionSupplier);
   }

   public String getDirectionBranchOffice(){
      return this.branchOffice.getDirection();
   }

   public String getDirectionSupplier(){
      return this.supplier.getDirection();
   }

}


// MAIN TEST

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

			// cada sucursal va asociado al menos a 1 proeveedor

			FacadeLocationMaker locationMaker = new FacadeLocationMaker(
				"Los liras 432",
				"Alvarez 267"
			);

			 System.out.println(locationMaker.getDirectionBranchOffice());
			 System.out.println(locationMaker.getDirectionSupplier());


  }


}







// end
