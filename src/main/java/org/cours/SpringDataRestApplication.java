package org.cours;

import org.cours.modele.Proprietaire;
import org.cours.modele.ProprietaireRepo;
import org.cours.modele.Voiture;
import org.cours.modele.VoitureRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringDataRestApplication {

    @Autowired
    private VoitureRepo voitureRepo;

    @Autowired
    private ProprietaireRepo proprietaireRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            // Create and save Proprietaire entities
            Proprietaire proprietaire1 = new Proprietaire("Ali", "Hassan");
            Proprietaire proprietaire2 = new Proprietaire("Najat", "Bani");
            proprietaireRepo.save(proprietaire1);
            proprietaireRepo.save(proprietaire2);

            // Add Voiture entities and associate with Proprietaire
            voitureRepo.save(new Voiture("Toyota", "Corolla", "Grise", "A-1-9090", 2018, 95000, proprietaire1));
            voitureRepo.save(new Voiture("Ford", "Fiesta", "Rouge", "A-2-8090", 2015, 90000, proprietaire1));
            voitureRepo.save(new Voiture("Honda", "CRV", "Bleu", "A-3-7090", 2016, 140000, proprietaire2));
        };
    }
}
