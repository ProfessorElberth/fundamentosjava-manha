package testes;

import dominio.Programador;

public class ProgramadorTeste {

	public static void main(String[] args) {
		
		Programador p1 = new Programador();
//		p1.setIdade(105);
//		p1.setSalario(1000);
		p1.setFullStack(true);		
		p1.setLinguagem("java");
		System.out.println("Programador: " + p1);
		
		Programador p2 = new Programador("andressa", 20);
		p2.setSalario(200000);
		p2.setFullStack(false);
		p2.setLinguagem("python");
		System.out.println("Programador: " + p2);
		
		Programador p3 = new Programador("carla", 21, 300000, true, "JAVA");
		System.out.println("Programador: " + p3);
	}
}