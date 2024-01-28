package it.epicode.DAO;

import it.epicode.entities.classes.Loan;
import it.epicode.entities.classes.User;

import javax.persistence.*;
import java.util.List;

public class LoanDAO {
    private EntityManager em;
    public void save(Loan loan){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(loan);
        transaction.commit();
        System.out.println("Item saved");
    }

    public Loan findLoan (int id) {
        return em.find(Loan.class, id);
    }

    public void delete(int id){
        Loan loan = this.findLoan(id);
        if (loan != null){
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(id);
            transaction.commit();
            System.out.println("Loan Deleted");
        }
    }

    public List<Loan> searchLoan(User userCard){
        TypedQuery<Loan> query = em.createQuery("SELECT y FROM Loan y WHERE y.userCard = :userCard AND y.expectedRestitution > CURRENT_DATE", Loan.class);
        query.setParameter("userCard", userCard);
        return query.getResultList();
    }
    public List<Loan> searchExpired(User userCard){
        TypedQuery<Loan> query = em.createQuery("SELECT y FROM Loan y WHERE y.userCard = :userCard AND y.expectedRestitution < CURRENT_DATE", Loan.class);
        query.setParameter("userCard", userCard);
        return query.getResultList();
    }
}
