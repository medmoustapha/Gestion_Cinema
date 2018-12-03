package gestion.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import gestion.cinema.entities.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema, Long>{
	@Query("select c from Cinema c where c.id= :x")
	public Cinema getCinema(@Param("x")Long id);

}
