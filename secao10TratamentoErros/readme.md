## Conceito Básico de Tratamento de Erros em Java

O **tratamento de erros** em Java é uma técnica usada para lidar com situações inesperadas ou indesejadas que podem ocorrer durante a execução de um programa, como erros de entrada de dados, operações inválidas, problemas de rede, entre outros. A principal ferramenta para tratamento de erros em Java é o uso de **exceções**.

### O que são Exceções?
- **Exceções** são eventos que ocorrem durante a execução de um programa, interrompendo o fluxo normal de execução.
- Elas são objetos que representam situações anômalas ou erros.
- Java possui uma hierarquia de classes para tratar exceções, sendo a mais comum a classe `Exception`.

### Tipos de Exceções
- **Checked Exceptions**: São verificadas em tempo de compilação. O programador é obrigado a tratar essas exceções.
  - Ex.: `IOException`, `SQLException`.
- **Unchecked Exceptions**: São aquelas que ocorrem em tempo de execução e não são obrigatórias de serem tratadas.
  - Ex.: `NullPointerException`, `ArithmeticException`.
- **Erros (`Error`)**: Representam problemas mais graves que normalmente não podem ser recuperados pelo programa.
  - Ex.: `OutOfMemoryError`, `StackOverflowError`.

### Estrutura Básica do Try-Catch
O bloco `try-catch` é usado para capturar e tratar exceções em Java.

```java
try {
    // Código que pode gerar uma exceção
} catch (TipoDeExcecao e) {
    // Código para tratar a exceção
}
```

### Exemplo básico

```java
public class ExemploTratamentoErros {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Isso causará uma ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida."); //Captura a exceção e exibe uma mensagem de texto amigável
        }
    }
}
```

### Bloco Finally (opcional)

O bloco finally é opcional e, quando presente, é sempre executado após o try e catch, independentemente de uma exceção ter sido lançada ou não.
Útil para liberar recursos como fechar arquivos ou conexões de banco de dados.

```java
try {
    // Código que pode gerar uma exceção
} catch (Exception e) {
    // Código para tratar a exceção
} finally {
    // Código que sempre será executado
}
```

### Lançando exceções com throw

O comando throw é usado para lançar uma exceção manualmente.
Pode ser usado para criar exceções personalizadas e melhorar a legibilidade do código.

```java
public void verificarIdade(int idade) {
    if (idade < 18) {
        throw new IllegalArgumentException("Idade deve ser maior que 18.");
    }
}
```

### Vantagens do Tratamento de Erros
- Melhora a **resiliência** do programa, evitando falhas abruptas.
- Permite a **recuperação** de situações inesperadas.
- Torna o código mais **legível** e **manutenível** ao separar a lógica de tratamento de erros.

### Considerações
- Use exceções apenas para situações **excepcionais**, não para controle de fluxo.
- É importante **documentar** quais exceções um método pode lançar.
- Em alguns casos, é necessário criar **exceções personalizadas** para representar erros específicos do seu domínio de aplicação.