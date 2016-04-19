package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Usuario;

@WebFilter(urlPatterns="/*")
public class FiltroDeAuditoria implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filter) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		
		
		String uri = req.getRequestURI();

		String usuario = getUsuario(req);
		
		
		
		System.out.println("Usuario "+ usuario +" acessando a URI "+ uri);
		filter.doFilter(request,response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
	String getUsuario(HttpServletRequest req){
		HttpSession session = req.getSession();
		Usuario usuarioLogado = (Usuario) session.getAttribute("usuario.logado");
		
		if (usuarioLogado != null) {
			return usuarioLogado.getEmail();
	    }else{
	    	return "<deslogado>";
	    }
	}

}
