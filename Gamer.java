package Interface;

public class Gamer implements Computador{
	@Override
	public void ligar() {
		System.out.println("Ligando");
	}
	@Override
	public void reiniciar() {
		System.out.println("Reiniciando");
	}
	@Override
	public void desligar() {
		System.out.println("Desligando");
	}
	@Override
	public void carregandoSistema() {
		System.out.println("Carregandfo o sistema");
	}
}
