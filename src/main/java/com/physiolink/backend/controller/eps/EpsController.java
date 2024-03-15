package com.physiolink.backend.controller.eps;

import com.physiolink.backend.model.eps.Eps;
import com.physiolink.backend.model.paciente.Paciente;
import com.physiolink.backend.service.eps.IEpsService;
import com.physiolink.backend.service.paciente.IPacienteService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Eps")
public class EpsController {
    @Autowired
    private IEpsService service;

    @GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Eps>> get(HttpServletResponse response, @PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping(value="",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Eps>> getAll(HttpServletResponse response) {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping(value="",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> post(HttpServletResponse response, @RequestBody Eps eps) {
        return ResponseEntity.ok(service.post(eps));
    }

    @PutMapping(value="",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> actualizarFolio(HttpServletResponse response, @RequestBody Eps eps) {

        return ResponseEntity.ok(service.put(eps));

    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Boolean> eliminarPorId(HttpServletResponse response, @PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
