drop table if exists palavras;

CREATE TABLE palavras (
    id INTEGER PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    nome_check VARCHAR(255) NOT NULL,
    dica TEXT NOT NULL
);

INSERT INTO palavras (id, nome, nome_check, dica) VALUES
(1, 'Cachorro', 'cachorro', 'Animal de estimação que late.'),
(2, 'Cadeira', 'cadeira', 'Objeto usado para sentar.'),
(3, 'Laptop', 'laptop', 'Dispositivo portátil usado para computação.'),
(4, 'Maçã', 'maca', 'Fruta redonda, geralmente vermelha ou verde.'),
(5, 'Árvore', 'arvore', 'Planta de grande porte com tronco.'),
(6, 'Médico', 'medico', 'Profissional que cuida da saúde.'),
(7, 'Futebol', 'futebol', 'Esporte praticado com uma bola e dois times.'),
(8, 'Telefone', 'telefone', 'Dispositivo para comunicação à distância.'),
(9, 'Relógio', 'relogio', 'Aparelho usado para medir o tempo.'),
(10, 'Geladeira', 'geladeira', 'Equipamento usado para conservar alimentos.'),
(11, 'Livro', 'livro', 'Material composto por páginas de papel que contém texto ou imagens.'),
(12, 'Guitarra', 'guitarra', 'Instrumento musical de cordas.'),
(13, 'Café', 'cafe', 'Bebida feita a partir de grãos torrados e moídos.'),
(14, 'Avião', 'aviao', 'Veículo que voa, usado para transporte aéreo.'),
(15, 'Computador', 'computador', 'Máquina eletrônica usada para processamento de dados.');
