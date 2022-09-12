package tarea4;

public class App {

  public static void main(String[] args) {

    System.out.println(" \n \n App test -> \n");
    System.out.println(" -------------------------------------------- \n");

    Context context = new Context();
    String typeForm;
    String date;
    Form registroHoraPeluqueria;

    typeForm = "Simple";
    date = "10/10/12 15:40";
    registroHoraPeluqueria = new Form(
        context, typeForm, date);
    registroHoraPeluqueria.view();

    typeForm = "Full";
    date = "1/10/12 20:00";
    registroHoraPeluqueria = new Form(
        context, typeForm, date);
    registroHoraPeluqueria.view();

  }

}
