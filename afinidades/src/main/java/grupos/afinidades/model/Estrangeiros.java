package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;

public class Estrangeiros extends GrupoAfinidade{

    private String nome = "Estrangeiros";

    public Estrangeiros(String nome, TiposGruposAfinidade percentualPorGrupoAfinidade) {
        super(nome, percentualPorGrupoAfinidade);

    }
    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Estrangeiros");
    }
}
