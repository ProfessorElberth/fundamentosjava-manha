package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import dominio.Estagiario;
import exceptions.EstagiarioInexistenteException;

public class ArquivoTeste {

	public static void main(String[] args) {
		
		String dir = "C:/dev/workspace20E4/";
		String arq = "funcionarios.txt";

		try {
			FileReader leitura = new FileReader(dir+arq);			
			BufferedReader in = new BufferedReader(leitura);
			
			FileWriter escrita = new FileWriter(dir+"out_"+arq);			
			BufferedWriter out = new BufferedWriter(escrita);

			String linha = in.readLine();
			
			float maiorSalario = 0;
			Estagiario estagiario = null;
			int qtde = 0;
			float somaSalario = 0;
			
			while(linha != null) {
				
				String[] campos = linha.split(";");
				
				switch (campos[0].toUpperCase()) {
				case "E":
					Estagiario e = new Estagiario();
					e.setNome(campos[1]);
					e.setIdade(Integer.valueOf(campos[2]));
					e.setSalario(Float.valueOf(campos[3]));
					e.setDesconto(Float.valueOf(campos[4]));
					e.setInstituicao(campos[5]);
					e.exibir();
	
					float salarioLiquido = e.calcularSalarioLiquido();
					
					if(salarioLiquido >= maiorSalario) {
						maiorSalario = salarioLiquido;
						estagiario = e;
					}

					out.write(e.obterStringSalarioPorFuncionario());

					qtde++;
					somaSalario = somaSalario + salarioLiquido;
					
					break;

				default:
					break;
				}

				linha = in.readLine();
			}

			if(estagiario == null) {
				throw new EstagiarioInexistenteException("Não existem estagiários no arquivo!");
			}

			out.write(qtde+";"+somaSalario);
			
			System.out.println("Estagiário com o maior salário: " + estagiario.getNome());
			
			in.close();
			leitura.close();
			
			out.close();
			escrita.close();
			
		} catch (IOException | EstagiarioInexistenteException e) {
			System.out.println(e.getMessage());
		}
	}
}