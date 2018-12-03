package gestion.cinema.service;

import java.util.List;
import java.util.Optional;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import gestion.cinema.GestionCinemaApplication;
import gestion.cinema.dao.CinemaRepository;
import gestion.cinema.dao.FilmRepository;
import gestion.cinema.dao.SalleRepository;
import gestion.cinema.dao.TicketRepository;
import gestion.cinema.dao.UtilisateurRepository;
import gestion.cinema.entities.Cinema;
import gestion.cinema.entities.Film;
import gestion.cinema.entities.Salle;
import gestion.cinema.entities.Ticket;
import gestion.cinema.entities.Utilisateur;

@WebService
public class ControllerService implements ServiceInterface{

	@Autowired
	private CinemaRepository cinemaRepository;
	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private SalleRepository salleRepository;
	@Autowired
	private TicketRepository ticketRepository;
	@Autowired
	private UtilisateurRepository utilisateurRepository;

	
	@WebMethod
	public Cinema creationCinema(Cinema c) {
		  
			 Cinema cinema=cinemaRepository.save(c);
			 if(cinema==null)throw new RuntimeException("Cinema Not Create!");
		   return cinema;
	}

	@Override
	@WebMethod
	public Cinema getCinema(Long idCinema) {
		 
		return cinemaRepository.getCinema(idCinema);
	}

	@Override
	@WebMethod
	public void suppCinema(Long idCinema) {
		cinemaRepository.deleteById(idCinema);
		
	}

	@Override
	@WebMethod
	public List<Cinema> listeCinemas() {
		List<Cinema> cinemas=cinemaRepository.findAll();
		return cinemas;
	}

	@Override
	@WebMethod
	public Salle creationSalle(Salle s) {
		
		return salleRepository.save(s);
	}

	@Override
	@WebMethod
	public Salle getSalle(Long idsalle) {
		return salleRepository.getSalle(idsalle);
	}

	@Override
	@WebMethod
	public void suppSalle(Long idSalle) {
		salleRepository.deleteById(idSalle);
		
	}

	@Override
	@WebMethod
	public List<Salle> listSalles() {
		return salleRepository.findAll();
	}

	@Override
	@WebMethod
	public List<Salle> sallesParCinema(Long idCinema) {
		return salleRepository.salleByCinema(idCinema);
	}

	@Override
	@WebMethod
	public Film creationFilm(Film f) {
		
		return filmRepository.save(f);
	}

	@Override
	public Film getFilm(Long idFilm) {
		return filmRepository.getFilm(idFilm);
	}

	@Override
	@WebMethod
	public void suppFilm(Long idFilm) {
		filmRepository.deleteById(idFilm);
		
	}

	@Override
	@WebMethod
	public List<Film> listFilms() {
		
		return filmRepository.findAll();
	}

	@Override
	@WebMethod
	public List<Film> filmsParSalle(Long idSalle) {
		
		return filmRepository.filmParSalle(idSalle);
	}
	@Override
	@WebMethod
	public List<Film> filmsParCinema(Long idCinema) {
		// TODO Auto-generated method stub
		return filmRepository.filmParCinema(idCinema);
	}
	@Override
	@WebMethod
	public List<Film> filmParActeur(String acteur) {
		// TODO Auto-generated method stub
		return filmRepository.filmParActeur("%"+acteur+"%");
	}

	@Override
	@WebMethod
	public List<Film> filmParTitre(String titre) {
		// TODO Auto-generated method stub
		return filmRepository.filmParTitre("%"+titre+"%");
	}
	@Override
	@WebMethod
	public Ticket creationTicket(Ticket t) {
		
		return ticketRepository.save(t);
	}

	@Override
	@WebMethod
	public Ticket getTicket(Long idTicket) {
		
		return ticketRepository.getTicket(idTicket);
	}

	@Override
	@WebMethod
	public void suppTicket(Long idTicket) {
		ticketRepository.deleteById(idTicket);
		
	}

	@Override
	@WebMethod
	public List<Ticket> listTickets() {
		
		return ticketRepository.findAll();
	}

	@Override
	@WebMethod
	public List<Ticket> ticketsParFilm(Long idF) {
		
		return ticketRepository.ticketByFilm(idF);
	}

	@Override
	@WebMethod
	public List<Ticket> ticketsParUtilisateur(Long idUtil) {
		// TODO Auto-generated method stub
		return ticketRepository.ticketByUtilisateur(idUtil);
	}

	@Override
	@WebMethod
	public Utilisateur creationUtilisateur(Utilisateur u) {
		
		return utilisateurRepository.save(u);
	}

	@Override
	@WebMethod
	public Utilisateur getUtilisateur(Long idUt) {
		
		return utilisateurRepository.getUtilisateur(idUt);
	}

	@Override
	@WebMethod
	public void suppUtilisateur(Long idUt) {
		utilisateurRepository.deleteById(idUt);
		
	}

	@Override
	@WebMethod
	public List<Utilisateur> listUtilisateurs() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur login(String login) {
		// TODO Auto-generated method stub
		return utilisateurRepository.login(login);
	}

	

	

}
