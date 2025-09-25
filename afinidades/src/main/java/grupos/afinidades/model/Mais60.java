package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;

public class Mais60 extends GrupoAfinidade{

    private String nome = "Mais60";

    public Mais60(TiposGruposAfinidade tipo) {
        super(tipo);
    }

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Mais60");
    }
}
