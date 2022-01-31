package dev.mission.exec;

import dev.mission.repository.MissionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Controller
@Profile("read")
public class ListerProchainesMissions implements CommandLineRunner {
    private MissionRepository missionRepository;

    public ListerProchainesMissions(MissionRepository missionRepository) {
        super();
        this.missionRepository = missionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("missions qui débutent aujourd’hui ou à une date ultérieure.");
        // methode directe
        missionRepository.findByDateDebutAfter(LocalDate.now().minusDays(1)).forEach(System.out::println);
        // methode avec @Query
        missionRepository.listerProchainesMissions(LocalDate.of(2021, 1, 1)).forEach(System.out::println);
    }
}
