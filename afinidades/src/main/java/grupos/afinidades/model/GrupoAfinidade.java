package grupos.afinidades.model;

import grupos.afinidades.model.enums.TiposGruposAfinidade;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

//@MappedSuperclass caso nao queira que crie essa classe abstrata como tabela no banco de dados, use essa anotação
//na qual as filhas que criaram as tabelas no banco de dados
@Entity
@Table(name = "Grupo_de_afinidades")
public abstract class GrupoAfinidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    //nome por enquanto esta sem uso, mas sera custoso tirar do codigo agora rsrs
    protected String nome;

    //relacionamento N:N (muitos para muitos)
    @ManyToMany(mappedBy = "grupos") // lado inverso
    private Set<Pessoa> pessoa = new HashSet<>();

    //add enum para calcular a porcentagem de cotas por cada tipo de grupo
    @Enumerated(EnumType.STRING)
    protected TiposGruposAfinidade tipo;

    public GrupoAfinidade(TiposGruposAfinidade tipo) {
        this.tipo = tipo;
    }

    public GrupoAfinidade() {
    }

    public abstract void preRequisitos();

    //criar um enum para demostrar PercentualPorGrupoAfinidade no enum para bboas praticas
//    public double percentualCota() {
//        if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.NEGROS)) {
//            cotas = cotas*0.30;
//            return cotas;
//        } else if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.ESTRANGEIROS)) {
//            cotas = cotas*0.05;
//            return cotas;
//        } else if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.MAE_SOLO)) {
//            cotas = cotas*0.10;
//            return cotas;
//        } else if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.MAIS_60)) {
//            cotas = cotas*0.10;
//            return cotas;
//        } else if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.PCD)) {
//            cotas = cotas*0.10;
//            return cotas;
//        } else if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.NEUROTIPICOS)) {
//            cotas = cotas*0.05;
//        } else if (percentualPorGrupoAfinidade.equals(TiposGruposAfinidade.BAIXA_RENDA)) {
//            cotas = cotas*0.15;
//            return cotas;
//        }return 0;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Pessoa> getPessoa() {
        return pessoa;
    }

    public void setPessoa(Set<Pessoa> pessoa) {
        this.pessoa = pessoa;
    }

    public TiposGruposAfinidade getTipo() {
        return tipo;
    }

    public void setTipo(TiposGruposAfinidade tipo) {
        this.tipo = tipo;
    }
}
