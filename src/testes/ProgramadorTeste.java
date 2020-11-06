package testes;

import dominio.Programador;

public class ProgramadorTeste {

	public static void main(String[] args) {
		
		Programador p1 = new Programador();
		p1.idade = 105;
		p1.salario = 1000;
		p1.fullStack = true;
		p1.linguagem = "java";
		System.out.println("Programador: " + p1);
		
		Programador p2 = new Programador("andressa", 20);
		p2.salario = 200000;
		p2.fullStack = false;
		p2.linguagem = "python";
		System.out.println("Programador: " + p2);
		
		Programador p3 = new Programador("carla", 21, 300000, true, "JAVA");
		System.out.println("Programador: " + p3);
	}
}