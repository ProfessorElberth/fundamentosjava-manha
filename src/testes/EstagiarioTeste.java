package testes;

import auxiliar.Constante;
import dominio.Estagiario;

public class EstagiarioTeste {

	private static Estagiario[] estagiarios;
	
	public static void main(String[] args) {
		
		estagiarios = new Estagiario[Constante.QTDE_ESTAGIOS];
		
		int qtde = 0;
		float somaSalarial = 0;
		float maiorSalario = 0;
		String nomeMaiorSalario = null;
		
		while(somaSalarial <= 5000) {
			
			String nome = "elberth";
			
			Estagiario est = new Estagiario(nome, 42);
			est.setSalario(1000);
			est.setDesconto(100);
			est.setInstituicao("infnet");
			est.exibir();
			
			float salarioLiquido = est.calcularSalarioLiquido();
			
			if(salarioLiquido >= maiorSalario) {
				maiorSalario = salarioLiquido;
				nomeMaiorSalario = nome;
			}
			
			somaSalarial = somaSalarial + salarioLiquido;

			estagiarios[qtde] = est;
			
			qtde++;
		}

		System.out.println("Cadastramento realizado com sucesso!!!");
		System.out.println("Estagiários:");
		System.out.println("QTDE = " + qtde);
		System.out.println("TOTAL SALARIAL = " + somaSalarial);
		System.out.println("ESTAGIÁRIO MAIOR SALÁRIO = " + nomeMaiorSalario);
		System.out.println("VALOR MAIOR SALÁRIO = " + maiorSalario);
	}
}