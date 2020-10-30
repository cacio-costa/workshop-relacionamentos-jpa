package org.serratec.workshop.repositorio;

import java.util.List;

import org.serratec.workshop.modelo.Livro;
import org.serratec.workshop.modelo.LivroComQuantidadeDeEmprestimos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface LivroRepository extends Repository<Livro, Long> {

	@Query("SELECT new org.serratec.workshop.modelo.LivroComQuantidadeDeEmprestimos(livro, count(livro)) "
			+ "FROM Livro livro "
			+ "JOIN livro.emprestimos emprestimos "
			+ "GROUP BY livro")
	List<LivroComQuantidadeDeEmprestimos> listaLivrosComQuantidadeDeEmprestimos();

	@Query("SELECT livro FROM Livro livro "
			+ "JOIN livro.emprestimos emprestimos "
			+ "GROUP BY livro "
			+ "HAVING count(emprestimos) < 3")
	List<Livro> listaLivrosPoucoEmprestados();
	
}
