CREATE TABLE IF NOT EXISTS produto (
                                       id INTEGER PRIMARY KEY,
                                       nome VARCHAR(100) NOT NULL,
                                       categoria_id INTEGER,
                                       pedido_id INTEGER,
                                       valor NUMERIC(10, 2) NOT NULL,
                                       status CHAR(1) NOT NULL,
                                           FOREIGN KEY (categoria_id) REFERENCES categoria (id),
                                       FOREIGN KEY (pedido_id) REFERENCES pedido (id)
);