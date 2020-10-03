package br.gov.sp.fatec.springbootapp.controller;

import java.util.List;
import br.gov.sp.fatec.springbootapp.entity.Usuario;
import br.gov.sp.fatec.springbootapp.service.SegurancaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {
    
    @Autowired
    private SegurancaService segurancaService;

    @GetMapping
    public List<Usuario> buscarTodos(){
        return segurancaService.buscarTodosUsuarios();
    }

    @GetMapping(value = "/{id}")
    public Usuario buscarPorId(@PathVariable("id") Long id){
        return segurancaService.buscarUsuarioPorId(id);
    }

    @GetMapping(value = "/nome")
    public Usuario buscarPorNome(@RequestParam(value="nome") String nome){
        return segurancaService.buscarUsuarioPorNome(nome);
    }

    @PostMapping
    public Usuario cadastraNovoUsuario(@RequestBody Usuario usuario){
        return segurancaService.criarUsuario(usuario.getNome(), usuario.getSenha(), "base64 image", "ROLE_USUARIO");
    }
}