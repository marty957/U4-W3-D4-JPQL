package org.example.entities;

import org.example.enumaration.GenereMusicale;
import org.example.enumeration.TipoEvento;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import java.time.LocalDate;


@Entity

public class Concerto extends Evento{
    private boolean inStreaming;
    private GenereMusicale genere;

    public Concerto() {
    }

    public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti,
                    Location location, boolean inStreaming, GenereMusicale genere) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.inStreaming = inStreaming;
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }

    public GenereMusicale getGenere() {
        return genere;
    }

    public void setGenere(GenereMusicale genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "inStreaming=" + inStreaming +
                ", genere=" + genere +
                '}';
    }
}
