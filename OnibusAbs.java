package Interface;

public class OnibusAbs extends VeiculosAbs {

	@Override
	public void acelerar(){
		System.out.println("Acelerando");
	}
	@Override
	public void frear(){
		System.out.println("freando");
	}
	@Override
	public void ligar(){
		System.out.println("Ligando");
	}
	@Override
	public void desligar(){
		System.out.println("Desligar");
	}
	@Override
	public void manobrar(){
		System.out.println("Manobrando");
}
}
