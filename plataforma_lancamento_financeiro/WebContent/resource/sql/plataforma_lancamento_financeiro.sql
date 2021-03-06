-- VERIFICAR TODOS OS BANCOS DE DADOS
SELECT DATNAME FROM PG_DATABASE WHERE DATISTEMPLATE = FALSE;

-- CIAR BANCO DE DADOS
-- CREATE DATABASE db_plfd;
-- DROP DATABASE db_plfd;

-- INTERROMPER CONEXAO DE TODOS OS USUARIOS PARA UM DETERMINADO BANCO DE DADOS 
SELECT PG_TERMINATE_BACKEND (PG_STAT_ACTIVITY.PID)
FROM PG_STAT_ACTIVITY
WHERE PG_STAT_ACTIVITY.DATNAME ILIKE 'db_plfd';

SELECT PG_TERMINATE_BACKEND(PID) FROM PG_STAT_ACTIVITY WHERE PID <> PG_BACKEND_PID();

-- CONSULTAS

-- TB_ATIVO CIRCULANTE
SELECT * FROM PUBLIC.TB_ATIVO_CIRCULANTE;

SELECT CODIGO,
	   DATA_RECEBIMENTO,
	   ID_DESTINO_PAGAMENTO,
	   ID_FONTE_PAGAMENTO,
	   VALOR_PARCELA
FROM PUBLIC.TB_ATIVO_CIRCULANTE;

DROP TABLE PUBLIC.TB_PESSOA;
SELECT * FROM PUBLIC.TB_PESSOA;

INSERT INTO PUBLIC.TB_PESSOA(CODIGO, IS_ATIVO, IS_FONTE_PAGAMENTO, NOME, TIPO_PESSOA) VALUES
(1, TRUE, TRUE, 'Thereza das Graças Rodrigues Silva', 'PESSOA_FISICA'),
(2, TRUE, TRUE, 'Léia Rodrigues Silva', 'PESSOA_FISICA'),
(3, TRUE, TRUE, 'Renata Rodrigues Silva', 'PESSOA_FISICA'),
(4, TRUE, TRUE, 'José Quintin', 'PESSOA_FISICA'),
(5, TRUE, TRUE, 'Jordann Lucas Rodrigues Andrade', 'PESSOA_FISICA'),
(6, TRUE, TRUE, 'Jonathan Luan Rodrigues Andrade', 'PESSOA_FISICA'),
(7, TRUE, TRUE, 'Jonas Luiz Rodrigues Andrade', 'PESSOA_FISICA'),
(8, TRUE, TRUE, 'Jamile Batista Alves', 'PESSOA_FISICA');

SELECT *
FROM TB_PESSOA pessoadoma0_;




