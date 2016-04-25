package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements JobInterface{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp){
		HttpSession session = req.getSession();
		session.removeAttribute("usuarioLogado");
		return "login.jsp";
	}
}
