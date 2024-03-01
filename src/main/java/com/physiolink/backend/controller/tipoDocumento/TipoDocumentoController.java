package com.physiolink.backend.controller.tipoDocumento;

import com.physiolink.backend.model.prueba.Prueba;
import com.physiolink.backend.model.tipoDocumento.TipoDocumento;
import com.physiolink.backend.service.prueba.IPruebaService;
import com.physiolink.backend.service.tipoDocumento.ITipoDocumentoService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/TipoDocumento")
public class TipoDocumentoController {

    @Autowired
    private ITipoDocumentoService service;

    @GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<TipoDocumento>> get(HttpServletResponse response, @PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping(value="",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TipoDocumento>> getAll(HttpServletResponse response) {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping(value="",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> post(HttpServletResponse response, @RequestBody TipoDocumento tipoDocumento) {
        return ResponseEntity.ok(service.post(tipoDocumento));
    }

    @PutMapping(value="",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> actualizarFolio(HttpServletResponse response, @RequestBody TipoDocumento tipoDocumento) {

        return ResponseEntity.ok(service.put(tipoDocumento));

    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Boolean> eliminarPorId(HttpServletResponse response, @PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
