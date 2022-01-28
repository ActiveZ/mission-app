package dev.mission.exec;

import dev.mission.repository.MissionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.time.LocalDate;

@Controller
@Profile("read")
public class ListerProchainesMissionsParTJM implements CommandLineRunner {
    private MissionRepository missionRepository;

    public ListerProchainesMissionsParTJM(MissionRepository missionRepository) {
        super();
        this.missionRepository = missionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("missions qui débutent aujourd’hui ou à une date ultérieure ET qui ont un taux journalier supérieur ou égal à un taux donné.");
        missionRepository.findByDateDebutAfterAndTauxJournalierGreaterThan(LocalDate.now(),new BigDecimal(10.10)).forEach(System.out::println);
    }
}
