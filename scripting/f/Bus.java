


package Final;

import Final.*;

import java.util.*;
import java.util.ArrayList;

public class Bus {

  private int asientosTotales = 40;
  private int asientosOcupados = 0;
  private String destino;

  // las fecha se getionaran mediante timestamp para
  // agilizar la comparacion temporal de objetos tipo Date
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

  public void sumarAsientos(int cantidad){
    if((this.asientosOcupados+cantidad)<=this.asientosTotales){
      this.asientosOcupados+=cantidad;
      System.out.println(" Asientos ocupados "+this.asientosOcupados+ "\n");
    } else{
      System.out.println(" No hay asientos disponibles"+ "\n");
    }
  }


}
