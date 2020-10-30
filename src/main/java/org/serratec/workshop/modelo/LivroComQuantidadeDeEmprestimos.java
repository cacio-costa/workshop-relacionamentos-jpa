package org.serratec.workshop.modelo;

public class LivroComQuantidadeDeEmprestimos {

	private Livro livro;
	private Long quantidadeDeEmprestimos;

	public LivroComQuantidadeDeEmprestimos(Livro livro, Long quantidadeDeEmprestimos) {
		this.livro = livro;
		this.quantidadeDeEmprestimos = quantidadeDeEmprestimos;
	}

	public Livro getLivro() {
		return livro;
	}

	public Long getQuantidadeDeEmprestimos() {
		return quantidadeDeEmprestimos;
	}

	public String getResumo() {
		return livro.getDescricao() + ": " + quantidadeDeEmprestimos;
	}
	

}
