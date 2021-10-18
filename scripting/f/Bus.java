


package Final;

import Final.*;

public class Bus {

  static int asientosDisponibles = 40;
  private String destino;
  private long fecha;

  public Bus(long fecha, String destino){

    this.fecha = fecha;
    this.destino = destino;

  }

  public String getDestino(){
    return this.destino;
  }
  public long getFecha(){
    return this.fecha;
  }


}
