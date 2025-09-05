package br.com.joao.biblioteca.api;

import org.springframework.data.jpa.repository.JpaRepository;

// Esta interface herda todos os métodos de CRUD (save, findById, findAll, delete, etc.)
// para a entidade Livro, que tem um ID do tipo Long.
public interface LivroRepository extends JpaRepository<Livro, Long> {
}