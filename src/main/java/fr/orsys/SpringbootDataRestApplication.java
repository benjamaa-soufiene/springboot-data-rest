package fr.orsys;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.orsys.dao.AdresseRepository;
import fr.orsys.dao.PersonneRepository;
import fr.orsys.model.Adresse;
import fr.orsys.model.Personne;

@SpringBootApplication
public class SpringbootDataRestApplication implements ApplicationRunner {

	@Autowired
	private PersonneRepository personneRepository;
	@Autowired
	private AdresseRepository adresseRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDataRestApplication.class, args);
	}

	/*
	 * @Override public void run(ApplicationArguments args) throws Exception {
	 * Personne personne1 = new Personne(null,"wick", "john",2000); Personne
	 * personne2 = new Personne(null,"dalton", "jack",5000); Personne personne3 =
	 * new Personne(null,"maggio", "carol",3500); Personne personne4 = new
	 * Personne(null,"cohen", "sophie",1800);
	 * personneRepository.saveAll(Arrays.asList(personne1, personne2,personne3,
	 * personne4));
	 * 
	 * }
	 */
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Adresse adr1 = new Adresse(null, "paradis", "13015", "Marseille");
		Adresse adr2 = new Adresse(null, "lacanau", "13700", "Marignane");
		Adresse adr3 = new Adresse(null, "défense", "75000", "Paris");
		Adresse adr4 = new Adresse(null, "five", "59000", "Lille");
		Adresse adr5 = new Adresse(null, "corum", "34000", "Montpellier");
		Adresse adr6 = new Adresse(null, "gabriel péri", "69008", "Lyon");
		Adresse adr7 = new Adresse(null, "gerland", "69007", "Lyon");
		Adresse adr8 = new Adresse(null, "prado", "13008", "Marseille");
		adresseRepository.saveAll(Arrays.asList(adr1, adr2,adr3, adr4, adr5,adr6, adr7,adr8));
		Personne personne1 = new Personne(null, "wick", "john", 2000, Arrays.asList(adr1, adr2));
		Personne personne2 = new Personne(null, "dalton", "jack", 5000, Arrays.asList(adr3, adr4, adr5));
		Personne personne3 = new Personne(null, "maggio", "carol", 3500, Arrays.asList(adr6, adr7));
		Personne personne4 = new Personne(null, "cohen", "sophie", 1800, Arrays.asList(adr8));
		personneRepository.saveAll(Arrays.asList(personne1, personne2, personne3, personne4));
		
	}
}
