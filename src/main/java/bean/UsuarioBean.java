package bean;

import static util.MessageUtil.*;
import java.util.List;
import javax.faces.bean.ManagedBean;

import org.primefaces.event.RowEditEvent;

import dao.UsuarioDao;

import entidades.Usuario;

@ManagedBean
public class UsuarioBean {

	private Usuario usuario = new Usuario();
	private List<Usuario> lista;

	public String salvar() {
		try {
			UsuarioDao.salvar(usuario);
			sucesso("Sucesso", "Usuario cadastrado com sucesso");
			usuario = new Usuario();
		} catch (Exception e) {
			erro("Erro", "Erro ao cadastrar o Usuario");
		}
		return null;
	}

	public List<Usuario> getLista() {
		if (lista == null) {
			lista = UsuarioDao.listarTodos();
		}
		return lista;
	}

	public String excluir() {
		try {
			UsuarioDao.excluir(usuario);
			sucesso("Sucesso", "Usuário excluído com sucesso");
			lista = UsuarioDao.listarTodos();
			return null;
		} catch (Exception e) {
			erro("Erro", "Erro ao excluir o Usuário");
			return null;
		}

	}
	 public void editarUsuario(RowEditEvent event) {
		 try {
			 	Usuario usuario = (Usuario) event.getObject();
				UsuarioDao.editar(usuario);
				sucesso("Sucesso", "Usuário editado com sucesso");
			} catch (Exception e) {
				erro("Erro", "Erro ao editar o usuário");
				
			}

		}


	public void setLista(List<Usuario> lista) {
		this.lista = lista;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
