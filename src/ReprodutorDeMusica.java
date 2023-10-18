
public class ReprodutorDeMusica  {
	boolean tocar() {
		if (tocar() == true) {
			System.out.println("Tocando musica");
		}
		return tocar();}
	boolean pausar() {
		if (tocar() == true) {
			System.out.println("Musica pausada");
		}
		return pausar();}
	
	void selecionarMusica(String musica) {
		
		if(musica!= null)
		System.out.println("Tocando" + musica);
		else {System.out.println("digite a musica para reproduzir");}
	}
	
	
	
}
