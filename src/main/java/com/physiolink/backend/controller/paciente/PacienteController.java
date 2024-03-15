package com.physiolink.backend.controller.paciente;

import com.physiolink.backend.model.paciente.Paciente;
import com.physiolink.backend.model.tipoDocumento.TipoDocumento;
import com.physiolink.backend.service.paciente.IPacienteService;
import com.physiolink.backend.service.tipoDocumento.ITipoDocumentoService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Paciente")
public class PacienteController {

    @Autowired
    private IPacienteService service;

    @GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Paciente>> get(HttpServletResponse response, @PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping(value="",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Paciente>> getAll(HttpServletResponse response) {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping(value="",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> post(HttpServletResponse response, @RequestBody Paciente paciente) {
        return ResponseEntity.ok(service.post(paciente));
    }

    @PutMapping(value="",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> actualizarFolio(HttpServletResponse response, @RequestBody Paciente paciente) {

        return ResponseEntity.ok(service.put(paciente));

    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Boolean> eliminarPorId(HttpServletResponse response, @PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
