package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;
import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("NEUROTIPICOS")
public class Neurotipicos extends GrupoAfinidade{

    private String nome = "Neurotipicos";

    public Neurotipicos() {
        super();
        this.setNome("Neurotipicos");
    }
    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Neurotipicos");
    }
}
