package testes;

import dominio.Empresa;
import exceptions.NomeIncompletoException;

public class EmpresaTeste {

	public static void main(String[] args) {

		try {
			Empresa e1 = new Empresa();
			e1.setNome("Maria ÁLVARES");
			e1.setFaturamento(-100);
			System.out.println(">>> " + e1.getNome() + " - " + e1.getFaturamento());
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Empresa e2 = new Empresa();
			e2.setNome("Elberth Lins Costa de Moraes");
			e2.setFaturamento(200);
			System.out.println(">>> " + e2.getNome()  + " - " + e2.getFaturamento());
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Empresa e3 = new Empresa();
			e3.setFaturamento(1000);
			System.out.println(">>> " + e3.getNome()  + " - " + e3.getFaturamento());
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Empresa e4 = new Empresa();
			e4.setNome("Joaozinho");
			e4.setFaturamento(-500);
			System.out.println(">>> " + e4.getNome()  + " - " + e4.getFaturamento());
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}