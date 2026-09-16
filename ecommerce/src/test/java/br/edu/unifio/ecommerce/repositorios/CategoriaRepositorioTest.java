package br.edu.unifio.ecommerce.repositorios;

import br.edu.unifio.ecommerce.entidades.Categoria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CategoriaRepositorioTest {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Test
    void inserir() {
        Categoria categoria = new Categoria();
        categoria.setNome("Teste Categoria");
        categoria.setDescricao("Categoria de teste");

        Categoria salvo = categoriaRepositorio.save(categoria);

        assertNotNull(salvo.getId());
    }
}
