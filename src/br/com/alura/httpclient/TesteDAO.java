package br.com.alura.httpclient;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import br.com.alura.httpclient.dao.CriaturaDAO;
import br.com.alura.httpclient.dao.GalaxiaDAO;
import br.com.alura.httpclient.dao.PlanetaDAO;


public class TesteDAO {

	
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		// Chamada assíncrona
		new PlanetaDAO().listar();

		new CriaturaDAO().listar();

		new GalaxiaDAO().listar();

	}
}
