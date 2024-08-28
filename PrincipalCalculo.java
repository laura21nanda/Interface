package Interface;

public class PrincipalCalculo {

	public static void main(String[] args) {
		Calculando calculadora = new Calculando();

		System.out.println("---------Resultados--------");
		System.out.println(calculadora.somar());
		System.out.println(calculadora.sub());
		System.out.println(calculadora.multi());
		System.out.println(calculadora.div());
		System.out.println(calculadora.exp());
		

	}

}
