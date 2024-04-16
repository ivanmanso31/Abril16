package com.softtek.Abril16;

import com.softtek.Abril16.modelo.Saludo;
import com.softtek.Abril16.modelo.ej3.Coche;
import com.softtek.Abril16.modelo.ej3.SeguroCoche;
import com.softtek.Abril16.modelo.ej4.Jefe;
import com.softtek.Abril16.modelo.ej5.Cliente;
import com.softtek.Abril16.persistencia.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Abril16Application implements CommandLineRunner {

	@Autowired
	private Saludo s;
	@Autowired
	private SeguroCoche sc;
	@Autowired
	private Coche c;
	@Autowired
	private Jefe j;
	@Autowired
	private Cliente cl;
	@Autowired
	private ClienteDAO cld;

	public static void main(String[] args) {
		SpringApplication.run(Abril16Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(s.saludo());
		System.out.println(sc.reparar(c));
		System.out.println(j.getInforme());
		System.out.println(j.getTareas());
		System.out.println(cld.insertar(cl));
	}
}
