package Interface;

public class PrincipalAnimalAbs {
	public static void main(String[] args) {
		
		LoboAbs lobo = new LoboAbs();
		LeaoAbs leao = new LeaoAbs();
		TigraAbs tigre = new TigraAbs();
		CachorroAbs dog = new CachorroAbs();
		GatoAbs gato = new GatoAbs();
		
		lobo.setNome("Nome: Lobinho");
		lobo.setSexo("Nome: Macho");
		lobo.setRaca("Nome: Lobo-guará");
		
		
		leao.setNome("Nome: simba");
		leao.setSexo("Nome: Macho");
		leao.setRaca("Nome: leao da África");
		
		
		tigre.setNome("Nome: Tigresa");
		tigre.setSexo("Nome: femea");
		tigre.setRaca("Nome: Tigre branco");
		
		dog.setNome("Nome: Nalu");
		dog.setSexo("Nome: femea");
		dog.setRaca("Nome: Pincher");
		
		gato.setNome("Nome: Tiana");
		gato.setSexo("Nome: femea");
		gato.setRaca("Nome: Siamês");
		
		System.out.println("-----------LOBO-----------");
		System.out.println(lobo.getNome());
		System.out.println(lobo.getSexo());
		System.out.println(lobo.getRaca());
		lobo.caminhar();
		lobo.correr();
		lobo.dormir();
		lobo.emitirSom();
		
		System.out.println("-----------Leao-----------");
		System.out.println(leao.getNome());
		System.out.println(leao.getSexo());
		System.out.println(leao.getRaca());
		leao.caminhar();
		leao.correr();
		leao.dormir();
		leao.emitirSom();

		System.out.println("-----------Tigre-----------");
		System.out.println(tigre.getNome());
		System.out.println(tigre.getSexo());
		System.out.println(tigre.getRaca());
		tigre.caminhar();
		tigre.correr();
		tigre.dormir();
		tigre.emitirSom();

		System.out.println("-----------Cachorro-----------");
		System.out.println(dog.getNome());
		System.out.println(dog.getSexo());
		System.out.println(dog.getRaca());
		dog.caminhar();
		dog.correr();
		dog.dormir();
		dog.emitirSom();
		
		System.out.println("-----------Gato-----------");
		System.out.println(gato.getNome());
		System.out.println(gato.getSexo());
		System.out.println(gato.getRaca());
		gato.caminhar();
		gato.correr();
		gato.dormir();
		gato.emitirSom();
	}
}
