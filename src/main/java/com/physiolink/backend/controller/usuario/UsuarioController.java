package com.physiolink.backend.controller.usuario;

import com.physiolink.backend.model.usuario.Usuario;
import com.physiolink.backend.service.usuario.IUsuarioService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService service;

    @GetMapping(value="/{id}",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<Usuario>> get(HttpServletResponse response, @PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping(value="",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Usuario>> getAll(HttpServletResponse response) {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping(value="",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> post(HttpServletResponse response, @RequestBody Usuario usuario) {
        return ResponseEntity.ok(service.post(usuario));
    }

    @PutMapping(value="",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> actualizarFolio(HttpServletResponse response, @RequestBody Usuario usuario) {

        return ResponseEntity.ok(service.put(usuario));

    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Boolean> eliminarPorId(HttpServletResponse response, @PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
