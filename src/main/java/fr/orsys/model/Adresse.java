package fr.orsys.model;

import java.io.Serializable;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
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
public class Adresse implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@NotNull
	private String rue;
	@NotNull
	private String codePostal;
	@NotNull
	private String ville;
}
