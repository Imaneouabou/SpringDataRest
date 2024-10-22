package org.cours.modele;

import org.springframework.data.repository.CrudRepository;

public interface ProprietaireRepo extends CrudRepository<Proprietaire, Long> {
    // You can define custom query methods here if needed
}
