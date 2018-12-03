package gestion.cinema.service;

import java.util.List;
import java.util.Optional;

import javax.jws.WebService;

import gestion.cinema.entities.Cinema;
import gestion.cinema.entities.Film;
import gestion.cinema.entities.Salle;
import gestion.cinema.entities.Ticket;
import gestion.cinema.entities.Utilisateur;
@WebService
public interface ServiceInterface {
	public Cinema creationCinema(Cinema c);
	public Cinema getCinema(Long IdCinema);
	public void suppCinema(Long idCinema);
	public List<Cinema> listeCinemas();
	
	public Salle creationSalle(Salle s);
	public Salle getSalle(Long idsalle);
	public void suppSalle(Long idSalle);
	public List<Salle> listSalles();
	public List<Salle> sallesParCinema(Long idCinema);
	
	public Film creationFilm(Film f);
	public Film getFilm(Long idFilm);
	public void suppFilm(Long idFilm);
	public List<Film> listFilms();
	public List<Film> filmParActeur(String acteur);
	public List<Film> filmParTitre(String titre);
	public List<Film> filmsParSalle(Long idSalle);
	public List<Film> filmsParCinema(Long idCinema);
	
	public Ticket creationTicket(Ticket t);
	public Ticket getTicket(Long idTicket);
	public void suppTicket(Long idTicket);
	public List<Ticket> listTickets();
	public List<Ticket> ticketsParFilm(Long idF);
	public List<Ticket> ticketsParUtilisateur(Long idUtil);
	
	public Utilisateur creationUtilisateur(Utilisateur u);
	public Utilisateur getUtilisateur(Long idUt);
	public void suppUtilisateur(Long idUt);
	public List<Utilisateur> listUtilisateurs();
	public Utilisateur login(String login);
	

}
