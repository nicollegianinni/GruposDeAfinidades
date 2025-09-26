package grupos.afinidades.repository;

import grupos.afinidades.model.GrupoAfinidade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrupoAfinidadeRepository extends JpaRepository<GrupoAfinidade, Long> {
    @Override
    Page<GrupoAfinidade> findAll(Pageable pageable);
}
