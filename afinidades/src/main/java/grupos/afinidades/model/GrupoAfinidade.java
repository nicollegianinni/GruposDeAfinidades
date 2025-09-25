package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;
import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;

public abstract class GrupoAfinidade {

    protected String nome;
    //cota so faz parte da classe abstrata, nao faz parte das filhas
    protected double cotas;

    //relacionamento N:N (muitos para muitos)
    @ManyToMany(mappedBy = "grupos") // lado inverso
    private Set<Pessoa> pessoa = new HashSet<>();

    //add enum para calcular a porcentagem de cotas
    protected TiposGruposAfinidade percentualPorGrupoAfinidade;

    public GrupoAfinidade(Pessoa pessoa, String nome, TiposGruposAfinidade percentualPorGrupoAfinidade) {
        this.pessoa = (Set<Pessoa>) pessoa;
        this.nome = nome;
        this.percentualPorGrupoAfinidade = percentualPorGrupoAfinidade;
    }

    public GrupoAfinidade() {
    }

    public abstract void preRequisitos();

    //criar um enum para demostrar PercentualPorGrupoAfinidade
    public double percentualCota() {
        if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.NEGROS)) {
            cotas = cotas*0.30;
            return cotas;
        } else if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.ESTRANGEIROS)) {
            cotas = cotas*0.05;
            return cotas;
        } else if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.MAE_SOLO)) {
            cotas = cotas*0.10;
            return cotas;
        } else if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.MAIS_60)) {
            cotas = cotas*0.10;
            return cotas;
        } else if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.PCD)) {
            cotas = cotas*0.10;
            return cotas;
        } else if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.NEUROTIPICOS)) {
            cotas = cotas*0.05;
        } else if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.BAIXA_RENDA)) {
            cotas = cotas*0.15;
            return cotas;
        }return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCotas() {
        return cotas;
    }

    public void setCotas(double cotas) {
        this.cotas = cotas;
    }

    public Set<Pessoa> getPessoa() {
        return pessoa;
    }

    public void setPessoa(Set<Pessoa> pessoa) {
        this.pessoa = pessoa;
    }

    public TiposGruposAfinidade getPercentualPorGrupoAfinidade() {
        return percentualPorGrupoAfinidade;
    }

    public void setPercentualPorGrupoAfinidade(TiposGruposAfinidade percentualPorGrupoAfinidade) {
        this.percentualPorGrupoAfinidade = percentualPorGrupoAfinidade;
    }
}
