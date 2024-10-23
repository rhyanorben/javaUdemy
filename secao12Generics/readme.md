# Seção 12 - Generics em Java

## O que são Generics?

Generics em Java permitem que classes, interfaces e métodos sejam parametrizados por tipos. Isso significa que você pode definir uma classe, interface ou método que funcione com diferentes tipos de dados, proporcionando maior segurança de tipo e reutilização de código.

### Vantagens dos Generics

- **Segurança de tipo**: Com Generics, erros de tipo são detectados em tempo de compilação, evitando exceções de tempo de execução como `ClassCastException`.
- **Reutilização de código**: Você pode escrever métodos e classes que funcionam com qualquer tipo de dados, tornando seu código mais genérico e reutilizável.
- **Eliminação de `casts`**: Sem Generics, você precisa usar `casts` explícitos para converter objetos ao tipo desejado. Com Generics, esse problema é resolvido.

### Sintaxe de Generics

A sintaxe de Generics usa colchetes angulares (`<>`) para especificar o tipo. Veja um exemplo básico:

```java
List<String> lista = new ArrayList<>();
```

Neste exemplo, a lista lista só pode armazenar objetos do tipo String. Isso garante que ao tentar adicionar um objeto de outro tipo, o compilador emitirá um erro.

### Exemplo de uma Classe Genérica

Abaixo está um exemplo de uma classe genérica simples em Java:

```java
public class Caixa<T> {
    private T item;

    public void guardar(T item) {
        this.item = item;
    }

    public T pegar() {
        return item;
    }
}
```

Neste exemplo, Caixa é uma classe genérica com um tipo T. Isso significa que você pode criar uma Caixa para qualquer tipo de objeto:

```java
Caixa<String> caixaDeTexto = new Caixa<>();
caixaDeTexto.guardar("Olá, Generics!");
String texto = caixaDeTexto.pegar();

Caixa<Integer> caixaDeNumero = new Caixa<>();
caixaDeNumero.guardar(42);
Integer numero = caixaDeNumero.pegar();
```

No exemplo acima, a Caixa pode armazenar tanto String quanto Integer, dependendo do tipo especificado na criação do objeto.

### Métodos Genéricos

Você também pode criar métodos genéricos em Java. Um método genérico é definido da seguinte forma:

```java
public class Util {
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.println(elemento);
        }
    }
}
```

Neste exemplo, o método imprimirArray pode receber um array de qualquer tipo e imprimir seus elementos. A chamada seria assim:

```java
String[] nomes = {"Alice", "Bob", "Carlos"};
Util.imprimirArray(nomes);

Integer[] numeros = {1, 2, 3, 4, 5};
Util.imprimirArray(numeros);
```

Isso permite que o método imprimirArray trabalhe tanto com arrays de String quanto com arrays de Integer de forma genérica.

### Tipos Coringas (wildcards)

Generics em Java também suportam o uso de tipos coringas (wildcards). Os coringas são representados pelo símbolo ? e são úteis quando você deseja trabalhar com um tipo genérico sem especificar exatamente qual tipo. Existem três tipos principais de coringas:

#### 1. Curinga sem limite (?): Qualquer tipo.

```java
List<?> lista = new ArrayList<String>();
```

Nesse exemplo, lista pode armazenar elementos de qualquer tipo, mas não é possível adicionar elementos nela.

#### 2. Curinga com limite superior (? extends Type): Aceita Type ou qualquer subtipo de Type.

```java
List<? extends Number> numeros = new ArrayList<Integer>();
```

Neste caso, numeros pode ser uma lista de qualquer tipo que seja Number ou seus subtipos, como Integer ou Double.

#### 3. Curinga com limite inferior (? super Type): Aceita Type ou qualquer supertipo de Type.

```java
List<? super Integer> numeros = new ArrayList<Number>();
```

Aqui, numeros pode ser uma lista de Integer ou qualquer um de seus supertypos, como Number ou Object.

### Conclusão

Os Generics são uma poderosa funcionalidade do Java que ajudam a escrever código mais seguro, reutilizável e de fácil manutenção. Embora a sintaxe possa parecer complexa no início, entender o conceito de parametrização de tipos e como utilizá-los corretamente é essencial para o desenvolvimento de aplicações robustas e flexíveis em Java.