package it.epicode.entities.classes;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.Year;
@Entity
@DiscriminatorValue("book")
public class Book extends Catalogue{
    private String author;
    private String genre;

    public Book(){}

    public Book(String title, Year releaseYear, Integer numOfPages, String author, String genre) {
        super(title, releaseYear, numOfPages);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
