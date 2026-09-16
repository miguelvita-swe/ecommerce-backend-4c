package br.edu.unifio.ecommerce.repositorios;

import br.edu.unifio.ecommerce.entidades.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ClienteRepositorioTest {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test
    void inserir() {
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente Teste");
        cliente.setEmail("cliente.teste@email.com");
        cliente.setTelefone("(11) 99999-0000");

        Cliente salvo = clienteRepositorio.save(cliente);

        assertNotNull(salvo.getId());
    }
}
