CREATE TABLE person (
  id_person BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  id_number VARCHAR(8) NOT NULL, 
  address VARCHAR(150) NOT NULL, 
  phone VARCHAR(15) NOT NULL,
  email VARCHAR(100),
  active BIT NOT NULL,
  PRIMARY KEY (id_person),
  INDEX IX_person_last_first_name (last_name, first_name)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;