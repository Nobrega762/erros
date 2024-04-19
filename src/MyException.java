
public class MyException extends Exception {
	public String mensagemErro;
	public String mensagemErro2;
	
	
 MyException() {
		this.mensagemErro = "ContatoNaoExisteException";
		this.mensagemErro2 = "AgendaCheiaException";
	}

}
