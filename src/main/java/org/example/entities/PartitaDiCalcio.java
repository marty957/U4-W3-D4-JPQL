package org.example.entities;


import org.example.enumeration.TipoEvento;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class PartitaDiCalcio extends Evento{

    private String squadraDiCasa;
    private String ospite;
    private String squadraVincente;
    private long nGolSC;
    private long nGolO;

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location,
                           String squadraDiCasa, String ospite, String squadraVincente, long nGolSC, long nGolO) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.squadraDiCasa = squadraDiCasa;
        this.ospite = ospite;
        this.squadraVincente = squadraVincente;
        this.nGolSC = nGolSC;
        this.nGolO = nGolO;
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public long getnGolO() {
        return nGolO;
    }

    public void setnGolO(long nGolO) {
        this.nGolO = nGolO;
    }

    public long getnGolSC() {
        return nGolSC;
    }

    public void setnGolSC(long nGolSC) {
        this.nGolSC = nGolSC;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public String getOspite() {
        return ospite;
    }

    public void setOspite(String ospite) {
        this.ospite = ospite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", ospite='" + ospite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", nGolSC=" + nGolSC +
                ", nGolO=" + nGolO +
                '}';
    }
}
