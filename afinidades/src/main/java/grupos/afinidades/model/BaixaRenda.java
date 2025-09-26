package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;
import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("BAIXA_RENDA")
public class BaixaRenda extends GrupoAfinidade{

    private String nome = "BaixaRenda";

    public BaixaRenda() {
        super();
        this.setNome("BaixaRenda");
    }

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: BaixaRenda");
    }
}
