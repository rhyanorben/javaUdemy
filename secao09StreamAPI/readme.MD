## Seção 09 - Stream API

## Conceito Básico de Stream API em Java

A **Stream API** foi introduzida no Java 8 e é uma das principais ferramentas para trabalhar com **coleções de dados** de forma mais eficiente e funcional. Ela permite **processar grandes quantidades de dados** de forma paralela e simplificada, utilizando operações que facilitam a manipulação e transformação de coleções, como listas e conjuntos.

### O que é uma Stream?
- Uma **Stream** é uma sequência de elementos que suporta operações de agregação.
- Não é uma estrutura de dados; não armazena elementos.
- A **Stream API** permite processar dados de forma **declarativa** (similar ao que é feito em bancos de dados).
- Pode ser usada para **filtrar**, **mapear**, **reduzir**, **classificar** e realizar outras operações sobre elementos de uma coleção.

### Principais Operações de Stream
As operações em Streams são divididas em **intermediárias** e **finais**:

- **Operações Intermediárias**: Retornam uma nova Stream e são usadas para transformar ou filtrar os dados.
  - Ex.: `filter()`, `map()`, `sorted()`
- **Operações Finais**: Executam uma ação final e encerram o processamento da Stream.
  - Ex.: `forEach()`, `collect()`, `reduce()`

### Exemplo Básico

```java
import java.util.Arrays;
import java.util.List;

public class ExemploStream {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Filtra os números pares e imprime cada um deles
        numeros.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
}
```

Neste exemplo:

- Criamos uma lista de números de 1 a 5.
- Usamos `stream()` para transformar a lista em uma Stream.
- `filter(n -> n % 2 == 0)` filtra os números pares.
- `forEach(System.out::println)` é uma operação final que imprime cada número da Stream.

### Vantagens da Stream API
- **Código mais conciso** e fácil de ler.
- Facilita o **processamento paralelo** de dados.
- Ideal para trabalhar com grandes coleções de forma mais eficiente.

### Considerações
- Streams podem ser usadas apenas **uma vez**. Após uma operação final, a Stream é considerada **consumida**.
- As Streams são projetadas para operações **sem estado** e **imutáveis**, garantindo maior segurança e menos efeitos colaterais.