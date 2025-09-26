package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;
import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("MAE_SOLO")
public class MaeSolo extends GrupoAfinidade{

    private String nome = "MaeSolo";

    public MaeSolo() {
        super();
        this.setNome("MaeSolo");
    }

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Mãe solo");
    }
}
