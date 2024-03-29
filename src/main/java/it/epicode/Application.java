package it.epicode;

import com.github.javafaker.Faker;
import it.epicode.DAO.CatalogueDAO;
import it.epicode.DAO.LoanDAO;
import it.epicode.DAO.UserDAO;
import it.epicode.entities.classes.Book;
import it.epicode.entities.classes.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("library");
    public static void main(String[] args) {


        //Chiamata DAOs + Faker
        EntityManager em = emf.createEntityManager();
        UserDAO ud = new UserDAO(em);
        LoanDAO ld = new LoanDAO(em);
        CatalogueDAO cd = new CatalogueDAO(em);
        Faker faker = new Faker();

        //Aggiungere Nuovi User nella table
        User user1 = new User(faker.name().firstName(), faker.name().lastName(), faker.date().birthday());
        ud.save(user1);

        Book book1 = new Book(faker.book().title(),faker.number().numberBetween(1600, 2024), faker.number().numberBetween(100, 700), faker.book().author(), faker.book().genre());
        cd.save(book1);
    }
}
