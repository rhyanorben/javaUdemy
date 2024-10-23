public class Caixa {

    private Object coisa;

    //Neste caso não utilizamos o tipo genérico

    public void guardar(Object coisa){
        this.coisa = coisa;
    }

    public Object abrir(){
        return coisa;
    }

}
