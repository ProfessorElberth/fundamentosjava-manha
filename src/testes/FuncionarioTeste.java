package testes;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		func1.idade = 42;
		func1.salario = 1000;
		func1.bonus = 500;
		func1.desconto = 200;
		func1.exibir();

		new Funcionario("lucas", 22, 10000, 5000, 2000).exibir();

		Funcionario func3 = new Funcionario("carla", 21);
		func3.salario = 20000;
		func3.bonus = 6000;
		func3.desconto = 3000;
		func3.exibir();
	}
}