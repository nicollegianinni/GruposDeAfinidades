package grupos.afinidades.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id//gerara um id no banco de dados, o cliente nao precisa passar
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;

    //relacionamento futuro : manyToMany
    //um grupo pode ter muitas pessoas e uma pessoas pode se indentificar com muitos grupos
    //@ManyToMany
    private GrupoAfinidade grupoAfinidade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
    }

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public GrupoAfinidade getGrupoAfinidade() {
        return grupoAfinidade;
    }

    public void setGrupoAfinidade(GrupoAfinidade grupoAfinidade) {
        this.grupoAfinidade = grupoAfinidade;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "nome='" + nome + '\'' +
                "idade=" + idade +
                "grupoAfinidade=" + grupoAfinidade +
                '}';
    }
}
