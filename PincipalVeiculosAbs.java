package Interface;

public class PincipalVeiculosAbs {

	public static void main(String[] args) {
		
		CarroAbs Ferrari = new CarroAbs();
		OnibusAbs Busao = new OnibusAbs();
		
		System.out.println("------Carro-------");
		Ferrari.acelerar();
		Ferrari.desligar();
		Ferrari.frear();
		Ferrari.ligar();
		Ferrari.manobrar();
		
		System.out.println("--------------------------------");
		
		System.out.println("------Onibus-------");
		Busao.acelerar();
		Busao.desligar();
		Busao.frear();
		Busao.ligar();
		Busao.manobrar();
	}

}
