import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		
		
		System.out.println("Informe as opções: ");
		System.out.println("1- Consultar contato");
		System.out.println("2- Adicionar Contato");
		
		
		
		int opAux = 0;
		int elemento = 1;
		while(opAux != 1) {
			
			int value = read.nextInt();
			
			switch (value) {
			
			case 1: {
				
				agenda.mostrarContatos();
				
				System.out.println("Informe o indice do contato: ");
				int indice = read.nextInt();
				
				agenda.consultarContato(indice);
				
			
				break;
			}
			
			case 2:{
				
				 System.out.println("Informe o nome do contato: ");
				 read.nextLine(); // Limpa o buffer antes de ler o nome
				 String nome = read.nextLine();
				
				
				System.out.println("Informe o telefone do contato: ");
				String telefone = read.nextLine();
				
				
				Contato contato = new Contato(nome,telefone);
				agenda.adicionarContato(contato,elemento);
				System.out.println("Contato Adicionado com sucesso!");
				System.out.println("___________________________________");
				
				System.out.println("1- Consultar contato");
				System.out.println("2- Adicionar Contato");
				elemento++;
				
				break;
				
				
				
				
				
			}
			default:
				System.out.println("Tente denovo");
				System.out.println("Informe as opções: ");
				System.out.println("1- Consultar contato");
				System.out.println("2- Adicionar Contato");
				
				opAux = 0;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
