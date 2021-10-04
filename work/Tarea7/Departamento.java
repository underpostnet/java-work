public class Departamento extends Vivienda
{

  private double gastoComunMensual;
  private int nPiso;

  public Departamento(double gastoComunMensual, int nPiso, String direccion, double superficie){
    super(direccion, superficie);
    this.gastoComunMensual = gastoComunMensual;
    this.nPiso = nPiso;
  }

  public int getNumeroPiso(){
    return this.nPiso;
  }
  public double getGastoComunMensual(){
    return this.gastoComunMensual;
  }

}
