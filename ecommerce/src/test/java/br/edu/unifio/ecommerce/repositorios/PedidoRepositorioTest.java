package br.edu.unifio.ecommerce.repositorios;

import br.edu.unifio.ecommerce.entidades.Cliente;
import br.edu.unifio.ecommerce.entidades.Pedido;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class PedidoRepositorioTest {

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test
    void inserir() {
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente Pedido");
        cliente.setEmail("pedido@email.com");
        cliente.setTelefone("(11) 98888-9999");
        Cliente clienteSalvo = clienteRepositorio.save(cliente);

        Pedido pedido = new Pedido();
        pedido.setData(LocalDateTime.now());
        pedido.setStatus("PENDENTE");
        pedido.setValorTotal(new BigDecimal("199.90"));
        pedido.setCliente(clienteSalvo);

        Pedido salvo = pedidoRepositorio.save(pedido);

        assertNotNull(salvo.getId());
    }
}
