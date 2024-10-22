package org.cours;

import static org.assertj.core.api.Assertions.assertThat;

import org.cours.web.VoitureController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataRestApplicationTests {

    @Autowired
    private VoitureController voitureController;  // Injection du contrôleur Voiture

    @Test
    void contextLoads() {
        // Vérifier si le contrôleur a été injecté avec succès
        assertThat(voitureController).isNotNull();
    }
}
