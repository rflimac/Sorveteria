package dao;

import entidade.Sorvete;

public interface SorveteDAO {

	public String listarSorvete();
	void adicionarSorvete(Sorvete sorvete);
	void removerSorvete(Sorvete sorvete);
	
}
