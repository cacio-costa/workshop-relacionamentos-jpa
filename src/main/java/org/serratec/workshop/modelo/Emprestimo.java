package org.serratec.workshop.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDate dataDeEmprestimo;
	private LocalDate dataDeDevolucao;
	
	@ManyToOne
	private Livro livro;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataDeEmprestimo() {
		return dataDeEmprestimo;
	}

	public void setDataDeEmprestimo(LocalDate dataDeEmprestimo) {
		this.dataDeEmprestimo = dataDeEmprestimo;
	}

	public LocalDate getDataDeDevolucao() {
		return dataDeDevolucao;
	}

	public void setDataDeDevolucao(LocalDate dataDeDevolucao) {
		this.dataDeDevolucao = dataDeDevolucao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	

}
