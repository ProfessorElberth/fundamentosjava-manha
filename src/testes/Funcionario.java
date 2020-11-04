package testes;

import auxiliar.Constante;

public class Funcionario {
	String nome;
	int idade;
	float salario;
	float bonus;
	float desconto;

	Funcionario(){
		this.nome = "fantasma";
	}
	
	Funcionario(String nome, int idade){
		this();
		this.nome = nome;
		this.idade = idade;
	}

	Funcionario(String nome, int idade, float salario, float bonus, float desconto) {
		this(nome, idade);
		this.salario = salario;
		this.bonus = bonus;
		this.desconto = desconto;
	}

	private float calcularSalarioLiquido() {
		return this.salario + this.bonus - this.desconto;
	}
	
	private String obterSituacao(float salarioLiquido) {
		return salarioLiquido > Constante.SALARIO_LIMITE ? "rico" : "pobre";
	}
	
	void exibir() {
		System.out.println("Funcion�rio: " + this.toString());
	}
	
	@Override
	public String toString() {
		
		float salarioLiquido = calcularSalarioLiquido();
		
		String situacao = obterSituacao(salarioLiquido);

		return String.format("%s - %d - %.2f - %.2f - %.2f :: Sal�rio L�quido R$%.2f (%s)",
				nome, idade, salario, bonus, desconto,
				salarioLiquido,
				situacao
				);
	}
}