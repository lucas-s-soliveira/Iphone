
public class Console   {
	public static void main(String[] args) {
	Navegador navegador = new Navegador();
	ReprodutorDeMusica reprodutor = new ReprodutorDeMusica();
	Telefone telefone = new Telefone();
	
	telefone.ligar( 933192322);
	reprodutor.selecionarMusica("Dentro da hilux");
	navegador.exibirPagina();
	}

}
