CREATE TABLE declaracion(
	id_declaracion BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    id_empresa BIGINT UNSIGNED NOT NULL,
    anio VARCHAR(5) NOT NULL,
	PRIMARY KEY (id_declaracion),
	INDEX IX_declaracion_empresa_id (id_empresa),
	CONSTRAINT FK_declaracion_empresa_id FOREIGN KEY (id_empresa) REFERENCES empresa (id_empresa)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;