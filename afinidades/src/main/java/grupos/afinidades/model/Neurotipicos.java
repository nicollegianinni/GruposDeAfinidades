package grupos.afinidades.model;

public class Neurotipicos extends GrupoAfinidade{

    private String nome = "Neurotipicos";

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Neurotipicos");
    }
}
