package grupos.afinidades.dto;

import grupos.afinidades.model.Pessoa;

import java.util.Set;

public class PessoaDTO {
    private String nome;
    private int idade;
    private Set<Long> gruposIds;

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

    public Set<Long> getGruposIds() {
        return gruposIds;
    }

    public void setGruposIds(Set<Long> gruposIds) {
        this.gruposIds = gruposIds;
    }
}
