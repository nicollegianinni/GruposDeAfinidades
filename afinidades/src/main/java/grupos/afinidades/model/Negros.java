package grupos.afinidades.model;

public class Negros extends GrupoAfinidade {

    private String nome = "Negros";

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Negros");
    }
}
