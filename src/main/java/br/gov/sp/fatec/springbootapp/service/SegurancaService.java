package br.gov.sp.fatec.springbootapp.service;

import java.util.*;

import br.gov.sp.fatec.springbootapp.entity.Usuario;

public interface SegurancaService {

    public Usuario criarUsuario(String nome, String senha, String avatar, String autorizacao);

    public List<Usuario> buscarTodosUsuarios();

    public Usuario buscarUsuarioPorId(Long id);

    public Usuario buscarUsuarioPorNome(String nome);
    
}