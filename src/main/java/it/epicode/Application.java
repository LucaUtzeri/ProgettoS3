package it.epicode;

import it.epicode.DAO.UserDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("library");
    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        UserDAO ud = new UserDAO(em);
    }
}
