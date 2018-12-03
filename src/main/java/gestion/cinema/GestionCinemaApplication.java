package gestion.cinema;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ImportResource;



@SpringBootApplication
@ImportResource("spring-beans.xml")
public class GestionCinemaApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		org.springframework.context.ApplicationContext ctx = SpringApplication.run(GestionCinemaApplication.class, args);
	
		 
		 
		 
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
