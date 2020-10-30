package org.serratec.workshop.repositorio;

import java.util.List;

import org.serratec.workshop.modelo.Autor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface AutorRepository extends Repository<Autor, Long> {

	@Query("SELECT autor FROM Autor autor "
			+ "JOIN autor.livros livros "
			+ "JOIN livros.assunto assunto "
			+ "WHERE assunto.descricao = :descricao")
	List<Autor> listaAutoresDoAssunto(String descricao);

//	@Query("SELECT DISTINCT autor FROM Autor autor JOIN FETCH autor.livros livros ")
	List<Autor> findAll();
}
