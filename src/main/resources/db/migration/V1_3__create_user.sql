CREATE TABLE user (
  id_user BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  id_person BIGINT UNSIGNED,
  id_role BIGINT UNSIGNED NOT NULL,
  user_name VARCHAR(100) NOT NULL,
  password VARCHAR(255) NOT NULL,
  PRIMARY KEY (id_user),
  UNIQUE INDEX UQ_user_name (user_name),
  INDEX IX_user_person_id (id_person),
  INDEX IX_user_role_id (id_role),
  CONSTRAINT FK_user_person_id FOREIGN KEY (id_person) REFERENCES person (id_person),
  CONSTRAINT FK_user_role_id FOREIGN KEY (id_role) REFERENCES role (id_role)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;