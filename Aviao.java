package aula3;

public class Aviao {

		
		String companhia;
		int capacidade;
		String tipo;
		String cor;
		String alcance;
		String identify;
		
		public String getCompanhia() {
			return companhia;
		}
		public void setCompanhia(String companhia) {
			this.companhia = companhia;
		}
		public int getCapacidade() {
			return capacidade;
		}
		public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public String getAlcance() {
			return alcance;
		}
		public void setAlcance(String alcance) {
			this.alcance = alcance;
		}
		public String getIdentify() {
			return identify;
		}
		public void setIdentify(String identify) {
			this.identify = identify;
		}
		public String voar() {
			return "Voando";
		}
		public String pousar() {
			return "Pousando";
		}
		public String planar() {
			return "Planando";
		}
}
