package view;
import java.util.Random;
import controller.ThreadVetor;

public class Principal {

		public static void main(String[] args) {
			int v[] = new int[1000];
			v = carregarVetor(v);
		for (int i=1; i<=2; i++){	
			
			ThreadVetor tVetor = new ThreadVetor(i, v);
			tVetor.start();
		}	
			
			
			
		}
	
		public static int[] carregarVetor(int v[]) {
			Random r = new Random(); 
			for (int i = 0;  i < v.length; i++){
				
				v[i] =  r.nextInt(100) + 1;
				
			}
			return v;
		}
}
