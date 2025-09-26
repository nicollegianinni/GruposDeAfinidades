package grupos.afinidades.model;


import jakarta.persistence.DiscriminatorValue;

@DiscriminatorValue("PCD")
public class Pcd extends GrupoAfinidade{

    private String nome = "Pcd";

    public Pcd() {
        super();
        this.setNome("Pcd");
    }

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Pcd");
    }


}
