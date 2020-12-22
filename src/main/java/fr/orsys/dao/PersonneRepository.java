package fr.orsys.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import fr.orsys.model.Personne;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@RepositoryRestResource
public interface PersonneRepository extends MongoRepository<Personne, String>{
	@ApiOperation("recherche une personne par son attribut nom")
	List<Personne> findByNom(@Param("nom") String nom);
	@ApiIgnore
	@RestResource(path="nom")
	List<Personne> findByNomContains(@Param("nom") String nom, Pageable pageable);
}

