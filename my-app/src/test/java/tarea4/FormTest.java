package tarea4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class FormTest extends TestCase {

    @DisplayName("Test Form.getDate()")
    @Test
    public void testA() {
        Context context = new Context();
        String typeForm;
        String date;
        Form registroHoraPeluqueria;

        typeForm = "Simple";
        date = "10/10/12 15:40";
        registroHoraPeluqueria = new Form(
                context, typeForm, date);

        assertEquals(date, registroHoraPeluqueria.getDate());
    }

    @DisplayName("Test Form.getType()")
    @Test
    public void testB() {
        Context context = new Context();
        String typeForm;
        String date;
        Form registroHoraPeluqueria;

        typeForm = "Full";
        date = "10/11/12 12:30";
        registroHoraPeluqueria = new Form(
                context, typeForm, date);

        assertEquals(typeForm, registroHoraPeluqueria.getType());
    }

    @DisplayName("Test Form.getInfo()")
    @Test
    public void testC() {
        Context context = new Context();
        String typeForm;
        String date;
        Form registroHoraPeluqueria;

        typeForm = "Full";
        date = "06/05/12 09:30";
        registroHoraPeluqueria = new Form(
                context, typeForm, date);

        assertEquals("CLP $8000, corte mas lavado y peinado.", registroHoraPeluqueria.getInfo());
    }

    @DisplayName("Test Form.getValidInfo()")
    @Test
    public void testD() {
        Context context = new Context();
        String typeForm;
        String date;
        Form registroHoraPeluqueria;

        typeForm = "Simple";
        date = "08/10/22 09:30";
        registroHoraPeluqueria = new Form(
                context, typeForm, date);

        assertEquals(true, registroHoraPeluqueria.getValidInfo());
    }

}
