package iut.acpi;

import java.util.ArrayList;

public class Book {
    public void attach(String avis) {
        avisList.add(avis);
    }

    public ArrayList<String> getAvis() {
        return avisList;
    }

    private ArrayList<String> avisList = new ArrayList<String>();
}
