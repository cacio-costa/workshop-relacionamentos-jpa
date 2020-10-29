package org.serratec.workshop.controller;

import java.util.Collections;
import java.util.List;

import org.serratec.workshop.modelo.Autor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesafioController {
	
	
	/*
	 * Listar autores com livros de arquitetura
	 */
	@GetMapping("/autores-de-arquitetura")
	public String autoresDeArquitetura() {
		return "VERIFIQUE A SAÍDA NO CONSOLE";
	}
	
	/*
	 * Exibir o nome do livro com a quantidade de empréstimos dele
	 */
	@GetMapping("/quantidade-de-emprestimos-de-cada-livro")
	public String quantidadeDeEmprestimosDeCadaLivro() {
		return "VERIFIQUE A SAÍDA NO CONSOLE";
	}
	
	/*
	 * Exibir somente livros que tenham 3 ou menos empréstimos
	 */
	@GetMapping("/livros-com-menos-de-quatro-emprestimos")
	public String livrosComMenosDeQuatroEmprestimos() {
		return "VERIFIQUE A SAÍDA NO CONSOLE";
	}
		
	/*
	 * Exibir os autores e os livros publicados por eles
	 */
	@GetMapping("/autores-e-seus-livros")
	public String autoresESeusLivros() {
		return "VERIFIQUE A SAÍDA NO CONSOLE";
	}
	
	/*
	 * Só uma listagem inocente de todos os autores
	 */
	@GetMapping("/")
	public List<Autor> listaTodosOsAutores() {
		return Collections.emptyList();
	}
	
}
