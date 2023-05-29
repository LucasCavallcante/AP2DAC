package bean;

import static util.MessageUtil.*;
import java.util.List;
import javax.faces.bean.ManagedBean;
import dao.UsuarioDao;

import entidades.Usuario;

@ManagedBean
public class LoginBean {
    
 private Usuario usuario;
    
    public LoginBean() {
        usuario = new Usuario();
    }
        
    public String autenticar() {
        UsuarioDao usuarioDao = new UsuarioDao();
        if (usuarioDao.autenticarLogin(usuario)) {
            return "listagem_incidente.xhtml?faces-redirect=true";
        } else {
            erro("Erro", "Usuário/Senha inválidos");
            return null;
        }
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}