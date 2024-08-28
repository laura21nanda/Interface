package Interface;

public class Principal_Computador {

	public static void main(String[] args) {
		Home Domestico = new Home();
		Gamer gamer1 = new Gamer();
		
		System.out.println("----Domestico----");
		Domestico.ligar();
		Domestico.reiniciar();
		Domestico.desligar();
		Domestico.carregandoSistema();
		
		System.out.println("----Gamer----");
		gamer1.ligar();
		gamer1.reiniciar();
		gamer1.desligar();
		gamer1.carregandoSistema();

	}

}
