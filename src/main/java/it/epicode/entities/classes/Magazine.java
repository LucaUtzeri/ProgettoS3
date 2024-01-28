package it.epicode.entities.classes;

import java.time.Year;

public class Magazine extends Catalogue {

    private Periodicity periodicity;

    public Magazine(){}

    public Magazine(String title, Year releaseYear, Integer numOfPages, Periodicity periodicity) {
        super(title, releaseYear, numOfPages);
        this.periodicity = periodicity;
    }

    public Periodicity getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(Periodicity periodicity) {
        this.periodicity = periodicity;
    }
}
