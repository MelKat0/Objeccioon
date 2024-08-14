package aula3;

public class ObjectCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setId(01);
		cliente1.setNome("Bernadette");
		cliente1.setTelefone("98867-4506");
		cliente1.setCpf("259.669.154-09");
		cliente1.setRg("20896626-07");
		cliente1.setIdade(19);
		cliente1.setDatanasci("09/05/2005");
		cliente1.setSexo("Feminino");
		cliente1.setEndereço("Rua onde Judas perdeu as Botas, nº21");
		
		cliente2.setId(02);
		cliente2.setNome("Alice");
		cliente2.setTelefone("997997-9797");
		cliente2.setCpf("223.546.458-66");
		cliente2.setRg("425178918-27");
		cliente2.setIdade(159);
		cliente2.setDatanasci("01/01/1865");
		cliente2.setSexo("Feminino");
		cliente2.setEndereço("Rua onde Judas perdeu as Botas, nº42");
		
		System.out.println("--------------Cliente1--------------");
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getSexo());
		System.out.println(cliente1.getEndereço());
		System.out.println(cliente1.getIdade());
		System.out.println(cliente1.getDatanasci());
		
		System.out.println("------------------------------------");
		
		System.out.println(cliente1.comprar());
		System.out.println(cliente1.trocar());
		System.out.println(cliente1.devolver());
		System.out.println(cliente1.provar());
		
		System.out.println("------------------------------------");
		
		System.out.println("--------------Cliente2--------------");
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
		System.out.println(cliente2.getSexo());
		System.out.println(cliente2.getEndereço());
		System.out.println(cliente2.getIdade());
		System.out.println(cliente2.getDatanasci());
		
		System.out.println("------------------------------------");
		
		System.out.println(cliente2.comprar());
		System.out.println(cliente2.trocar());
		System.out.println(cliente2.devolver());
		System.out.println(cliente2.provar());
		
		System.out.println("------------------------------------");
	}

}
