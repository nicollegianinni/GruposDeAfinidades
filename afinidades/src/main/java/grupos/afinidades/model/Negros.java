package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;

public class Negros extends GrupoAfinidade {
    private String nome = "Negros";

    public Negros(Pessoa pessoa, String nome, TiposGruposAfinidade percentualPorGrupoAfinidade) {
        super(pessoa, nome, percentualPorGrupoAfinidade);
    }

    public Negros(String nome) {
        this.nome = nome;
    }

    @Override
    public void preRequisitos() {
        System.out.println("pre requisitos do Grupo de Afinidade: Negros\n" +
                "Pessoas pardas(genetica mista) ou com descendencia afro ou indigenas");
    }

}
