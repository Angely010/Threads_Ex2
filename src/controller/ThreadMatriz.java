package controller;

public class ThreadMatriz extends Thread{
		
		private int[] linha;
		private int numLinha;
		
		public ThreadMatriz(int[] linha, int numLinha) {
			this.linha = linha;
			this.numLinha = numLinha;
		}
		
		
		@Override
		public void run() {
			int soma = 0;
			
			for (int i : linha) {
				soma += i;
			}
			
			System.out.println("Soma da linha #" + (numLinha + 1) + " : " + soma);
		}


}
