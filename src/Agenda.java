import java.util.ArrayList;
import java.util.Iterator; // import the ArrayList class

public class Agenda {
	private Contato[] contatos = new Contato[3];
	

	
	
	
	
	public void adicionarContato(Contato contato, int elemento) throws MyException  {
		
		
		if(elemento > contatos.length) {
			throw new MyException();
		}	
		
		contatos[elemento - 1] = contato;

		
	}
	
	
	public void consultarContato(int indice) throws MyException {
		
		if(contatos[indice-1] == null) {
			throw new MyException();
		}
			
				System.out.println(contatos[indice - 1]);
			
				
		
		
	}
	
	public void mostrarContatos() {
		for(int i = 1; i <= contatos.length; i++) {
			if(contatos[i - 1] != null) {
				System.out.println(i  + " - " + contatos[i - 1].getNome());
			}
			
		}
	}


	@Override
	public String toString() {
		return "Agenda [contatos=" + contatos + "]";
	}
	
	
	
	
}
