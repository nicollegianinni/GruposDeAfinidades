package grupos.afinidades.repository;

import grupos.afinidades.model.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository <Pessoa, Long> {
    @Override
    Page<Pessoa> findAll(Pageable pageable);
}
