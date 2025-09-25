package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;

public class Pcd extends GrupoAfinidade{

    private String nome = "Pcd";

    public Pcd(TiposGruposAfinidade tipo) {
        super(tipo);
    }

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Pcd");
    }


}
