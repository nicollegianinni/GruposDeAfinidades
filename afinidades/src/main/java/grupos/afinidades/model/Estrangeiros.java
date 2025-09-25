package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;

public class Estrangeiros extends GrupoAfinidade{

    private String nome = "Estrangeiros";

    public Estrangeiros(TiposGruposAfinidade tipo) {
        super(tipo);
    }

    public Estrangeiros(String nome) {
        this.nome = nome;
    }

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Estrangeiros");
    }
}
