


package Final;

import Final.*;

import java.util.*;
import java.util.ArrayList;

public class Bus {

  private int asientosTotales = 40;
  private int asientosOcupados = 0;
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


  public int getAsientosDisponibles(){
    return (this.asientosTotales-this.asientosOcupados);
  }


}
