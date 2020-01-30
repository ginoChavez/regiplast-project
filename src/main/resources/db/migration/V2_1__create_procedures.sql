DELIMITER $$

CREATE PROCEDURE getTipados(codigo varchar(20))
BEGIN
   SELECT * FROM tipo_base where tipo = codigo;
   END $$


CREATE PROCEDURE getTipado(idTipado bigint)
BEGIN
   SELECT * FROM tipo_base where id = idTipado;
   END $$

DELIMITER ;