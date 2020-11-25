package testes;

import auxiliar.Constante;
import dominio.Estagiario;

public class EstagiarioTeste {
 
	private static Estagiario[] estagiarios; // obj1, obj2, null, null, null

	private static String obterNivel(float salarioLiquido){
		
		if(salarioLiquido <= 1000) {
			return "A";
			
		}else if (salarioLiquido <= 2000) {
			return "B";
			
		}else if (salarioLiquido <= 3000) {
			return "C";
		}

		return "D";
	}
	
	private static void imprimir(){

		for(Estagiario estagio : estagiarios) {

			if(estagio != null) {

				float salarioLiquido = estagio.calcularSalarioLiquido();

				System.out.printf("%-10s | %10.2f | %s \n", 
						estagio.getNome(),
						salarioLiquido,
						obterNivel(salarioLiquido)
					);
			}
		}
	}
	
	public static void main(String[] args) {
		
		estagiarios = new Estagiario[Constante.QTDE_ESTAGIOS];
		
		int qtde = 0;
		float somaSalarial = 0;
		float maiorSalario = 0;
		String nomeMaiorSalario = null;
		
		while(somaSalarial <= 5000) {
			
			String nome = "elberth";
			
			Estagiario est = new Estagiario(nome, 42);
			est.setSalario(4000);
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
		System.out.println("Estagi�rios:");
		System.out.println("QTDE = " + qtde);
		System.out.println("TOTAL SALARIAL = " + somaSalarial);
		System.out.println("ESTAGI�RIO MAIOR SAL�RIO = " + nomeMaiorSalario);
		System.out.println("VALOR MAIOR SAL�RIO = " + maiorSalario);
		
		imprimir();
	}
}