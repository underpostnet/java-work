


package Final;

import Final.*;

import java.util.*;
import java.util.ArrayList;


public class Pasaje {

  private double tarifa;
  private boolean cancelado;
  private Bus bus;
  private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

  public Pasaje(double tarifa, Bus bus, ArrayList<Cliente> clientes){

    this.cancelado = false;
    this.tarifa = tarifa;
    this.bus = bus;
    this.clientes = clientes;

  }

  public Bus getBus(){
    return this.bus;
  }

  public ArrayList<Cliente> getClientes(){
    return this.clientes;
  }

}
