# Orientação a objetos (OO)

## Pilares:

1. Encapsulamento
2. Herança
3. Polimorfismo
4. Abstração

---

### 1. Encapsulamento

Encapsulamento é você de fato encapsular algo dentro do código para a pessoa que for utilizar não ter a necessidade de "conhecer" o que está dentro dessa cápsula. Por exemplo:

Uma pessoa pode dirigir um carro por meio do volante, câmbio de marchas e pedais. Porém, ela não necessariamente precisa conhecer como funciona a injeção do motor do carro, isso está encapsulado no funcionamento "interno" do carro.

Um baixo nível de encapsulamento pode ser entendido quando você tem, por exemplo, duas classes muito dependentes uma da outra, com muito acoplamento. Vai influenciar quando você tiver que realizar alguma mudança no código e ele estar muito "amarrado".

*Principal do pilar: quanto melhor você esconder as interações necessárias ao usuário, melhor se torna o código.*

### Modificadores de acesso:

Em ordem de mais "aberto" para privado:

#### 1. Public

Pode ser acessado de qualquer lugar, ou por todo mundo.

#### 2. Protected

Pode acessar um atributo de outro package, desde que ele seja herdado.

#### 3. Package (default)

Só pode ser acessado se estiver no mesmo package (pasta).

#### 4. Private

Só pode ser acessado dentro da própria classe.

---

### 2. Herança

A herança segue uma hierarquia, onde podemos herdar atributos e métodos aos níveis mais baixos que são definidos como herdeiros. Exemplo: Animal -> Mamífero -> Mamíferos aquáticos -> ...

Podemos dividir em dois conceitos, onde nem sempre é recomendado utilizar a herança para o código também não ficar "amarrado". Os dois conceitos são "Herança" e "Composição".

A composição é mais recomendada por conta do comentário acima sobre a herança, porém podemos usar a seguinte dica para saber qual usar:

#### Composição:

Em frases em que o "__têm__" aparece, usamos composição:

- Carro __tem um__ motor;
- Carro __têm__ portas;
- Casa __têm__ uma cozinha.

#### Herança

Em frases em que o "__é um__" apareça:

- Civic __é um__ carro;
- Gato __é um__ mamífero;
- Maça __é uma__ fruta.

Isso não é uma regra fechada, porém é possível se basear por parte nisso.

Em uma subclasse é possível fazer a modificação de um método e deixar ele mais específico, reutilizando ou não o método da classe pai.

---

### 3. Polimorfismo

Pode ser divido em>

#### Estático

O estático consiste em "SOBRECARGA", quando é definido métodos com um mesmo nome, porém com parâmetros de entrada diferentes ou tipos diferentes. Isso causa não uma sobrecarga na execução do código, mas não é uma boa prática pois na maioria dos casos pode causar confusão.

#### Dinâmico

Para realizar o polimorfismo dinâmico é necessário a HERANÇA.

Ao instanciar o seguinte objeto:

Civic c = new Civic(); --Neste caso não consigo realizar o próximo comando:

c = new Ferrari(); --Porém se eu realizar dessa outra forma:

Carro c = new Civic();

c = new Ferrari(); --Neste caso, como a hierarquia de Carro é mais alta eu posso atualizar a minha variável com sucesso.

Isso também vale para parâmetro de funções ou outras situações, desde que a classe seja maior que a classe que será informada.

---

### 4. Abstração

Pode ser entendido como uma simplificação com base em práticas do "mundo real" dentro do software. Nem sempre tudo do mundo real se aplica dentro do Software, mas essa é uma prática importante para manter a organização do código.