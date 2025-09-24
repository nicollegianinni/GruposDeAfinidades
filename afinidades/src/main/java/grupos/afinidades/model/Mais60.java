package grupos.afinidades.model;

public class Mais60 extends GrupoAfinidade{

    private String nome = "Mais60";

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Mais60");
    }
}
