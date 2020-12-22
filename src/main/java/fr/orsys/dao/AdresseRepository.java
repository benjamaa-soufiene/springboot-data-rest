package fr.orsys.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.orsys.model.Adresse;
import fr.orsys.model.AdresseProjection;

@RepositoryRestResource(excerptProjection = AdresseProjection.class)
public interface AdresseRepository extends MongoRepository <Adresse, String> {
	
}