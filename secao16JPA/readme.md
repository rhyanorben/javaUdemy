## Java Persistense API (JPA)

### Data Mapper

O **Data Mapper** é um padrão de projeto que separa a lógica de negócios da lógica de persistência de dados. Nesse padrão, um objeto separado (Mapper) é responsável por transferir dados entre objetos da aplicação e o banco de dados, mantendo-os independentes um do outro.

- **Independência**: A lógica de persistência é abstraída em uma camada específica, o que facilita a manutenção e a alteração do esquema de banco de dados sem impactar diretamente na lógica de negócios.
- **Flexibilidade**: Por ser independente da lógica de negócios, permite maior flexibilidade na escolha do banco de dados e nos mapeamentos dos objetos.
- **Complexidade**: Pode ser mais complexo de implementar em comparação a outros padrões como o Active Record, já que requer a definição de classes separadas para os mapeamentos.

Este padrão é amplamente utilizado em frameworks de ORM (Object-Relational Mapping), como o **Java Persistence API (JPA)**, onde as entidades representam os objetos de domínio e os repositórios (ou DAOs) manipulam a persistência e as consultas.

### Active Record

O **Active Record** é um padrão de projeto que une a lógica de negócios e a lógica de persistência de dados em um único objeto. Nesse padrão, cada objeto da aplicação é responsável por gerenciar sua própria persistência no banco de dados, como salvar, atualizar, deletar e buscar registros.

- **Facilidade de Uso**: Por integrar a lógica de negócios e de persistência em uma única classe, o Active Record é fácil de entender e implementar, especialmente em aplicações simples.
- **Menos Flexível**: Como a lógica de negócios e a lógica de persistência estão acopladas, alterações no esquema do banco de dados podem exigir mudanças nos objetos de domínio, dificultando a manutenção em projetos maiores.
- **Boa Opção para Pequenos Projetos**: Em aplicações menores ou com lógica de negócios simples, o Active Record pode ser mais direto e eficiente do que o Data Mapper, reduzindo a complexidade da arquitetura.

Esse padrão é comumente usado em frameworks como **Ruby on Rails**, onde cada modelo representa uma tabela do banco de dados e é responsável por gerenciar sua própria persistência.