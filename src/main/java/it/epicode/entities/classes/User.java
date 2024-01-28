package it.epicode.entities.classes;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "users")
public class User {

    private String name;
    @Column (name = "last_name")
    private String lastName;
    @Column (name = "date_of_birth")
    private Date dateOfBirth;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer cardNumber;
    @OneToMany (mappedBy = "user")
    @Column (name = "loan_list")
    private Set<Loan> loanList;

    public User(){}

    public User(String name, String lastName, Date dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.loanList = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Set<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(Set<Loan> loanList) {
        this.loanList = loanList;
    }
}
