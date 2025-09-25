package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;

public abstract class GrupoAfinidade {

    protected String nome;
    //cota so faz parte da classe abstrata, nao faz parte das filhas
    protected double cotas;
    private Pessoa pessoa;
    //add enum para calcular a porcentagem de cotas
    protected TiposGruposAfinidade percentualPorGrupoAfinidade;

    public GrupoAfinidade(Pessoa pessoa, String nome, double cotas, TiposGruposAfinidade percentualPorGrupoAfinidade) {
        this.pessoa = pessoa;
        this.nome = nome;
        this.cotas = cotas;
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

}
