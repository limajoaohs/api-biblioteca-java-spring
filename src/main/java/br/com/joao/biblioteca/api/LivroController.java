package br.com.joao.biblioteca.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository repository;

    // READ - Listar todos
    @GetMapping
    public List<Livro> listarTodos() {
        return repository.findAll();
    }

    // READ - Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarPorId(@PathVariable Long id) {
        Optional<Livro> livroOptional = repository.findById(id);
        return livroOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // CREATE - Criar um novo livro
    @PostMapping
    public Livro criarLivro(@RequestBody Livro novoLivro) {
        return repository.save(novoLivro);
    }


    // UPDATE - Atualizar um livro existente
    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable Long id, @RequestBody Livro livroAtualizado) {
        return repository.findById(id)
                .map(livroExistente -> {
                    livroExistente.setTitulo(livroAtualizado.getTitulo());
                    livroExistente.setAutor(livroAtualizado.getAutor());
                    livroExistente.setAnoPublicacao(livroAtualizado.getAnoPublicacao());
                    return ResponseEntity.ok(repository.save(livroExistente));
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // DELETE - Deletar um livro
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarLivro(@PathVariable Long id) {
        return repository.findById(id)
                .map(livro -> {
                    repository.deleteById(id);
                    return ResponseEntity.noContent().build(); // Retorna 204 No Content (sucesso, sem conteúdo)
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}