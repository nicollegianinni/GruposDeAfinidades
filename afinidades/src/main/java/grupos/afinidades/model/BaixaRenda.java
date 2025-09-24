package grupos.afinidades.model;

public class BaixaRenda extends GrupoAfinidade{

    private String nome = "BaixaRenda";

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: BaixaRenda");
    }
}
