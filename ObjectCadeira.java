package aula3;

public class ObjectCadeira {

	public static void main(String[] args) {
		Cadeira cadeira1 = new Cadeira();
		Cadeira cadeira2 = new Cadeira();
		
		cadeira1.setObjeto("Cadeira");
		cadeira1.setModelo("Presidente");
		cadeira1.setCor("Preta");
		cadeira1.setMaterial("Couro");
		cadeira1.setVidautil("5 anos");
		
		cadeira2.setObjeto("Cadeira");
		cadeira2.setModelo("Gamer Pichau Omega S");
		cadeira2.setCor("Rosa e creme");
		cadeira2.setMaterial("Suede");
		cadeira2.setVidautil("5 anos");
		
		System.out.println("----------CADEIRA1-----------");
		
		System.out.println(cadeira1.getObjeto());
		System.out.println(cadeira1.getModelo());
		System.out.println(cadeira1.getCor());
		System.out.println(cadeira1.getMaterial());
		System.out.println(cadeira1.getVidautil());
		System.out.println("-----------------------------");
		System.out.println(cadeira1.girar());
		System.out.println(cadeira1.mover());
		System.out.println(cadeira1.abaixar());
		System.out.println(cadeira1.reclinar());
		
		System.out.println("-----------------------------");
		
		System.out.println("----------CADEIRA2-----------");
		
		System.out.println(cadeira2.getObjeto());
		System.out.println(cadeira2.getModelo());
		System.out.println(cadeira2.getCor());
		System.out.println(cadeira2.getMaterial());
		System.out.println(cadeira2.getVidautil());
		System.out.println("-----------------------------");
		System.out.println(cadeira2.girar());
		System.out.println(cadeira2.mover());
		System.out.println(cadeira2.abaixar());
		System.out.println(cadeira2.reclinar());
		
		System.out.println("-----------------------------");
	}

}
