package bdmongo.backend.repository;

import bdmongo.backend.model.Medicamento;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MedicamentoRepository extends MongoRepository<Medicamento, String> {
    List<Medicamento> findByDestacadoTrue();
}

