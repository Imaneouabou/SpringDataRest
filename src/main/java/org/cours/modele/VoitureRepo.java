package org.cours.modele;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.query.Param;

import java.util.List;

@RepositoryRestResource
public interface VoitureRepo extends CrudRepository<Voiture, Long> {

    // Select cars by marque (brand)
    List<Voiture> findByMarque(@Param("marque") String marque);

    // Select cars by color
    List<Voiture> findByCouleur(@Param("couleur") String couleur);

    // Select cars by year
    List<Voiture> findByAnnee(@Param("annee") int annee);

    // Select cars by marque and modele
    List<Voiture> findByMarqueAndModele(@Param("marque") String marque, @Param("modele") String modele);

    // Select cars by marque or couleur
    List<Voiture> findByMarqueOrCouleur(@Param("marque") String marque, @Param("couleur") String couleur);

    // Select cars by marque and sort by year ascending
    List<Voiture> findByMarqueOrderByAnneeAsc(@Param("marque") String marque);

    // Custom query using JPQL to select cars by marque
    @Query("select v from Voiture v where v.marque = :marque")
    List<Voiture> findByMarqueUsingQuery(@Param("marque") String marque);

    // Custom query using JPQL to select cars where marque ends with a specific string
    @Query("select v from Voiture v where v.marque like %:marque")
    List<Voiture> findByMarqueEndsWith(@Param("marque") String marque);
}
