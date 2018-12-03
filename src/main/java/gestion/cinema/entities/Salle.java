package gestion.cinema.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;
@Entity
public class Salle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int nbPlaces;
	private String etat;
	private String disponible;
	@OneToMany(mappedBy="salle")
	private Collection<Film> films;
	@ManyToOne
	@JoinColumn(name="id_cinema")
	private Cinema cinema;
	public int getNbPlaces() {
		return nbPlaces;
	}
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String isDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	@XmlTransient
	public Collection<Film> getFilms() {
		return films;
	}
	public void setFilms(Collection<Film> films) {
		this.films = films;
	}
	
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
	public Long getId() {
		return id;
	}
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salle(int nbPlaces, String etat, String disponible, Cinema cinema) {
		super();
		this.nbPlaces = nbPlaces;
		this.etat = etat;
		this.disponible = disponible;
		this.cinema = cinema;
	}
	public Salle(int nbPlaces, String etat, String disponible) {
		super();
		this.nbPlaces = nbPlaces;
		this.etat = etat;
		this.disponible = disponible;
	}
	@Override
	public String toString() {
		return "Salle [id=" + id + ", nbPlaces=" + nbPlaces + ", etat=" + etat + ", disponible=" + disponible + "]";
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
