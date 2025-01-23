package org.example.dao;

import org.example.entities.Concerto;
import org.example.entities.Evento;
import org.example.entities.PartitaDiCalcio;
import org.example.enumaration.GenereMusicale;

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

    public List<Concerto> getConcertiPerGenere(GenereMusicale genere){
        Query q=em.createQuery("SELECT c FROM Concerto c WHERE c.genere=:genere");
        q.setParameter("genere",genere);
        return q.getResultList();
    }

    public List<PartitaDiCalcio> getPartiteVinteIncasa(){
        Query  q= em.createNamedQuery("PartitaDiCalcio.getPartiteVinteIncasa");
        return q.getResultList();
    }
    public List<PartitaDiCalcio> getPartiteVinteeInTrasferta(){
        Query  q= em.createNamedQuery("PartitaDiCalcio.getPartiteVinteInTrasferta");
        return q.getResultList();
    }
}