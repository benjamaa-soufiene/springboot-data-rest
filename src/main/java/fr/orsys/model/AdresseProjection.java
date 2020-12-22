package fr.orsys.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = { Adresse.class }, name = "a1")
public interface AdresseProjection {
	@Value("#{ target.ville + ' ' + target.codePostal }")
	String getVilleDetails();
}