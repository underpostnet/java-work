class Empresa
{

  protected String nombreEmpresa = "underpost.net";

  public void view() {
    System.out.println("nombre Empresa:"+this.nombreEmpresa);
  }

}

class Empleado extends Empresa
{

  private String nombre;
  private String apellido;
  private double sueldo;
  private int edad;

  public Empleado(
  String nombre,
  String apellido,
  double sueldo,
  int edad){
    this.nombre = nombre;
    this.apellido = apellido;
    this.sueldo = sueldo;
    this.edad = edad;
  }




  public String getNombre(){
    return this.nombre;
  }
  public String getApellido(){
    return this.apellido;
  }
  public double getSueldo(){
    return this.sueldo;
  }



  public String devuelveNombre(Empleado empleado){
   return empleado.getNombre()+" "+empleado.getApellido();
  }
  public double devuelveSueldoLiquido(Empleado empleado){
   return empleado.getSueldo()*0.9;
  }


  public void view(){
    System.out.println("nombre:"+this.nombre);
    System.out.println("apellido:"+this.apellido);
    System.out.println("sueldo:"+this.sueldo);
    System.out.println("edad:"+this.edad);
    super.view();
  }


}

public class Tarea5
{
     public static void main(String[] args){

          System.out.println("\n instancia: \n");
          Empleado test = new Empleado("francisco", "verdugo", 10000.5, 26);
          test.view();

          System.out.println("\n test: \n\ndevuelveNombre() -> "+test.devuelveNombre(test));
          System.out.println("devuelveSueldoLiquido() -> "+test.devuelveSueldoLiquido(test));

    }
  
}
