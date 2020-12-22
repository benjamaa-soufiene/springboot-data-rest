package fr.orsys.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Personne  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@NotNull
	private String nom;
	@NotNull
	private String prenom;
	@Min(0) @Max(20000)
	private Integer salaire;
	@DBRef
	private List<Adresse> adresses;
}
