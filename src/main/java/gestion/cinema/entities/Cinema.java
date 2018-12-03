package gestion.cinema.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
public class Cinema {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String adress;
	@OneToMany(mappedBy="cinema")
	private Collection<Salle> salles;
	@OneToMany(mappedBy="cinema")
	private Collection<Film> films;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@XmlTransient
	public Collection<Salle> getSalles() {
		return salles;
	}
	
	public void setSalles(Collection<Salle> salles) {
		this.salles = salles;
	}
	
	@Override
	public String toString() {
		return "Cinema [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	@XmlTransient
	public Collection<Film> getFilms() {
		return films;
	}
	public void setFilms(Collection<Film> films) {
		this.films = films;
	}
	public Cinema() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cinema(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
	}
	

}
