package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;

public class BaixaRenda extends GrupoAfinidade{

    private String nome = "BaixaRenda";
    public BaixaRenda(String nome, TiposGruposAfinidade percentualPorGrupoAfinidade) {
        super(nome, percentualPorGrupoAfinidade);

    }

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: BaixaRenda");
    }
}
