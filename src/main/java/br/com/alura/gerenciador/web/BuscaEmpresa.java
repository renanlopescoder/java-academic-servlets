package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

@WebServlet(urlPatterns = "/busca")
public class BuscaEmpresa extends HttpServlet {
	// Analisando e debugando a Criação, inicialização e destruição da Servlet
	public BuscaEmpresa() {
		System.out.println("Construindo a Servlet de Busca " + this);
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Inicializando Servlet Busca" + this);
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Destruindo a Servlet Busca " + this);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<html><body>");
		writer.println("Resultado da Busca:");
		String filtro = req.getParameter("filtro");
		Collection<Empresa> empresas = new EmpresaDAO()
				.buscaPorSimilaridade(filtro);
		writer.println("<ul>");
		for (Empresa empresa : empresas) {
			writer.println("<li>" + empresa.getId() + " " + empresa.getNome()
					+ "</li>");
		}
		writer.println("</ul>");
		writer.println("</body></html>");
	};
}
