package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;
import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("MAIS_60")
public class Mais60 extends GrupoAfinidade{

    private String nome = "Mais60";

    public Mais60() {
        super();
        this.setNome("Mais60");
    }

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Mais60");
    }
}
