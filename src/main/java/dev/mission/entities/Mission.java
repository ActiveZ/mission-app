package dev.mission.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "mission")
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String libelle;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private BigDecimal tauxJournalier;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public BigDecimal getTauxJournalier() {
        return tauxJournalier;
    }

    public void setTauxJournalier(BigDecimal tauxJournalier) {
        this.tauxJournalier = tauxJournalier;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", tauxJournalier=" + tauxJournalier +
                '}';
    }
}
