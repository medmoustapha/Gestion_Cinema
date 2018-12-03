package gestion.cinema.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import gestion.cinema.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Long>{
	@Query("select f from Film f where f.salle.id  = :x")
	public List<Film> filmParSalle(@Param("x")Long id);
	@Query("select f from Film f where f.cinema.id  = :x")
	public List<Film> filmParCinema(@Param("x")Long id);
	@Query("select f from Film f where f.id  = :x")
	public Film getFilm(@Param("x")Long id);
	@Query("select f from Film f where f.titre  like :x")
	public List<Film> filmParTitre(@Param("x")String t);
	@Query("select f from Film f where f.acteur  like :x")
	public List<Film> filmParActeur(@Param("x")String acteur);


}
