package it.epicode.DAO;

import it.epicode.entities.classes.Catalogue;

import javax.persistence.*;
import java.time.Year;
import java.util.List;


public class CatalogueDAO {
    private EntityManager em;

    public void save(Catalogue catItem){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(catItem);
        transaction.commit();
        System.out.println("Item saved");
    }

    public Catalogue findItem (Integer isbn) {
        return em.find(Catalogue.class, isbn);
    }

    public void delete(Integer isbn){
        Catalogue catalogue = this.findItem(isbn);
        if (catalogue != null){
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(isbn);
            transaction.commit();
            System.out.println("Item Deleted");
        }
    }

public Catalogue findYear(Year year){
        return em.find(Catalogue.class, year);
}

public Catalogue findAuth(String auth){
        return em.find(Catalogue.class, auth);
    }

public List<Catalogue> searchTitle(String title){
    TypedQuery<Catalogue> query = em.createQuery("SELECT x FROM Catalogue x WHERE x.title LOWER(b.title) LIKE LOWER(:title)", Catalogue.class);
    query.setParameter("title", "%" + title + "%");
    return query.getResultList();
}

}
