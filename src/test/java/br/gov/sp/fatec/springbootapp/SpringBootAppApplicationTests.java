package br.gov.sp.fatec.springbootapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.annotation.Rollback;
import br.gov.sp.fatec.springbootapp.entity.Usuario;
import br.gov.sp.fatec.springbootapp.repository.UsuarioRepository;

@SpringBootTest
//sem nenhuma gravacao usamos transactional e rollback
@Transactional
@Rollback

class SpringBootAppApplicationTests {
    
    @Autowired
    private UsuarioRepository usuarioRepo;
    
    @Test
	void contextLoads() {
    }
    @Test
    void testaInsercao(){
        Usuario usuario = new  Usuario();
        usuario.setNome("Rafaelo");
        usuario.setSenha("12345");
        usuarioRepo.save(usuario);
        assertNotNull(usuario.getId());
    }

    @Test
    void testaAutorizacao(){
        Usuario usuario = usuarioRepo.findById(1L).get();
        assertEquals("ROLE_ADMIN", usuario.getAutorizacoes().iterator().next().getNome());
    }
    
}