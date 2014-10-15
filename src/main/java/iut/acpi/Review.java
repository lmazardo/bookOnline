package iut.acpi;

public class Review {
    public Review(String commentaire) {

    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public static final String EXCELLENT = "excellent";

    private String author;
}
