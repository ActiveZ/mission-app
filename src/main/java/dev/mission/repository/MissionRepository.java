package dev.mission.repository;

import dev.mission.entities.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface MissionRepository extends JpaRepository<Mission, Integer> { //<nature de l'entité, nature de la clé primaire>

    List<Mission> findByDateDebutAfter(LocalDate date); // utiliser after car greaterThan ne marche pas avec ce type de variable (localeDate)
    // variante avec sql
    @Query("SELECT m from Mission m WHERE m.dateDebut >=?1")
    List <Mission> listerProchainesMissions(LocalDate date);

    List<Mission> findByDateDebutAfterAndTauxJournalierGreaterThan(LocalDate date, BigDecimal tauxJournalier);


}
