package adopet.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import adopet.api.model.Adocao;
import adopet.api.model.StatusAdocao;

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {

    Boolean existsByPetIdAndStatus(Long idPet, StatusAdocao aguardandoAvaliacao);

    Integer countByTutorIdAndStatus(Long idTutor, StatusAdocao aprovado);

}
