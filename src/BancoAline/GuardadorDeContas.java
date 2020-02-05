package BancoAline;

public class GuardadorDeContas {

        private ContaJava2 [] referencias ;
		private int posicaoLivre;
		
		
		public GuardadorDeContas (){
			this.referencias = new ContaJava2[10];
			this.posicaoLivre = 0;
			
			
			
		}
		
        public void adiciona(ContaJava2 ref) {
           this.referencias[0]= ref;
           this.posicaoLivre ++;
           
           
        }

		public int getQuantidadeDeElementos() {
		   return posicaoLivre;
		}

		public ContaJava2 getReferencia(int pos) {
			
			return this.referencias [pos];
		}

		}
	


