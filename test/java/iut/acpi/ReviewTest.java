package iut.acpi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReviewTest {

    @Test
    public void canAttachAvisToABook() {
        String avis = Review.EXCELLENT;
        Book book = new Book();

        book.attach(avis);

        assertTrue(book.getAvis().contains(avis));
    }

    @Test
    public void anAuthorCouldWriteAnAvis() {
        Review review = new Review(Review.EXCELLENT);
        review.setAuthor("unnamed");

        assertEquals(review.getAuthor(), "unnamed");

    }

}
