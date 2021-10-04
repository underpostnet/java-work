

public class Tarea7 {

  public static void main(String[] args){


      Casa testCasa = new Casa(30.0, "Viña del Mar, Alvarez 442", 40.0);
      System.out.println("\n instancia Casa:");
      System.out.println("direccion -> "+testCasa.getDireccion());
      System.out.println("superficieTechada -> "+testCasa.gerPorcentajeSuperficieTechada());

      Departamento testDepartamento = new Departamento(30000, 7, "Concon, Maroto 300", 40.0);
      System.out.println("\n instancia Departamento:");
      System.out.println("direccion -> "+testDepartamento.getDireccion());
      System.out.println("numero piso -> "+testDepartamento.getNumeroPiso());


  }

}

