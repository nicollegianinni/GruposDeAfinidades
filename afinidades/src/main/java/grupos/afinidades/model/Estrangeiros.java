package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;
import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("ESTRANGEIROS")
public class Estrangeiros extends GrupoAfinidade{

    private String nome = "Estrangeiros";

    public Estrangeiros() {
        super();
        this.setNome("Estrangeiros");
    }

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Estrangeiros");
    }
}
