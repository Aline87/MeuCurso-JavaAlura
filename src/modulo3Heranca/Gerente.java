package modulo3Heranca;

public class Gerente extends Funcionario {

	    private int senha;

		public boolean autentica(int senha) {
			if (this.senha == senha) {
				return true;
			} else {
				return false;

			}
		}

		public int getSenha() {
			return senha;
		}

		public void SetSenha(int senha) {
			this.senha = senha;
		}

		public double getBonificacao(){
			return super.getSalario();
		}
	

	public boolean getAutentica(int i) {
		return false;
	}

}
