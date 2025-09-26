package grupos.afinidades.dto;

import grupos.afinidades.model.Pessoa;

import java.util.Set;
import java.util.stream.Collectors;

public class PessoaResponseDTO {
    private Long id;
    private String nome;
    private int idade;
    private Set<String> grupos; // aqui já vira lista dos grupos

    public PessoaResponseDTO(Pessoa pessoa) {
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
        this.idade = pessoa.getIdade();
        this.grupos = pessoa.getGrupos()
                .stream()
                .map(g -> g.getNome()) // pega só o nome do grupo
                .collect(Collectors.toSet());
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

    public Set<String> getGrupos() {
        return grupos;
    }

    public void setGrupos(Set<String> grupos) {
        this.grupos = grupos;
    }
}