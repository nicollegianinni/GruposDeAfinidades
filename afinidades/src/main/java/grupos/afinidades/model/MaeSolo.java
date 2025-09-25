package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;

public class MaeSolo extends GrupoAfinidade{

    private String nome = "MaeSolo";

    public MaeSolo(TiposGruposAfinidade tipo) {
        super(tipo);
    }
    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Mãe solo");
    }
}
