package gestion.cinema.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name="id_utili")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name="id_film")
	private Film film;
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public Long getId() {
		return id;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(Utilisateur utilisateur, Film film) {
		super();
		this.utilisateur = utilisateur;
		this.film = film;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", utilisateur=" + utilisateur + "]";
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
