insert into assunto (descricao) values ('Programação');
insert into assunto (descricao) values ('Arquitetura');
    
insert into autor (nome) values ('Martin Fowler');
insert into autor (nome) values ('Robert Martin');
insert into autor (nome) values ('Sam Newman');

insert into livro (descricao, numero_de_paginas, assunto_id) values ('Refatoração', 500, 1);
insert into livro (descricao, numero_de_paginas, assunto_id) values ('Padrões de Arquitetura de Aplicações Corporativas', 750, 2);

insert into livro (descricao, numero_de_paginas, assunto_id) values ('Clean Code', 500, 1);
insert into livro (descricao, numero_de_paginas, assunto_id) values ('Clean Architecture', 680, 2);

insert into livro (descricao, numero_de_paginas, assunto_id) values ('Building Microservices', 467, 1);
insert into livro (descricao, numero_de_paginas, assunto_id) values ('Monolith to Microservices', 540, 1);

    
insert into autor_livros (autor_id, livros_id) values (1, 1);
insert into autor_livros (autor_id, livros_id) values (1, 2);
insert into autor_livros (autor_id, livros_id) values (2, 3);
insert into autor_livros (autor_id, livros_id) values (2, 4);
insert into autor_livros (autor_id, livros_id) values (3, 5);
insert into autor_livros (autor_id, livros_id) values (3, 6);

insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-01', '2020-01-02', 1);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-02', '2020-01-03', 1);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-03', '2020-01-04', 1);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-04', '2020-01-05', 1);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-05', '2020-01-06', 2);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-06', '2020-01-07', 2);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-07', '2020-01-08', 3);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-08', '2020-01-09', 3);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-09', '2020-01-10', 3);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-10', '2020-01-11', 3);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-11', '2020-01-12', 3);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-12', '2020-01-13', 4);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-13', '2020-01-14', 5);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-14', '2020-01-15', 5);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-15', '2020-01-16', 5);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-16', '2020-01-17', 6);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-17', '2020-01-18', 6);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-18', '2020-01-19', 6);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-19', '2020-01-20', 6);
insert into emprestimo (data_de_devolucao, data_de_emprestimo, livro_id) values ('2020-01-20', '2020-01-21', 6);