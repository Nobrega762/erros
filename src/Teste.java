import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws MyException {
		Scanner read = new Scanner(System.in);
		Agenda agenda = new Agenda();

		System.out.println("Informe as opções: ");
		System.out.println("1- Consultar contato");
		System.out.println("2- Adicionar Contato");
		System.out.println("3- Sair do Sistema");

		int opAux = 0;
		int elemento = 1;
		while (opAux != 3) {

			try {
				int value = read.nextInt();

				switch (value) {

				case 1: {

					agenda.mostrarContatos();

					System.out.println("Informe o indice do contato: ");
					int indice = read.nextInt();

					try {
						agenda.consultarContato(indice);
					} catch (MyException e) {
						System.out.println(e.mensagemErro);
					}

					System.out.println("1- Consultar contato");
					System.out.println("2- Adicionar Contato");
					System.out.println("3- Sair do Sistema");

					break;
				}

				case 2: {

					System.out.println("Informe o nome do contato: ");
					read.nextLine(); // Limpa o buffer antes de ler o nome
					String nome = read.nextLine();

					System.out.println("Informe o telefone do contato: ");
					String telefone = read.nextLine();

					Contato contato = new Contato(nome, telefone);

					try {
						agenda.adicionarContato(contato, elemento);
					} catch (MyException e) {
						System.out.println(e.mensagemErro2);
					}

					System.out.println("Contato Adicionado com sucesso!");
					System.out.println("___________________________________");

					System.out.println("1- Consultar contato");
					System.out.println("2- Adicionar Contato");
					System.out.println("3- Sair do Sistema");
					elemento++;

					break;
				}
				case 3: {
					System.out.println("Saindo do sistema...");
					break;
				}

				default:
					System.out.println("Tente denovo");
					System.out.println("Informe as opções: ");
					System.out.println("1- Consultar contato");
					System.out.println("2- Adicionar Contato");
					System.out.println("3- Sair do Sistema");

				}

			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, insira um valor numérico");
				read.nextLine(); // Limpa o buffer

			}

		}

	}

}
