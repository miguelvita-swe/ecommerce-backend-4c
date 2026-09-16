package br.edu.unifio.ecommerce.repositorios;

import br.edu.unifio.ecommerce.entidades.Categoria;
import br.edu.unifio.ecommerce.entidades.Cliente;
import br.edu.unifio.ecommerce.entidades.ItemPedido;
import br.edu.unifio.ecommerce.entidades.Pedido;
import br.edu.unifio.ecommerce.entidades.Produto;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ItemPedidoRepositorioTest {

    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Autowired
    private EntityManager entityManager;

    @Test
    @Transactional
    void inserir() {
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente Item");
        cliente.setEmail("item@email.com");
        cliente.setTelefone("(11) 97777-8888");
        Cliente clienteSalvo = clienteRepositorio.save(cliente);

        Pedido pedido = new Pedido();
        pedido.setData(LocalDateTime.now());
        pedido.setStatus("PENDENTE");
        pedido.setValorTotal(new BigDecimal("250.00"));
        pedido.setCliente(clienteSalvo);
        Pedido pedidoSalvo = pedidoRepositorio.save(pedido);

        Categoria categoria = new Categoria();
        categoria.setNome("Categoria Item");
        categoria.setDescricao("Categoria de item de teste");
        Categoria categoriaSalva = categoriaRepositorio.save(categoria);

        Produto produto = new Produto();
        produto.setNome("Produto Item");
        produto.setDescricao("Produto para item de teste");
        produto.setPreco(new BigDecimal("125.00"));
        produto.setEstoque((short) 10);
        produto.setCategoria(categoriaSalva);
        entityManager.persist(produto);

        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setQuantidade(2);
        itemPedido.setValorUnitario(new BigDecimal("125.00"));
        itemPedido.setPedido(pedidoSalvo);
        itemPedido.setProduto(produto);

        ItemPedido salvo = itemPedidoRepositorio.save(itemPedido);

        assertNotNull(salvo.getId());
    }
}
