package models.heranca;

import javax.persistence.*;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno {

    private Double valorBolsa;

    public AlunoBolsista() {}

    public AlunoBolsista(Long matricula, String nome, Double valorBolsa) {
        super(matricula, nome);
        this.valorBolsa = valorBolsa;
    }

    public Double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(Double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
}
