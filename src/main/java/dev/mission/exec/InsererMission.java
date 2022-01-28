package dev.mission.exec;

import dev.mission.entities.Mission;
import dev.mission.repository.MissionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.time.LocalDate;

@Controller
@Profile("insert")
public class InsererMission implements CommandLineRunner {
    private MissionRepository missionRepository;

    public InsererMission(MissionRepository missionRepository) {
        super();
        this.missionRepository = missionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        missionRepository.deleteAll();

        Mission mission = new Mission();
        mission.setLibelle("Mission 1");
        mission.setTauxJournalier(new BigDecimal("100.90"));
        mission.setDateDebut(LocalDate.of(2019, 1, 1));
        mission.setDateFin(LocalDate.of(2019, 3, 4));
        this.missionRepository.save(mission);

        Mission mission2 = new Mission();
        mission2.setLibelle("Mission 2");
        mission2.setTauxJournalier(new BigDecimal("50.50"));
        mission2.setDateDebut(LocalDate.of(2020, 1, 1));
        mission2.setDateFin(LocalDate.of(2020, 3, 4));
        this.missionRepository.save(mission2);

        Mission mission3 = new Mission();
        mission3.setLibelle("Mission 3");
        mission3.setTauxJournalier(new BigDecimal("30.30"));
        mission3.setDateDebut(LocalDate.of(2023, 1, 1));
        mission3.setDateFin(LocalDate.of(2023, 3, 4));
        this.missionRepository.save(mission3);
    }
}
