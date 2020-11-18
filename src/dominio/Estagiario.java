package dominio;

import negocio.Funcionario;

public class Estagiario extends Funcionario {

	private float desconto;
	private String instituicao;
	
	public Estagiario() {
		this.setNome("estag");
	}
	
	public Estagiario(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public float calcularSalarioLiquido() {
		return this.getSalario() - this.desconto;
	}

	@Override
	public void exibir() {
		System.out.println("Estagiário: " + this.toString());
	}
	
	@Override
	public String toString() {
		
		float salarioLiquido = calcularSalarioLiquido();
		
		String situacao = obterSituacao(salarioLiquido);

		return String.format("%s | %10.2f | %-10s :: Salário Líquido R$%10.2f (%s)",
				super.toString(), 
				this.desconto, 
				this.instituicao,
				salarioLiquido,
				situacao
				);
	}
	
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
}