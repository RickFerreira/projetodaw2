package converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import beans.ComputadorBean;
import entities.Peca;

@FacesConverter(value="ConversorPeca")
public class PecaConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		if (value != null && value.trim().length() > 0) {
			try {
				ComputadorBean service = (ComputadorBean) fc.getExternalContext().getApplicationMap().get("computadorService");
				return service.getPecas().get(Integer.parseInt(value)-1);
			} catch (NumberFormatException e) {
				throw new ConverterException();
						
			}
		} else {
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object object) {
		if(object != null) {
			return String.valueOf(((Peca) object).getId());
		}
		return null;
	}

}
