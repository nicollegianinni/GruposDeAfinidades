package grupos.afinidades.service;

import grupos.afinidades.dto.PessoaDTO;
import grupos.afinidades.model.GrupoAfinidade;
import grupos.afinidades.model.Pessoa;
import grupos.afinidades.repository.GrupoAfinidadeRepository;
import grupos.afinidades.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa cadastrarPessoa(PessoaDTO dto) {
        Pessoa pessoa = new Pessoa(dto.getNome(), dto.getIdade());

        if (dto.getGruposIds() != null && !dto.getGruposIds().isEmpty()) {
            Set<GrupoAfinidade> grupos = new HashSet<>(grupoAfinidadeRepository.findAllById(dto.getGruposIds()));
            pessoa.setGrupos(grupos);

            System.out.println("Grupos encontrados: " + grupos.size());
        }

        return pessoaRepository.save(pessoa);
    }


    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }

    //page nativo do spring nao do hibernete para paginação
    public Page<Pessoa> buscarTodas(int page, int size, String sortBy, String direction) {
        Sort sort = direction.equalsIgnoreCase("desc") ?
                Sort.by(sortBy).descending() :
                Sort.by(sortBy).ascending();

        Pageable pageable = PageRequest.of(page, size, sort);
        return pessoaRepository.findAll(pageable);
    }

}

//busca lista de pessoas com seus grupos de afinidades
