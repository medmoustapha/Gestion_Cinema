package gestion.cinema.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Film {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String realisateur;
	private String acteur;
	private String genre;
	private Double montant;
	private String dateProjection;
	private int Duree;
	private int anneeSortie;
	
	@ManyToOne
	@JoinColumn(name="id_salle")
	private Salle salle;
	@ManyToOne
	@JoinColumn(name="id_cinema")
	private Cinema cinema;
	@OneToMany(mappedBy="film")
	private Collection<Ticket> tickets;
	
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	
	public String getDateProjection() {
		return dateProjection;
	}
	public void setDateProjection(String dateProjection) {
		this.dateProjection = dateProjection;
	}
	public int getDuree() {
		return Duree;
	}
	public void setDuree(int duree) {
		Duree = duree;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	public String getActeur() {
		return acteur;
	}
	public void setActeur(String acteur) {
		this.acteur = acteur;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getAnneeSortie() {
		return anneeSortie;
	}
	public void setAnneeSortie(int anneeSortie) {
		this.anneeSortie = anneeSortie;
	}
	public Long getId() {
		return id;
	}
	public Film(String titre, String realisateur, String acteur, String genre, Double montant, String dateProjection,
			int duree, int anneeSortie) {
		super();
		this.titre = titre;
		this.realisateur = realisateur;
		this.acteur = acteur;
		this.genre = genre;
		this.montant = montant;
		this.dateProjection = dateProjection;
		Duree = duree;
		this.anneeSortie = anneeSortie;
		this.salle = salle;
	}
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", realisateur=" + realisateur + ", acteur=" + acteur
				+ ", genre=" + genre + ", montant=" + montant + ", dateProjection=" + dateProjection + ", Duree="
				+ Duree + ", anneeSortie=" + anneeSortie + "]";
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
