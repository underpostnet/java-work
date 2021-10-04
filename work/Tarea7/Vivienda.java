public class Vivienda
{

  protected String direccion;
  protected double superficie;

  public Vivienda(String direccion, double superficie){
    this.direccion = direccion;
    this.superficie = superficie;
  }

  public String getDireccion(){
    return this.direccion;
  }

  public double getSuperfice(){
    return this.superficie;
  }

}
