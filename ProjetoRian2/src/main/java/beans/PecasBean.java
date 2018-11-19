package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import entities.Peca;

@ManagedBean(name="pecasBean")
@ApplicationScoped

public class PecasBean {
	private List<Peca> pecas = new ArrayList<Peca>();
	private Peca peca = new Peca();
	private Peca pecaBuscada = new Peca();
	private static int cont = 0;
	private String nomePeca;
		

	public List<Peca> getPecas() {
		return pecas;
	}

	public void setPecas(List<Peca> pecas) {
		this.pecas = pecas;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	public Peca getPecaBuscada() {
		return pecaBuscada;
	}

	public void setPecaBuscada(Peca pecaBuscada) {
		this.pecaBuscada = pecaBuscada;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		PecasBean.cont = cont;
	}

	public String getNomePeca() {
		return nomePeca;
	}

	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
	}


}