package converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import dao.DAO;
import dao.UsuarioDAO;
import entities.Identificavel;
import entities.Usuario;

@FacesConverter(forClass=Usuario.class)
public class UsuarioConverter implements Converter {

	@Inject
	private UsuarioDAO usuarioDAO;
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		return usuarioDAO.getByID(Long.parseLong(id));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object entidade) {
		return ((Identificavel)entidade).getId().toString();
	}

	
	
}
