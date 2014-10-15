package iut.acpi;

import java.util.ArrayList;

public class Book {
    public void attach(String avis) {
        reviews.add(avis);
    }

    public ArrayList<String> getAvis() {
        return reviews;
    }

    private ArrayList<String> reviews = new ArrayList<String>();
}
