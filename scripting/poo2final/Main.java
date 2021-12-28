
package Main;

import Main.*;

import java.util.*;
import java.util.ArrayList;

// ABSTRACT FACTORY

interface Human {

   String getRut();
   String getName();

}


class Employee implements Human {

	 private String rut;
   private String name;

	 public Employee(String rut, String name){
		 this.rut = rut;
     this.name = name;
	 }


   @Override
   public String getRut() {
      return this.rut;
   }

   @Override
   public String getName() {
      return this.name;
   }
}

class Client implements Human {

	 private String rut;
   private String name;

	 public Client(String rut, String name){
		 this.rut = rut;
     this.name = name;
	 }

   @Override
   public String getRut() {
      return this.rut;
   }

   @Override
   public String getName() {
      return this.name;
   }
}

abstract class AbstractFactory {
   abstract Human getHuman(String humanType, String rut, String name);
}


class HumanFactory extends AbstractFactory {
   @Override
   public Human getHuman(String humanType, String rut, String name){
      if(humanType.equalsIgnoreCase("CLIENTE")){
         return new Client(rut, name);
      }else if(humanType.equalsIgnoreCase("EMPLEADO")){
         return new Employee(rut, name);
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

// MEMENTO

class Sale
{
	private String type;
  private Human client;
  private String[] items;
  private String time;
  private int amount;

	public void set(String type,
                  Human client,
                  String[] items,
                  String time,
                  int amount)
	{
		System.out.println("Setting sale " + type);
    this.type = type;
    this.client = client;
    this.items = items;
    this.time = time;
    this.amount = amount;
	}

	public Memento saveToMemento()
	{
		System.out.println("Saving sale to Memento");
		return new Memento(this.type,
                        this.client,
                        this.items,
                        this.time,
                        this.amount);
	}

	public void restoreFromMemento(Memento memento)
	{
    this.type = memento.getSavedType();
    this.client = memento.getSavedClient();
    this.items = memento.getSavedItems();
    this.time = memento.getSavedTime();
    this.amount = memento.getSavedAmount();
		System.out.println("\n sale restored from Memento: ");
    System.out.println(this.type);
    System.out.println(this.client.getRut());
    System.out.println(this.client.getName());
    System.out.println(Arrays.toString(this.items));
    System.out.println(this.time);
    System.out.println(this.amount);
	}

}


class Memento
{

  private final String type;
  private final Human client;
  private final String[] items;
  private final String time;
  private final int amount;

  public Memento(String type,
                  Human client,
                  String[] items,
                  String time,
                  int amount)
  {
    this.type = type;
    this.client = client;
    this.items = items;
    this.time = time;
    this.amount = amount;
  }

  public String getSavedType(){
    return type;
  }

  public Human getSavedClient(){
    return client;
  }

  public String[] getSavedItems(){
    return items;
  }

  public String getSavedTime(){
    return time;
  }

  public int getSavedAmount(){
    return amount;
  }

}

// MAIN TEST

public class Main {

  public static void main(String[] args){

      System.out.println(" \n \n Main test -> \n");
      System.out.println(" -------------------------------------------- \n");

      // se crean empleados y clientes
      // con patron AbstractFactory

			AbstractFactory humanFactory = new HumanFactory();


      System.out.println(" \n new client -> ");
      Human clientA = humanFactory.getHuman(
				"CLIENTE",
				"16538675-3",
        "Francisco Verdugo"
			);
			System.out.println(clientA.getRut());
      System.out.println(clientA.getName());

      System.out.println(" \n new client -> ");
      Human clientB = humanFactory.getHuman(
				"CLIENTE",
				"14533675-8",
        "Juan Perez"
			);
			System.out.println(clientB.getRut());
      System.out.println(clientB.getName());

      System.out.println(" \n new client -> ");
			Human employeeA = humanFactory.getHuman(
				"EMPLEADO",
				"18648175-3",
        "Maria paz"
			);
			System.out.println(employeeA.getRut());
      System.out.println(employeeA.getName());

			// cada sucursal va asociado al menos a 1 proeveedor
      // utilizando patron facade

      System.out.println(" \n new Supplier and BranchOffice -> ");
			FacadeLocationMaker locationMaker = new FacadeLocationMaker(
				"Los liras 432",
				"Alvarez 267"
			);

			 System.out.println(locationMaker.getDirectionBranchOffice());
			 System.out.println(locationMaker.getDirectionSupplier());

       // memento test con items

       List<Memento> savedSales = new ArrayList<Memento>();

   		Sale sale = new Sale();

      System.out.println(" \n new Mementos -> ");
      String[] itemsA = {"item a", "item b"};
   		sale.set( "BOLETA",
                clientA,
                itemsA,
                "27-12-2021 20:43",
                2990);
   		savedSales.add(sale.saveToMemento());

      String[] itemsB = {"item c", "item d"};
      sale.set( "FACTURA",
                clientB,
                itemsB,
                "23-12-2021 12:00",
                5690);
   		savedSales.add(sale.saveToMemento());

      String[] itemsC = {"item e", "item f"};
      sale.set( "BOLETA",
                clientA,
                itemsC,
                "09-12-2021 00:30",
                3450);
   		savedSales.add(sale.saveToMemento());


      System.out.println(" \n restore Mementos -> ");
   		sale.restoreFromMemento(savedSales.get(1));

      sale.restoreFromMemento(savedSales.get(0));

  }


}







// end
