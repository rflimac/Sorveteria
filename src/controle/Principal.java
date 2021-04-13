package controle;

import java.util.ArrayList;
import java.util.List;

import dao.impl.ControleDAOImpl;
import entidade.Sorvete;

public class Principal {

	public static void main(String[] args) {
			
		ControleDAOImpl sistema = new ControleDAOImpl();
		
		Sorvete morango = new Sorvete();
		morango.setId(1);
		morango.setNome("morango");
		morango.setMarca("Kibom");
		morango.setPreco(275);
		morango.setQuantidade(10);
		morango.setTipo("Industrializado");
		morango.setFabricacao("25/02/2021");
		morango.setValidade("25/08/2021");
		
		Sorvete chocolate= new Sorvete();
		chocolate.setId(2);
		chocolate.setNome("chocolate");
		chocolate.setMarca(null);
		chocolate.setPreco(120);
		chocolate.setQuantidade(5);
		chocolate.setTipo("caseiro");
		chocolate.setFabricacao("31/03/2021");
		chocolate.setValidade("31/05/2021");
		
		sistema.adicionarSorvete(morango);
		sistema.adicionarSorvete(chocolate);
		
		System.out.println(sistema.listarSorvete());
		
		sistema.removerSorvete(morango);
		
		System.out.println(sistema.listarSorvete());

	}

}
