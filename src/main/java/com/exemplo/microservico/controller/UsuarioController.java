package com.exemplo.microservico.controller;

import com.exemplo.microservico.model.Usuario;
import com.exemplo.microservico.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @GetMapping
    public List<Usuario> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/email/{email}")
    public Optional<Usuario> buscarPorEmail(@PathVariable String email){
        return service.buscarPeloEmail(email);
    }

    @GetMapping("/id/{id}")
    public Optional<Usuario> buscarPorId(@PathVariable Long id){
        return service.buscarPeloId(id);
    }

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario){
        return service.salvar(usuario);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id){
        service.deletar(id);
    }

}
