package gestion.cinema.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import gestion.cinema.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{
	@Query("select t from Ticket t where t.film.id = :x")
	public List<Ticket> ticketByFilm(@Param("x")Long id);
	@Query("select t from Ticket t where t.utilisateur.id = :x")
	public List<Ticket> ticketByUtilisateur(@Param("x")Long id);
	@Query("select t from Ticket t where t.id = :x")
	public Ticket getTicket(@Param("x")Long id);

}
