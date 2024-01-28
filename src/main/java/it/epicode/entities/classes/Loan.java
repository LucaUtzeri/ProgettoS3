package it.epicode.entities.classes;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column (name = "item_loaned")
    private String itemLoaned;
    @Column (name = "start_of_loan")
    private Date startOfLoan;
    @Column (name = "expected_restituition")
    private Date expectedRestitution;
    @Column (name = "actual_restituition")
    private Date actualRestitution;
    @Column (name = "user_card")
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
