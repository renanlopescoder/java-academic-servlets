package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface JobInterface{
	String execute(HttpServletRequest req, HttpServletResponse resp);
}
