package BancoAline;

public class GuardadorDeReferencias {
	
        private Object[] referencias ;
			private int posicaoLivre;
			
			
			public GuardadorDeReferencias (){
				this.referencias = new Object[10];
				this.posicaoLivre = 0;
				
				
				
			}
			
	        public void adiciona(Object ref) {
	           this.referencias[0]= ref;
	           this.posicaoLivre ++;
	           
	           
	        }

			public int getQuantidadeDeElementos() {
			   return posicaoLivre;
			}

			public Object getReferencia(int pos) {
				
				return this.referencias [pos];
			}

			}
		





