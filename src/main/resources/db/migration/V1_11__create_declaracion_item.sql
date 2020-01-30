CREATE TABLE declaracion_item(
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    id_proveedor BIGINT UNSIGNED,
    id_tipo_declaracion BIGINT UNSIGNED NOT NULL,
    id_tipo_bien BIGINT UNSIGNED,
    id_tipo_resina BIGINT UNSIGNED,
    id_tipo_uso BIGINT UNSIGNED,
    id_forma_valoracion BIGINT UNSIGNED,
    id_origen_bien BIGINT UNSIGNED NOT NULL,
    id_destino_bien BIGINT UNSIGNED NOT NULL,
    biodegradable INT(1) NOT NULL,
    porcentaje_reciclado INT(10) NOT NULL,
    cantidad INT(10) NOT NULL,
    peso INT(10) NOT NULL,
    mes INT(2) NOT NULL,
	PRIMARY KEY (id),
	INDEX IX_dec_proveedor_id (id_proveedor),
    INDEX IX_dec_tipo_declaracion_id (id_tipo_declaracion),
    INDEX IX_dec_tipo_bien_id (id_tipo_bien),
    INDEX IX_dec_tipo_resina_id (id_tipo_resina),
    INDEX IX_dec_tipo_uso_id (id_tipo_uso),
    INDEX IX_dec_forma_valoracion_id (id_forma_valoracion),
    INDEX IX_dec_origen_bien_id (id_origen_bien),
    INDEX IX_dec_destino_bien_id (id_destino_bien),
	CONSTRAINT FK_dec_proveedor_id FOREIGN KEY (id_proveedor) REFERENCES proveedor (id),
    CONSTRAINT FK_dec_tipo_declaracion_id FOREIGN KEY (id_tipo_declaracion) REFERENCES tipo_base (id),
    CONSTRAINT FK_dec_tipo_bien_id FOREIGN KEY (id_tipo_bien) REFERENCES tipo_base (id),
    CONSTRAINT FK_dec_tipo_resina_id FOREIGN KEY (id_tipo_resina) REFERENCES tipo_base (id),
    CONSTRAINT FK_dec_tipo_uso_id FOREIGN KEY (id_tipo_uso) REFERENCES tipo_base (id),
    CONSTRAINT FK_dec_forma_valoracion_id FOREIGN KEY (id_forma_valoracion) REFERENCES tipo_base (id),
    CONSTRAINT FK_dec_origen_bien_id FOREIGN KEY (id_origen_bien) REFERENCES origen (id),
    CONSTRAINT FK_dec_destino_bien_id FOREIGN KEY (id_destino_bien) REFERENCES destino (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;