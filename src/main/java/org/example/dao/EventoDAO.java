package org.example.dao;

import org.example.entities.Concerto;
import org.example.entities.Evento;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class EventoDAO {

    private EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento e) {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }

    public Evento getByID(long id) {
        return em.find(Evento.class, id);
    }

    public void delete(Evento e) {
        em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
    }

    public List<Concerto> getConcertiInStreaming(boolean t){

        Query q=em.createQuery("SELECT c FROM Concerto c WHERE c.inStreaming=:inStreaming");
        q.setParameter("inStreaming",t);
        return q.getResultList();

    }
}