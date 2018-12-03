package gestion.cinema.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import gestion.cinema.entities.Salle;

public interface SalleRepository extends JpaRepository<Salle, Long>{
	@Query("select s from Salle s where s.cinema.id = :x")
	public List<Salle> salleByCinema(@Param("x")Long idC);
	@Query("select s from Salle s where s.id = :x")
	public Salle getSalle(@Param("x")Long id);
	

}
