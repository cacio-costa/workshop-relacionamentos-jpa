package org.serratec.workshop.controller;

import java.util.List;

import org.serratec.workshop.modelo.Autor;
import org.serratec.workshop.modelo.Livro;
import org.serratec.workshop.modelo.LivroComQuantidadeDeEmprestimos;
import org.serratec.workshop.repositorio.AutorRepository;
import org.serratec.workshop.repositorio.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesafioController {
	
	@Autowired
	private AutorRepository autorRepository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	/*
	 * Listar autores com livros de arquitetura
	 */
	@GetMapping("/autores-de-arquitetura")
	public String autoresDeArquitetura() {
		List<Autor> autores = autorRepository.listaAutoresDoAssunto("Arquitetura");
		for (Autor autor : autores) {
			System.out.println(autor);
		}
		
		return "VERIFIQUE A SAÍDA NO CONSOLE";
	}
	
	/*
	 * Exibir o nome do livro com a quantidade de empréstimos dele
	 */
	@GetMapping("/quantidade-de-emprestimos-de-cada-livro")
	public String quantidadeDeEmprestimosDeCadaLivro() {
		List<LivroComQuantidadeDeEmprestimos> livrosComEmprestimos = livroRepository.listaLivrosComQuantidadeDeEmprestimos();
		for (LivroComQuantidadeDeEmprestimos livroComEmprestimos : livrosComEmprestimos) {
			System.out.println(livroComEmprestimos.getResumo());
		}
		
		return "VERIFIQUE A SAÍDA NO CONSOLE";
	}
	
	/*
	 * Exibir somente livros que foram pouco emprestados (até 2 vezes)
	 */
	@GetMapping("/livros-pouco-emprestados")
	public String livrosComMenosDeTresEmprestimos() {
		List<Livro> livros = livroRepository.listaLivrosPoucoEmprestados();
		for (Livro livro : livros) {
			System.out.println(livro);
		}
		
		return "VERIFIQUE A SAÍDA NO CONSOLE";
	}
		
	/*
	 * Exibir os autores e os livros publicados por eles
	 */
	@GetMapping("/autores-e-seus-livros")
	public String autoresESeusLivros() {
		List<Autor> autores = autorRepository.findAll();
		for (Autor autor : autores) {
			System.out.println(autor.getNome() + ": ");
			
			List<Livro> livros = autor.getLivros();
			for (Livro livro : livros) {
				System.out.println(" - " + livro.getDescricao());
			}
		}
		
		return "VERIFIQUE A SAÍDA NO CONSOLE";
	}
	
	/*
	 * Só uma listagem inocente de todos os autores
	 */
	@GetMapping("/")
	public List<Autor> listaTodosOsAutores() {
		return autorRepository.findAll();
	}
	
}
