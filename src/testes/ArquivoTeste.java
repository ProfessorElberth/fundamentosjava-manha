package testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import dominio.Estagiario;

public class ArquivoTeste {

	public static void main(String[] args) {
		
		String dir = "C:/dev/workspace20E4/";
		String arq = "javamanha.txt";

		try {
			FileReader leitura = new FileReader(dir+arq);
			
			BufferedReader in = new BufferedReader(leitura);
			
			String linha = in.readLine();
			
			float maiorSalario = 0;
			Estagiario estagiario = null;
			
			while(linha != null) {
				
				String[] campos = linha.split(";");
				
				Estagiario e = new Estagiario();
				e.setNome(campos[0]);
				e.setIdade(Integer.valueOf(campos[1]));
				e.setSalario(Float.valueOf(campos[2]));
				e.setDesconto(Float.valueOf(campos[3]));
				e.setInstituicao(campos[4]);
				e.exibir();

				float salarioLiquido = e.calcularSalarioLiquido();
				
				if(salarioLiquido >= maiorSalario) {
					maiorSalario = salarioLiquido;
					estagiario = e;
				}
				
				linha = in.readLine();
			}
			
			System.out.println("Estagiário com o maior salário: " + estagiario.getNome());
			
			in.close();
			leitura.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}