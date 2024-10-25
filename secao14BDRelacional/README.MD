## Banco de Dados Relacional

### MySQL

O MySQL é um dos sistemas de gerenciamento de banco de dados relacionais (RDBMS) mais populares, amplamente utilizado em aplicações web para armazenar e gerenciar dados.

---

### Comandos Úteis no Terminal

Aqui estão alguns comandos comuns para gerenciar o serviço MySQL a partir do terminal:

| Comando                            | Descrição                                                   |
|------------------------------------|-------------------------------------------------------------|
| `service mysql status`             | Verifica o status do serviço MySQL                          |
| `sudo service mysql stop`          | Para o serviço MySQL                                        |
| `sudo service mysql start`         | Inicia o serviço MySQL                                      |
| `mysql --version`                  | Exibe a versão instalada do MySQL                           |
| `sudo mysql -u root -p`            | Acessa o MySQL como usuário `root` (solicita senha)         |

---

### Acessando o MySQL

Para acessar o MySQL no terminal como usuário `root`:

```bash
sudo mysql -u root -p
