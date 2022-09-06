# ![DevSuperior logo](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/devsuperior-logo-small.png) Aula ao vivo especial: ORM
## Como os sistemas modernos acessam um banco de dados relacional?
>  *Aula ao vivo especial ocorrida durante a Semana Spring React 10ª edição*

## Realização
[DevSuperior - Escola de programação](https://devsuperior.com.br)

[![DevSuperior no Instagram](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/ig-icon.png)](https://instagram.com/devsuperior.ig)
[![DevSuperior no Youtube](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/yt-icon.png)](https://youtube.com/devsuperior)

Assista o vídeo desta aula:

[![Image](https://img.youtube.com/vi/nW0k-BSrbbk/mqdefault.jpg "Vídeo no Youtube")](https://youtu.be/nW0k-BSrbbk)

## Tópicos
- Entidades e relacionamentos
- Modelo relacional vs. modelo de objetos
- Implementação Java com Spring Boot
- Mapeamento objeto-relacional (ORM)
- Seed da base de dados


## Modelo relacional
![Image](https://raw.githubusercontent.com/devsuperior/ds-resources/main/img/employee-department-tables.png "Modelo relacional")

## Modelo de objetos
![Image](https://raw.githubusercontent.com/devsuperior/ds-resources/main/img/employee-department-obj.png "Modelo de objetos")

## Diagrama de classes
![Image](https://raw.githubusercontent.com/devsuperior/ds-resources/main/img/employee-department-class.png "Diagrama de classes")

## Configuração do banco de dados H2
```
# Dados de conexão com o banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

## import.sql
```sql
INSERT INTO tb_department(name) VALUES ('Vendas');
INSERT INTO tb_department(name) VALUES ('Marketing');
INSERT INTO tb_department(name) VALUES ('TI');

INSERT INTO tb_employee(name, salary, department_id) VALUES ('Maria', 6000.0, 1);
INSERT INTO tb_employee(name, salary, department_id) VALUES ('Pedro', 5000.0, 3);
INSERT INTO tb_employee(name, salary, department_id) VALUES ('Ana', 7000.0, 3);
INSERT INTO tb_employee(name, salary, department_id) VALUES ('Carlos', 6000.0, 1);
INSERT INTO tb_employee(name, salary, department_id) VALUES ('Antonio', 5000.0, 2);
```
