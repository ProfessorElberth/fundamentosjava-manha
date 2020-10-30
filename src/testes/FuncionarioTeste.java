package testes;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		func1.nome = "elberth";
		func1.idade = 42;
		func1.salario = 1000;
		func1.bonus = 500;
		func1.desconto = 200;
		System.out.println("Funcionário: " + func1.nome);

		Funcionario func2 = new Funcionario();
		func2.nome = "lucas";
		func2.idade = 22;
		func2.salario = 10000;
		func2.bonus = 5000;
		func2.desconto = 2000;
		System.out.println("Funcionário: " + func2.idade);

		Funcionario func3 = new Funcionario();
		func3.nome = "carla";
		func3.idade = 21;
		func3.salario = 20000;
		func3.bonus = 6000;
		func3.desconto = 3000;
		System.out.println("Funcionário: " + func3);
	}
}