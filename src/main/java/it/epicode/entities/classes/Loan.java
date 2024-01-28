package it.epicode.entities.classes;

import java.util.Date;

public class Loan {

    private String itemLoaned;
    private Date startOfLoan;
    private Date expectedRestitution;
    private Date actualRestitution;
    private User userCard;
    public Loan(){}

    public Loan(String itemLoaned, Date startOfLoan, Date expectedRestitution, Date actualRestitution, User userCard) {
        this.itemLoaned = itemLoaned;
        this.startOfLoan = startOfLoan;
        this.expectedRestitution = expectedRestitution;
        this.actualRestitution = actualRestitution;
        this.userCard = userCard;
    }

    public String getItemLoaned() {
        return itemLoaned;
    }

    public void setItemLoaned(String itemLoaned) {
        this.itemLoaned = itemLoaned;
    }

    public Date getStartOfLoan() {
        return startOfLoan;
    }

    public void setStartOfLoan(Date startOfLoan) {
        this.startOfLoan = startOfLoan;
    }

    public Date getExpectedRestitution() {
        return expectedRestitution;
    }

    public void setExpectedRestitution(Date expectedRestitution) {
        this.expectedRestitution = expectedRestitution;
    }

    public Date getActualRestitution() {
        return actualRestitution;
    }

    public void setActualRestitution(Date actualRestitution) {
        this.actualRestitution = actualRestitution;
    }

    public User getUserCard() {
        return userCard;
    }

    public void setUserCard(User userCard) {
        this.userCard = userCard;
    }
}
