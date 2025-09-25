package grupos.afinidades.service;

import grupos.afinidades.dto.PessoaDTO;
import grupos.afinidades.model.GrupoAfinidade;
import grupos.afinidades.model.Pessoa;
import grupos.afinidades.repository.GrupoAfinidadeRepository;
import grupos.afinidades.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//contrato
@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private GrupoAfinidadeRepository grupoAfinidadeRepository;

    //cadastra nome da pessoa (juntamente com o grupo de afinidade)
    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa cadastrarPessoa(PessoaDTO dto) {
        Pessoa pessoa = new Pessoa(dto.getNome(), dto.getIdade());

        if (dto.getGruposIds() != null) {
            Set<GrupoAfinidade> grupos = new HashSet<>(grupoAfinidadeRepository.findAllById(dto.getGruposIds()));
            pessoa.setGrupos(grupos);
        }
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }








    //busca lista de pessoas com seus grupos de afinidades

}
