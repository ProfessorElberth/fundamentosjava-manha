package dominio;

import auxiliar.Constante;

public class Funcionario {
	public String nome;
	public int idade;
	public float salario;
	public float bonus;
	public float desconto;

	public Funcionario(){
		this.nome = "fantasma";
	}
	
	public Funcionario(String nome, int idade){
		this();
		this.nome = nome;
		this.idade = idade;
	}

	public Funcionario(String nome, int idade, float salario, float bonus, float desconto) {
		this(nome, idade);
		this.salario = salario;
		this.bonus = bonus;
		this.desconto = desconto;
	}

	private float calcularSalarioLiquido() {
		return this.salario + this.bonus - this.desconto;
	}
	
	private String obterSituacao(float salarioLiquido) {
		return salarioLiquido > Constante.SALARIO_LIMITE_POBRE ? "rico" : "pobre";
	}
	
	public void exibir() {
		System.out.println("Funcion�rio: " + this.toString());
	}
	
	@Override
	public String toString() {
		
		float salarioLiquido = calcularSalarioLiquido();
		
		String situacao = obterSituacao(salarioLiquido);

		return String.format("%s - %d - %.2f - %.2f - %.2f :: Sal�rio L�quido R$%.2f (%s)",
				this.nome, this.idade, this.salario, this.bonus, this.desconto,
				salarioLiquido,
				situacao
				);
	}
}