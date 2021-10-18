


package Final;


import Final.*;
import java.util.*;
import java.util.ArrayList;

public class Empresa {

  private String nombreEmpresa;
  private Pasaje pasajesEmitidos[]; // registro de todos los pasajes emitidos por la empresa
  private String destinos[];
  private ArrayList<Bus> busesDisponibles = new ArrayList<Bus>();

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


}
