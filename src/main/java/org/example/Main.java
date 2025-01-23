package org.example;

import com.github.javafaker.Faker;
import org.example.dao.EventoDAO;
import org.example.dao.LocationDAO;
import org.example.dao.PartecipazioneDAO;
import org.example.dao.PersonaDAO;
import org.example.entities.*;
import org.example.enumaration.GenereMusicale;
import org.example.enumeration.TipoEvento;
import org.example.enumeration.TipoSesso;
import org.example.enumeration.TipoStato;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.*;

/**
 * Hello world!
 *
 */
public class Main {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestioneE");
    private static EntityManager em = emf.createEntityManager();

    public static void main( String[] args ) {
        EventoDAO eventoDao = new EventoDAO(em);
        LocationDAO locationDao = new LocationDAO(em);
        PersonaDAO personaDao = new PersonaDAO(em);
        PartecipazioneDAO partecipazioneDao = new PartecipazioneDAO(em);


        Faker faker = new Faker(Locale.ITALY);

        /*Location l1 = new Location(faker.name().name(), faker.address().city());
        Set<Persona> atleti=new HashSet<>();

        *//*Location l2 = new Location(faker.name().name(), faker.address().city());*//*
        locationDao.save(l1);
       *//* locationDao.save(l2);*//*

        Persona p1 = new Persona(faker.name().firstName(), faker.name().lastName(),faker.internet().emailAddress(),LocalDate.of(1980, 10, 25), TipoSesso.F);
        personaDao.save(p1);
        Persona pe2 = new Persona(faker.name().firstName(), faker.name().lastName(),faker.internet().emailAddress(),LocalDate.of(1980, 10, 25), TipoSesso.F);
        personaDao.save(pe2);
        atleti.add(p1);
        atleti.add(pe2);*/

    /*    Evento e1 = new Evento("Finale Coppa", LocalDate.of(2025, 1, 25), "Super finale di coppa", TipoEvento.PUBBLICO, 100, locationDao.getByID(1));
        eventoDao.save(e1);*/
      /*  Evento e2 = new Evento("LADY gaga in tour", LocalDate.of(2025, 2, 25), "concerto dell'anno", TipoEvento.PUBBLICO, 100, locationDao.getByID(1));
        eventoDao.save(e2);*/

      /*  Partecipazione p2 = new Partecipazione(personaDao.getByID(2), eventoDao.getByID(3), TipoStato.CONFERMATA);
        partecipazioneDao.save(p2);*/
       /* Partecipazione p3 = new Partecipazione(personaDao.getByID(2), eventoDao.getByID(3), TipoStato.CONFERMATA);
        partecipazioneDao.save(p3);*/

        /*GaraDiAtletica gara1=new GaraDiAtletica("500 metri ",LocalDate.of(2025,5,31),"circuito da ostacoli di varia altezza",TipoEvento.PUBBLICO,10,l1,atleti,p1);

        eventoDao.save(gara1);*/
     /*    Location l6 = new Location(faker.name().name(), faker.address().city());
          locationDao.save(l6);
        Concerto c1 =new Concerto("VASCO",LocalDate.of(2026,8,2),"ultimo concerto a milano di VASCO",TipoEvento.PUBBLICO,2500,l6,true, GenereMusicale.ROCK);
        Concerto c2 =new Concerto("MILEY CYRUS",LocalDate.of(2026,7,2),"La diva Miley in italia ",TipoEvento.PUBBLICO,2500,l6,false, GenereMusicale.POP);
        Concerto c3 =new Concerto("IL VOLO",LocalDate.of(2026,8,14),"dopo un tour internazionale, il trio torna a casa",TipoEvento.PUBBLICO,2500,l6,true, GenereMusicale.CLASSICO);

        eventoDao.save(c1);
        eventoDao.save(c2);
        eventoDao.save(c3);

        List<Concerto> concertiStr=eventoDao.getConcertiInStreaming(true);
        concertiStr.forEach(System.out::println);*/



    }



}