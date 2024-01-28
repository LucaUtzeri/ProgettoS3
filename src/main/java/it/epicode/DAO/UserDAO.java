package it.epicode.DAO;

import it.epicode.entities.classes.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class UserDAO {
    private EntityManager em;

    public UserDAO(EntityManager em) {
        this.em = em;
    }

    public void save(User user){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(user);
        transaction.commit();
        System.out.println("User saved");
    }

    public User findUser (Integer cardNum) {
        return em.find(User.class, cardNum);
    }
public void delete(Integer cardNumb){
        User user = this.findUser(cardNumb);
        if (user != null){
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(user);
            transaction.commit();
            System.out.println("User Deleted");
        }
}
}
