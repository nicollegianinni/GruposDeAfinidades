package grupos.afinidades.model;

public class MaeSolo extends GrupoAfinidade{

    private String nome = "MaeSolo";

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Mãe solo");
    }
}
