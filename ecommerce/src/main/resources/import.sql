insert into categoria (nome, descricao) values ('Informática', 'Produtos de informática');
insert into categoria (nome, descricao) values ('Livros', 'Livros técnicos e acadêmicos');
insert into categoria (nome, descricao) values ('Eletrônicos', 'Aparelhos eletrônicos');
insert into categoria (nome, descricao) values ('Casa', 'Itens para casa e decoração');
insert into categoria (nome, descricao) values ('Esportes', 'Produtos de esportes e lazer');

insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Notebook Ultra', 'Laptop 14 polegadas com SSD', 3999.99, 10, 1);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Java Essentials', 'Livro de Java para iniciantes', 89.90, 30, 2);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Smart TV 55', 'Televisão LED Full HD', 2499.90, 8, 3);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Furadeira Sem Fio', 'Furadeira com bateria e acessórios', 399.00, 18, 4);
insert into produto (nome, descricao, preco, estoque, categoria_id) values ('Bicicleta Urbana', 'Bicicleta para cidade e lazer', 899.00, 6, 5);

insert into cliente (nome, email, telefone) values ('Ana Souza', 'ana.souza@email.com', '(11) 99999-1111');
insert into cliente (nome, email, telefone) values ('Bruno Lima', 'bruno.lima@email.com', '(11) 98888-2222');
insert into cliente (nome, email, telefone) values ('Carla Santos', 'carla.santos@email.com', '(11) 97777-3333');
insert into cliente (nome, email, telefone) values ('Diego Rocha', 'diego.rocha@email.com', '(11) 96666-4444');
insert into cliente (nome, email, telefone) values ('Eduarda Costa', 'eduarda.costa@email.com', '(11) 95555-5555');

insert into pedido (data, status, valor_total, cliente_id) values ('2024-01-10 09:15:00', 'PENDENTE', 3999.99, 1);
insert into pedido (data, status, valor_total, cliente_id) values ('2024-01-11 14:20:00', 'CONFIRMADO', 89.90, 2);
insert into pedido (data, status, valor_total, cliente_id) values ('2024-01-12 08:45:00', 'ENVIADO', 2499.90, 3);
insert into pedido (data, status, valor_total, cliente_id) values ('2024-01-13 16:10:00', 'PAGO', 798.00, 4);
insert into pedido (data, status, valor_total, cliente_id) values ('2024-01-14 11:30:00', 'ENTREGUE', 1798.00, 5);

insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 3999.99, 1, 1);
insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 89.90, 2, 2);
insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (1, 2499.90, 3, 3);
insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (2, 399.00, 4, 4);
insert into item_pedido (quantidade, valor_unitario, pedido_id, produto_id) values (2, 899.00, 5, 5);

insert into pagamento (valor, data, status, tipo, pedido_id) values (3999.99, '2024-01-10 09:30:00', 'PAGO', 'CARTAO', 1);
insert into pagamento (valor, data, status, tipo, pedido_id) values (89.90, '2024-01-11 14:40:00', 'PAGO', 'PIX', 2);
insert into pagamento (valor, data, status, tipo, pedido_id) values (2499.90, '2024-01-12 09:00:00', 'PAGO', 'BOLETO', 3);
insert into pagamento (valor, data, status, tipo, pedido_id) values (798.00, '2024-01-13 16:25:00', 'PAGO', 'CARTAO', 4);
insert into pagamento (valor, data, status, tipo, pedido_id) values (1798.00, '2024-01-14 11:45:00', 'PAGO', 'PIX', 5);