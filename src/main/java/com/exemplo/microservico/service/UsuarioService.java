package com.exemplo.microservico.service;

import com.exemplo.microservico.model.Usuario;
import com.exemplo.microservico.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public List<Usuario> listarTodos(){
        return repository.findAll();
    }

    public Optional<Usuario> buscarPeloEmail(String email){
        return repository.findByEmail(email);
    }

    public Optional<Usuario> buscarPeloId(Long id){
        return repository.findById(id);
    }

    public Usuario salvar(Usuario usuario){
        return repository.save(usuario);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
