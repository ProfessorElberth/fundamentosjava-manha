package testes;

import dominio.Empresa;

public class EmpresaTeste {

	public static void main(String[] args) {
		
		Empresa e = new Empresa();
		e.setNome("Maria ÁLVARES cabral");
		System.out.println(e.getNome());
		e.exibir();
	}
}
