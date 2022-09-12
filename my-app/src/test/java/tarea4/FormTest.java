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

}
