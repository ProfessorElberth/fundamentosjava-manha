package testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import exceptions.ArquivoCorrompidoException;

public class ArquivoFuncionarioTeste {
	
	private static String[] mensagens; //["asdf", "asdf", null, null]

	public static void main(String[] args) {
		mensagens = new String[999];
		
		String dir = "C:/dev/workspace20E4/";
		String arq = "out_funcionarios.txt";

		try {
			FileReader leitura = new FileReader(dir+arq);
			BufferedReader in = new BufferedReader(leitura);
			
			String linha = in.readLine();
			int qtde = 0;
			float somaSalario = 0;
			int total = 0;
			float salarioTotal = 0;
			int i = 0;
			
			while(linha != null) {
				String[] campos = linha.split(";"); 
					
				try {
					total = Integer.valueOf(campos[0]);
					salarioTotal = Float.valueOf(campos[1]);
				} catch (NumberFormatException e) {
					mensagens[i++] = "O funcionário "+campos[0]+" recebe R$"+campos[1];
					qtde++;
					somaSalario = somaSalario + Float.valueOf(campos[1]);
				}
				
				linha = in.readLine();
			}
			
			if(total != qtde || salarioTotal != somaSalario) {
				throw new ArquivoCorrompidoException("Arquivo corrompido!!!");
			}
			
			for(String msg : mensagens) {
				if(msg != null) {
					System.out.println(msg);
				}
			}
			System.out.println("Quantidade: " + qtde);
			System.out.println("Soma salário: " + somaSalario);
			
		} catch (IOException | ArquivoCorrompidoException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}
}