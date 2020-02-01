CREATE TABLE role_claim (
  id_role_claim BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  claim_type VARCHAR(100) NOT NULL,
  claim_value VARCHAR(100) NOT NULL,
  id_role BIGINT UNSIGNED NOT NULL,
  PRIMARY KEY (id_role_claim),
  INDEX IX_role_claim_role_id (id_role),
  CONSTRAINT FK_role_claim_role_id FOREIGN KEY (id_role) REFERENCES role (id_role)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;