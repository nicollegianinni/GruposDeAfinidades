package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;

public class MaeSolo extends GrupoAfinidade{

    private String nome = "MaeSolo";

    public MaeSolo(Pessoa pessoa, String nome, TiposGruposAfinidade percentualPorGrupoAfinidade) {
        super(pessoa, nome, percentualPorGrupoAfinidade);
    }
    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Mãe solo");
    }
}
