package Interface;

public abstract class AnimalAbs {
	
	String nome;
	String sexo;
	String raca;
	
	public abstract void dormir();
	public abstract void caminhar();
	public abstract void correr();
	public abstract void emitirSom();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String 	Nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String 	Sexo) {
		this.sexo = sexo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String 	Raca) {
		this.raca = raca;
	}
}
