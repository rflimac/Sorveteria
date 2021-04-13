package dao.impl;

import java.util.ArrayList;

import dao.SorveteDAO;
import entidade.Sorvete;

public class ControleDAOImpl implements SorveteDAO {

	private ArrayList<Sorvete> sorvete = new ArrayList<Sorvete>();

	//@Override
	//public void adicionarSorvete(Sorvete sorvete) {
		//this.sorvete.add(sorvete);

	//}
	//@Override
	//public void removeSorvete(Sorvete sorvete) {
		//this.sorvete.remove(sorvete);
	//}

	public String listarSorvete() {
		String lista = "";

		for (int i = 0; i < this.sorvete.size(); i++) {
			Sorvete sorvete = this.sorvete.get(i);
			lista += "\n Nome: " + sorvete.getNome() + " Validade: " + sorvete.getValidade();
		}
		return lista;
	}

	@Override
	public void adicionarSorvete(Sorvete sorvete) {		
		this.sorvete.add(sorvete);
	}

	@Override
	public void removerSorvete(Sorvete sorvete) {		
		this.sorvete.remove(sorvete);
	}

	
}