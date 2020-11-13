package testes;

import dominio.Administrativo;

public class AdministrativoTeste {

	public static void main(String[] args) {
		
		Administrativo adm1 = new Administrativo();
//		adm1.setIdade(42);
//		adm1.setSalario(1000);
		adm1.setBonus(500);
		adm1.setDesconto(200);
		adm1.exibir();

		new Administrativo("lucas", 22, 10000, 5000, 2000).exibir();

		Administrativo adm3 = new Administrativo("carla", 21);
		adm3.setSalario(20000);
		adm3.setBonus(6000);
		adm3.setDesconto(3000);
		adm3.exibir();
	}
}