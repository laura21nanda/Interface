package Interface;

public abstract class VeiculosAbs {

	String placa;
	String modelo;
	String cor;
	int ano;
	
	public abstract void acelerar ();
	public abstract void frear();
	public abstract void manobrar ();
	public abstract void ligar ();
	public abstract void desligar ();
}
