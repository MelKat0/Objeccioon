package aula3;

public class Cliente {

	int id;
	String nome;
	String telefone;
	String cpf;
	String rg;
	
	String sexo;
	String endereço;
	int idade;
	String datanasci;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDatanasci() {
		return datanasci;
	}
	public void setDatanasci(String datanasci) {
		this.datanasci = datanasci;
	}
	public String comprar() {
		return "Compra";
	}
	public String trocar() {
		return "Troca";
	}
	public String devolver() {
		return "Devolve";
	}
	public String provar() {
		return "Prova";
	}
	
}
