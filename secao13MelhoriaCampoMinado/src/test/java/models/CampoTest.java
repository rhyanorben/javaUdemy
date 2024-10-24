package models;

import exceptions.ExplosaoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CampoTest {

    private Campo campo;

    @BeforeEach
    void iniciarCampo() {
        campo = new Campo(3, 3);
    }

    @Test
    void testeVizinhoRealEsquerda() {
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assert resultado == true;
    }

    @Test
    void testeVizinhoRealDireita() {
        Campo vizinho = new Campo(3, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assert resultado == true;
    }

    @Test
    void testeVizinhoRealCima() {
        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assert resultado == true;
    }

    @Test
    void testeVizinhoRealBaixo() {
        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assert resultado == true;
    }

    @Test
    void testeVizinhoDiagonalCimaDireita() {
        Campo vizinho = new Campo(2, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assert resultado == true;
    }

    @Test
    void testeVizinhoRealDiagonalBaixoDireita() {
        Campo vizinho = new Campo(4, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assert resultado == true;
    }

    @Test
    void testeVizinhoRealDiagonalBaixoEsquerda() {
        Campo vizinho = new Campo(4, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assert resultado == true;
    }

    @Test
    void testeVizinhoRealDiagonalCimaEsquerda() {
        Campo vizinho = new Campo(2, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assert resultado == true;
    }

    @Test
    void testeCampoInvalido(){
        Campo vizinho = new Campo(6, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assert resultado == false;
    }

    @Test
    void testeMarcacaoPadrao(){
        assert campo.isMarcado() == false;
    }

    @Test
    void testeAlternarMarcacao(){
        campo.alternarMarcacao();
        assert campo.isMarcado() == true;
    }

    @Test
    void testeAlternarMarcacaoDuasChamadas(){
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        assert campo.isMarcado() == false;
    }

    @Test
    void abrirCampoNaoMinadoNaoMarcado(){
        assert campo.abrirCampo() == true;
    }

    @Test
    void abrirCampoNaoMinadoMarcado(){
        campo.alternarMarcacao();
        assert campo.abrirCampo() == false;
    }

    @Test
    void abrirCampoMinadoNaoMarcado(){
        campo.minar();
        assertThrows(ExplosaoException.class, () -> campo.abrirCampo());
    }

    @Test
    void testeAbrirComVizinhos(){

        Campo vizinho1 = new Campo(2, 2); // Cria um vizinho do campo de origem
        Campo vizinhoDoVizinho1 = new Campo(1, 1); // Cria um vizinho do vizinho

        vizinho1.adicionarVizinho(vizinhoDoVizinho1); //Adiciona o vizinho manualmente, na classe Campo faz recursivamente.

        campo.adicionarVizinho(vizinho1); //Adiciona o vizinho manualmente, na classe Campo faz recursivamente.

        campo.abrirCampo(); //Abre o campo de origme

        assertTrue(vizinho1.isAberto() && vizinhoDoVizinho1.isAberto()); //Verifica se os dois vizinhos abriram também

    }

    @Test
    void testeAbrirComVizinhos2(){

        Campo vizinho1 = new Campo(2, 2); // Cria um vizinho do campo de origem
        Campo vizinhoDoVizinho1 = new Campo(1, 1); // Cria um vizinho do vizinho
        Campo vizinhoDoVizinho2 = new Campo(0, 0);

        vizinhoDoVizinho2.minar();

        vizinho1.adicionarVizinho(vizinhoDoVizinho1); //Adiciona o vizinho manualmente, na classe Campo faz recursivamente.
        vizinhoDoVizinho1.adicionarVizinho(vizinhoDoVizinho2); //Adiciona o vizinho manualmente, na classe Campo faz recursivamente.

        campo.adicionarVizinho(vizinho1); //Adiciona o vizinho manualmente, na classe Campo faz recursivamente.

        campo.abrirCampo(); //Abre o campo de origme

        assertTrue(vizinho1.isAberto() && vizinhoDoVizinho2.isFechado()); //Verifica se os dois vizinhos abriram também
    }

    @Test
    void visualMarcado(){
        Campo campo1 = new Campo(2, 2);
        campo1.alternarMarcacao();
        assertEquals("x", campo1.toString());
    }

    @Test
    void visualAberto(){
        Campo campo1 = new Campo(2, 2);
        campo1.abrirCampo();
        assertEquals(" ", campo1.toString());
    }

    @Test
    void visualMinasVizinhanca(){
        Campo campo1 = new Campo(2, 2);
        Campo campo2 = new Campo(2, 3);
        Campo campo3 = new Campo(2, 1);

        campo1.adicionarVizinho(campo3);
        campo1.adicionarVizinho(campo2);

        campo2.minar();
        campo3.minar();

        campo1.abrirCampo();
        assertEquals("2", campo1.toString());
    }

    @Test
    void visualFechado(){
        Campo campo1 = new Campo(2, 2);
        assertEquals("?", campo1.toString());
    }

    @Test
    void testeMinasVizinhaca(){
        Campo campo1 = new Campo(2, 2);
        Campo campo2 = new Campo(1, 1);
        Campo campo3 = new Campo(2, 1);
        campo1.adicionarVizinho(campo2);
        campo1.adicionarVizinho(campo3);
        campo2.minar();
        campo3.minar();

        assertEquals(2, campo1.minasNaVizinhaca());
    }

}
