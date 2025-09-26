package grupos.afinidades.controller;

import grupos.afinidades.dto.PessoaDTO;
import grupos.afinidades.dto.PessoaResponseDTO;
import grupos.afinidades.model.Pessoa;
import grupos.afinidades.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;
    @GetMapping("/buscartodas")
    public ResponseEntity<Page<Pessoa>> getAll (@RequestParam (defaultValue = "0") int page,
                                                @RequestParam (defaultValue = "5") int size,
                                                @RequestParam (defaultValue = "idade") String sortBy,
                                                @RequestParam (defaultValue = "asc") String direction) {
        return ResponseEntity.ok(pessoaService.buscarTodas(page, size, sortBy, direction));

    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Pessoa> cadastrarPessoa(@RequestBody PessoaDTO pessoaDTO) {
        Pessoa pessoa = pessoaService.cadastrarPessoa(pessoaDTO);
        return ResponseEntity.ok(pessoa);
    }

    @GetMapping("/listarpessoas")
    public ResponseEntity<List<PessoaResponseDTO>> getAll() {
        List<PessoaResponseDTO> pessoas = pessoaService.listarPessoas()
                .stream()
                .map(PessoaResponseDTO::new)
                .toList();
        return ResponseEntity.ok(pessoas);
    }

}
