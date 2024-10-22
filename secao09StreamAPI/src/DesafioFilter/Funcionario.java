package DesafioFilter;

public class Funcionario {

    private String nome;
    private int faltas;
    private int diasExtra;

    public Funcionario(String nome) {
        setNome(nome);
    }

    public int getDiasExtra() {
        return diasExtra;
    }

    public void setDiasExtra(int diasExtra) {
        this.diasExtra = diasExtra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    void faltar(){
        this.faltas++;
    }

    void diaExtra(){
        this.diasExtra++;
    }

    public String toString(){
        return "Meu nome é " + getNome() + " e tenho " + getFaltas() + " falta(s). Dias extras: " + getDiasExtra();
    }
}
