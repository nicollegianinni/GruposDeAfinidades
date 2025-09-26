package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;
import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("NEGROS")
public class Negros extends GrupoAfinidade {
    private String nome = "Negros";

    public Negros() {
        super();
        this.setNome("Negros");
    }

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Negros\n" +
                "Pessoas pardas(genetica mista) ou com descendencia afro ou indigenas");
    }
}
