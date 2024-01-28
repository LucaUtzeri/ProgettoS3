package it.epicode.entities.classes;

import java.time.Year;

public abstract class Catalogue {
    private Integer IsbnCode;
    private String Title;
    private Year ReleaseYear;
    private Integer NumOfPages;


    public Catalogue(){}

    public Catalogue(String title, Year releaseYear, Integer numOfPages) {
        Title = title;
        ReleaseYear = releaseYear;
        NumOfPages = numOfPages;
    }

    public Integer getIsbnCode() {
        return IsbnCode;
    }

    public void setIsbnCode(Integer isbnCode) {
        IsbnCode = isbnCode;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Year getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseYear(Year releaseYear) {
        ReleaseYear = releaseYear;
    }

    public Integer getNumOfPages() {
        return NumOfPages;
    }

    public void setNumOfPages(Integer numOfPages) {
        NumOfPages = numOfPages;
    }
}
