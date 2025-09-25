package grupos.afinidades.service;

import grupos.afinidades.model.Pessoa;
import grupos.afinidades.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//contrato
@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;

    //cadastra nome da pessoa (juntamente com o grupo de afinidade)
    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa cadastrarPessoa(String nome, int idade) { //cadastrar animais
        Pessoa pessoa = new Pessoa(nome, idade);
        return pessoaRepository.save(pessoa);
    }

    //busca todas as pessoas por grupo de afinidades
    public List<Pessoa> ListaDePessoas (){
        return pessoaRepository.findAll();
    }

    //busca lista de pessoas com seus grupos de afinidades

}
