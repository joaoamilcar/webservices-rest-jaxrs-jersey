package br.com.alura.loja;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Servidor {

	public static void main(String[] args) throws IOException {
		URI uri = URI.create("http://localhost:8080/");
		ResourceConfig config = new ResourceConfig().packages("br.com.alura.loja"); // tudo neste pacote eh usado pelo servidor como recursos
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config); // uma maneira de rodar um servidor com suporte a JAX-RS eh usando grizzly
		System.out.println("Servidor rodando");
		System.in.read(); // enter para parar o servidor
		System.out.println();
		server.stop();
		System.out.println("Servidor encerrado");
	}

}