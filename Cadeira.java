package aula3;

public class Cadeira {

	String objeto;
	String modelo;
	String cor;
	String material;
	String vidautil;

	public String getObjeto() {
		return objeto;
	}
	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getVidautil() {
		return vidautil;
	}
	public void setVidautil(String vidautil) {
		this.vidautil = vidautil;
	}
	public String girar() {
		return "Gira";
	}
	public String mover() {
		return "Roda";
	}
	public String abaixar() {
		return "Abaixa";
	}
	public String reclinar() {
		return "Reclina";
	}
}
