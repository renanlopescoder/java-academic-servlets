package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/controller")
public class Controller extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String job = req.getParameter("job");
		if (job == null) {
			throw new IllegalArgumentException(
					"Você esqueceu de passar o trabalho");
		}
		job = "br.com.alura.gerenciador.web." + job;
		Class<?> tipo;
		try {
			tipo = Class.forName(job);
			JobInterface instancia;
			instancia = (JobInterface) tipo.newInstance();
			String pagina = instancia.execute(req, resp);
			RequestDispatcher dispatcher = req.getRequestDispatcher(pagina);
			dispatcher.forward(req, resp);
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException i) {
			throw new ServletException(i);
		}
	}
}