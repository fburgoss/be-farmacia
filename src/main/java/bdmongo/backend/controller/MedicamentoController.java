package bdmongo.backend.controller;

import bdmongo.backend.model.Medicamento;
import bdmongo.backend.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    @GetMapping
    public List<Medicamento> obtenerTodos() {
        return medicamentoRepository.findAll();
    }

    @PostMapping
    public Medicamento crearMedicamento(@RequestBody Medicamento medicamento) {
        return medicamentoRepository.save(medicamento);
    }

    @DeleteMapping("/{id}")
    public void eliminarMedicamento(@PathVariable String id) {
        medicamentoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Medicamento actualizarMedicamento(@PathVariable String id, @RequestBody Medicamento medicamento) {
        medicamento.setId(id);
        return medicamentoRepository.save(medicamento);
    }
}
