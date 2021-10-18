


package Final;

import Final.*;

public class Pasaje {

  private double tarifa;
  private boolean cancelado;
  private Bus bus;
  private int[] acompanantes; // indice de los pasajes acompañantes
  private Cliente cliente;

  public Pasaje(double tarifa, Bus bus, int[] acompanantes, Cliente cliente){

    this.cancelado = false;
    this.tarifa = tarifa;
    this.bus = bus;
    this.cliente = cliente;

  }

}
