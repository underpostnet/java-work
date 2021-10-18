


package Final;

import Final.*;

import java.util.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Empresa {

  private String nombreEmpresa;
  private String destinos[];
  private double tarifaNormal = 1000.0;

  // buses diponibles
  private ArrayList<Bus> busesDisponibles = new ArrayList<Bus>();

  // registro de todos los pasajes emitidos por la empresa
  private ArrayList<Pasaje> pasajesEmitidos = new ArrayList<Pasaje>();

  public Empresa(String nombreEmpresa, String [] destinos){
    this.nombreEmpresa = nombreEmpresa;
    this.destinos = destinos;
  }

  public void agregarBusDisponible(Bus bus){

    if(Arrays.asList(this.destinos).contains(bus.getDestino())){
      if(bus.getFecha() >= new Date().getTime()){
        this.busesDisponibles.add(bus);
        System.out.println(" Bus Agregado \n");
      }else{
        System.out.println(" Fecha no valida \n");
      }
    }else{
      System.out.println(" Destino no disponible \n");
    }

  }

  public void reservarPasaje(ArrayList<Cliente> clientes, String destino, long fechaLimite){

    boolean busDisponible = false;
    for (Bus bus : this.busesDisponibles) {
      // System.out.println(bus.getDestino() == destino);
      // System.out.println(bus.getFecha() <= fechaLimite);
      // System.out.println(bus.getFecha() >= (new Date().getTime()+(1000*60*60*24*2)));
      // System.out.println(bus.getAsientosDisponibles()>=clientes.size());
      // System.out.println("- \n");
      if(
      (bus.getDestino() == destino)
      &&
      (bus.getFecha() <= fechaLimite)
      &&
      (bus.getFecha() >= (new Date().getTime()+(1000*60*60*24*2)))
      &&
      (bus.getAsientosDisponibles()>=clientes.size())
      // hasta 5 pasajes
      ){
        System.out.println(" Bus Disponible \n");
        busDisponible = true;
        double tarifaTotal = 0;

        for (Cliente cliente : clientes) {

          /*
          • Los pasajeros menores de 8 años tienen un 50% de descuento en la tarifa normal.
          • Los pasajeros mayores de 65 años tienen un 30% de descuento en la tarifa normal.
          */

          if(cliente.getEdad()<8){
            tarifaTotal += this.tarifaNormal*0.5;
          }else if(cliente.getEdad()>65){
            tarifaTotal += this.tarifaNormal*0.7;
          }else{
            tarifaTotal += this.tarifaNormal;
          }

        }

        System.out.println(" Tarifa Total \n");
        System.out.println(" "+ tarifaTotal + "\n");

        this.pasajesEmitidos.add(
          new Pasaje(
            tarifaTotal,
            bus,
            clientes
          )
        );

        break;
      }
    }

    if(!busDisponible){
      System.out.println(" No hay buses antes de la fecha o destino solicitado \n");
    }


  }


}
