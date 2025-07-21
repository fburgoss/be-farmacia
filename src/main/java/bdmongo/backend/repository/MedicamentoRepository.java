package bdmongo.backend.repository;

import bdmongo.backend.model.Medicamento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicamentoRepository extends MongoRepository<Medicamento, String> {
}