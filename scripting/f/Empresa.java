


package Final;

import Final.*;

import java.util.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Empresa {

  private String nombreEmpresa;
  private String destinos[];
  private double tarifaNormal = 1000.0;
  private int limiteReservasPorCliente = 5;

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

  public Pasaje reservarPasaje(ArrayList<Cliente> clientes, String destino, long fechaLimite){

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




        if(!this.validarCantidadPasajes(clientes, bus)){
          return null;
        }




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

        Pasaje nuevoPasaje  = new Pasaje(
          tarifaTotal,
          bus,
          clientes
        );

        this.pasajesEmitidos.add(nuevoPasaje);

        bus.sumarAsientos(clientes.size());

        return nuevoPasaje;

      }

    }

    if(!busDisponible){
      System.out.println(" No hay buses antes de la fecha o destino solicitado \n");
    }

    return null;


  }



    public boolean validarCantidadPasajes(ArrayList<Cliente> clientes, Bus bus){

      for (Cliente cliente : clientes) {
            int contPasajes = 0;
            for (Pasaje pasaje : this.pasajesEmitidos) {

                    if(pasaje.getBus().getFecha()>=new Date().getTime()){
                      ArrayList<Cliente> pasajesList = pasaje.getClientes();
                      for (Cliente clientePasaje :  pasajesList ) {

                                if(clientePasaje.getRut()==cliente.getRut()){

                                  if(pasaje.getBus().getFecha()==bus.getFecha()
                                    &&
                                    pasaje.getBus().getDestino()==bus.getDestino()){
                                      System.out.println(" Pasajero ya reservo el Bus \n");
                                      return false;
                                  }
                                  contPasajes++;

                                }

                      }

                    }
            }

            if(contPasajes>=this.limiteReservasPorCliente){
              System.out.println(" Pasajero supera limite de reservas \n");
              return false;
            }
      }

      return true;

    }

    public Pasaje pagarPasaje(Pasaje pasaje){


          /*

          • La reserva debe ser pagada con un mínimo de 24 horas de antelación al viaje.
          • Las reservas no pagadas, en el tiempo descrito en el punto 4, serán anuladas de manera
          automática.
          • Una vez pagada la reserva se emite el pasaje con el nombre del cliente y acompañantes.

          */
          int indexPasaje = 0;
          for (Pasaje pasajeEmitido : this.pasajesEmitidos) {

            if(
              pasajeEmitido.getBus().getFecha()==pasaje.getBus().getFecha()
              &&
              pasajeEmitido.getBus().getDestino()==pasaje.getBus().getDestino()
            ){

                      if(pasajeEmitido.getBus().getFecha()>=(new Date().getTime()+(60*60*24*1000*2))){

                        for (Cliente clientePasajeTest : pasaje.getClientes() ) {
                          boolean rutExiste = false;
                          for (Cliente clientePasajeEmitido :  pasajeEmitido.getClientes() ) {
                            if(clientePasajeEmitido.getRut()==clientePasajeTest.getRut()){
                              rutExiste = true;
                            }
                          }
                          if(!rutExiste){
                            System.out.println(" Cliente no valido \n");
                            return null;
                          }

                        }

                        boolean estadoPago = pasajeEmitido.getEstadoPago();

                        if(!estadoPago){

                          pasajeEmitido.pagarPasaje();
                          System.out.println(" Pasaje Pagado Con exito \n");
                          return pasajeEmitido;

                        }else{

                          System.out.println(" El pasaje ya ha sido pagado \n");
                          return null;

                        }

                      }else{

                        System.out.println(" Fecha de pago no valida \n");

                        this.pasajesEmitidos.remove(indexPasaje);

                        return null;

                      }

            }
            indexPasaje++;
          }

          System.out.print(" Bus del pasaje no encontrado \n");
          return null;


    }


    public void ViewPasajesEmitidos(){
      String pattern = "dd/MM/yyyy HH:mm:ss";
      SimpleDateFormat df = new SimpleDateFormat(pattern);

      System.out.println(" \n \n Test ViewPasajesEmitidos() -> \n");
      System.out.println(" -------------------------------------------- \n");

      int indexPasaje = 0;
      for (Pasaje pasajeEmitido : this.pasajesEmitidos) {

            System.out.println(" Pasaje Numero "+indexPasaje+" \n");
            System.out.println(" Fecha: "+df.format(pasajeEmitido.getBus().getFecha())+" \n");
            System.out.println(" Destino: "+pasajeEmitido.getBus().getDestino()+" \n");
            System.out.println(" Pagado: "+pasajeEmitido.getEstadoPago()+" \n");
            double tarifa = pasajeEmitido.getTarifa();
            System.out.println(" Tarifa Total: "+tarifa+" \n");
            System.out.println(" Clientes: \n");

            ArrayList<Cliente> clientes = pasajeEmitido.getClientes();

            for (Cliente cliente : clientes) {
              String nombreCliente = cliente.getNombre();
              String rutCliente = cliente.getRut();
              System.out.println("           Nombre : "+nombreCliente+" RUT: "+rutCliente+" \n");
            }
      }
      indexPasaje++;
    }


}
