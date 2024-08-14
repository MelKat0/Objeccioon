package aula3;

public class ObjectAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		
		aviao1.setCompanhia("GOL");
		aviao1.setCapacidade(301);
		aviao1.setTipo("Boeing");
		aviao1.setCor("Branco e vermelho");
		aviao1.setAlcance("14.305km");
		aviao1.setIdentify("9088");
		
		aviao2.setCompanhia("Airbus");
		aviao2.setCapacidade(165);
		aviao2.setTipo("A320");
		aviao2.setCor("Branco azul");
		aviao2.setAlcance("6.100km");
		aviao2.setIdentify("3747");
		
		System.out.println("------------AVIÃO1-------------");
		System.out.println(aviao1.getCompanhia());
		System.out.println(aviao1.getCapacidade());
		System.out.println(aviao1.getTipo());
		System.out.println(aviao1.getCor());
		System.out.println(aviao1.getAlcance());
		System.out.println(aviao1.getIdentify());
		System.out.println(aviao1.voar());
		System.out.println("-------------------------------");
		
		System.out.println("------------AVIÃO2-------------");
		System.out.println(aviao2.getCompanhia());
		System.out.println(aviao2.getCapacidade());
		System.out.println(aviao2.getTipo());
		System.out.println(aviao2.getCor());
		System.out.println(aviao2.getAlcance());
		System.out.println(aviao2.getIdentify());
		System.out.println(aviao2.pousar());
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
	}
}

