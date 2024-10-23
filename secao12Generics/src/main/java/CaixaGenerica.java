public class CaixaGenerica<T> {

    // Neste exemplo foi utilizado o tipo genérico, definido na identidade da classe

    private T caixa;

    public T getCaixa() {
        return caixa;
    }

    public void setCaixa(T caixa) {
        this.caixa = caixa;
    }
}
