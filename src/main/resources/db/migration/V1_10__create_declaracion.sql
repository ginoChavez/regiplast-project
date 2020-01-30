CREATE TABLE declaracion(
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    id_empresa BIGINT UNSIGNED NOT NULL,
    anio VARCHAR(5) NOT NULL,
	PRIMARY KEY (id),
	INDEX IX_declaracion_empresa_id (id),
	CONSTRAINT FK_declaracion_empresa_id FOREIGN KEY (id_empresa) REFERENCES empresa (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;