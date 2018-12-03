package gestion.cinema.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import gestion.cinema.entities.Cinema;
import gestion.cinema.entities.Film;
import gestion.cinema.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{
	
	@Query("select u from Utilisateur u where u.login  = :x")
	public Utilisateur login(@Param("x")String login);
	@Query("select u from Utilisateur u where u.id  = :x")
	public Utilisateur getUtilisateur(@Param("x")Long id);

}
