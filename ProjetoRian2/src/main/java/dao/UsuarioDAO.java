package dao;

import java.util.List;

import filtros.UsuarioFiltro;
import entities.Usuario;

public class UsuarioDAO extends DAO<Usuario> {
	
	public UsuarioDAO() {
		super(Usuario.class);
	}

	public List<Usuario> findBy(UsuarioFiltro filtro) {
		return null;
	}
	
}