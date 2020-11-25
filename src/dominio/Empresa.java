package dominio;

public class Empresa {

	private String nome;
	private String nomeMeio;
	private String ultimoNome;
	
	public void exibir() {
		System.out.println("Empresa: " + this.toString());
	}
	
	@Override
	public String toString() {

		return String.format("%s - %s - %s\n", 
				this.nome,
				this.nomeMeio,
				this.ultimoNome
			);
	}
	
	public String getNome() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.ultimoNome.toUpperCase().charAt(0));
		sb.append("., ");
		sb.append(this.nome.toUpperCase());
		sb.append(" ");
		sb.append(this.nomeMeio.toLowerCase());
		
		return sb.toString();
	}
	
	public void setNome(String nome) {

		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		this.nome = nome.substring(0, posInicial);
		this.nomeMeio = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
	}
}