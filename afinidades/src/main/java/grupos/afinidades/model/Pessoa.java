package grupos.afinidades.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

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

    @JsonIgnoreProperties("pessoa")

    @ManyToMany
    @JoinTable(
            name = "pessoa_grupo",
            joinColumns = @JoinColumn(name = "pessoa_id"),
            inverseJoinColumns = @JoinColumn(name = "grupo_id")
    )
    private Set<GrupoAfinidade> grupos = new HashSet<>();

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

    public Set<GrupoAfinidade> getGrupos() {
        return grupos;
    }
    public void setGrupos(Set<GrupoAfinidade> grupos) {
        this.grupos = grupos;
    }

}
