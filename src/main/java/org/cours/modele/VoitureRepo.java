package org.cours.modele;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VoitureRepo extends CrudRepository<Voiture, Long>{

}
