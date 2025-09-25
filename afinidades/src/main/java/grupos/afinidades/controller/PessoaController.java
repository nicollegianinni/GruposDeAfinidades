package grupos.afinidades.controller;

import grupos.afinidades.model.Pessoa;
import grupos.afinidades.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/cadastrar")
    public Pessoa cadastrarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.cadastrarPessoa(pessoa.getNome(),pessoa.getIdade());
    }

    @GetMapping("/Listadepessoas")
    public ResponseEntity<List<Pessoa>> getAll() {
        return ResponseEntity.ok(pessoaService.ListaDePessoas());
    }

}
