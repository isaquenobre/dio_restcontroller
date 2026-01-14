package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

@Repository
public class UsuarioRepository {
  public void save(Usuario usuario) {
    if (usuario.getId() == null)
      System.out.println("SAVE - RECEBENDO O USUARIO NA CAMADA DE REPOSITORIO");
    else
      System.out.println("UPDATE - RECENDO O USUARIO NA CAMADA DE REPOSITORIO");

    System.out.println(usuario);
  }

  public void deleteByid(Integer id) {
    System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuario", id));
    System.out.println(id);
  }

  public List<Usuario> findAll() {
    System.out.println("LIST - LISTANDO OS USUARIOS DO SISTEMA");
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("gleydson", "password"));
    usuarios.add(new Usuario("frank", "masterpass"));
    return usuarios;
  }

  public Usuario findByid(Integer id) {
    System.out.println(String.format("FIND/id - recebendo um id: %d para localizar um usuario", id));
    return new Usuario("gleydson", "password");
  }

  public Usuario findByUsername(String username) {
    System.out.println(String.format("FIND/username - recebendo o usarnam: %s para localizar um usuario", username));

    return new Usuario("gleydson", "password");
  }

}
