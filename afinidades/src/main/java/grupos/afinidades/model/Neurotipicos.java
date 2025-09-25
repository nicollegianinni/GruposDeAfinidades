package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;

public class Neurotipicos extends GrupoAfinidade{

    private String nome = "Neurotipicos";

    public Neurotipicos(Pessoa pessoa, String nome, TiposGruposAfinidade percentualPorGrupoAfinidade) {
        super(pessoa, nome, percentualPorGrupoAfinidade);
    }
    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Neurotipicos");
    }
}
