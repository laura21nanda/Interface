package Interface;

public class Ferrari implements Veiculo {
	@Override
	public void ligar() {
		System.out.println("ligando");
	}
	@Override
	public void desligar() {
		System.out.println("Dormindo");
	}
	@Override
	public void manobra() {
		System.out.println("Dormindo");
	}
	@Override
	public void acelerar() {
		System.out.println("Dormindo");
	}
	@Override
	public void frear() {
		System.out.println("Dormindo");
	}
}