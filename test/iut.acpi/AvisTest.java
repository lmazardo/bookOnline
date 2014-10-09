package iut.acpi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AvisTest {

    @Test
    public void canAttachAvisToABook() {
        String avis = Avis.EXCELLENT;
        Book book = new Book();

        book.attach(avis);

        assertTrue(book.getAvis().contains(avis));
    }

    @Test
    public void anAuthorCouldWriteAnAvis() {
        Avis avis = new Avis(Avis.EXCELLENT);
        avis.setAuthor("unnamed");

        assertEquals(avis.getAuthor(), "unnamed");

    }

}
