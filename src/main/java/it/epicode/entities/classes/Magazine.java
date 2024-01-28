package it.epicode.entities.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.Year;
@Entity
@DiscriminatorValue("magazine")
public class Magazine extends Catalogue {

    @Enumerated (EnumType.STRING)
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
