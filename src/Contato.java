
public class Contato {
	private String nome;
	private String telefone;
	private static int idCounter = 0;
	public int id;
	
	
	public Contato(String nome, String telefone) {

		idCounter++;
		this.id = idCounter;
		this.nome = nome;
		this.telefone = telefone;
		
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + ", id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
	
}
