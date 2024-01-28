package it.epicode.entities.classes;

import javax.persistence.*;
import java.time.Year;
@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "catalogue")
public abstract class Catalogue {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column (name = "isbn_code")
    private Integer isbnCode;
    @Column (name = "title")
    private String title;
    @Column (name = "release_year")
    private Year releaseYear;
    @Column (name = "number_of_pages")
    private Integer numOfPages;



    public Catalogue(){}

    public Catalogue(String title, Year releaseYear, Integer numOfPages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.numOfPages = numOfPages;
    }

    public Integer getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(Integer isbnCode) {
        this.isbnCode = isbnCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Year releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(Integer numOfPages) {
        this.numOfPages = numOfPages;
    }
}
