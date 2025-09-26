package grupos.afinidades.controller;

import grupos.afinidades.model.GrupoAfinidade;
import grupos.afinidades.repository.GrupoAfinidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class GruposController {

    @Autowired
    private GrupoAfinidadeRepository grupoAfinidadeRepository;

    @GetMapping
    public List<GrupoAfinidade> listarGrupos() {
        return grupoAfinidadeRepository.findAll();
    }
}
