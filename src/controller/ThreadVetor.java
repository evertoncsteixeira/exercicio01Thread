package controller;

public class ThreadVetor extends Thread {
	private int n;
	private int[] v;
	public ThreadVetor(int n, int[] v) {
		this.n  = n;
		this.v = v;
	}
	
	@Override
	public void run() {
		lerVetor();
	}
	
	private void lerVetor(){
		
		int t = 0;
		
		double segIni =  System.nanoTime();
		if (n % 2 == 0) {
			for (int i = 0 ; i < this.v.length; i++) {
				t += v[i];
			}
		}else {
			for (int i : this.v) {
				t += i;
			}
		}
		double segFin =  System.nanoTime();
		double segTotal = segFin - segIni;
		//seg = System.nanoTime() - seg; 
		//seg *= 1000; 
		System.out.println("A Thread#" + getId() + ": \nLevou " + segTotal + " nanos segundos; \nPara o valor:  " + this.n + " com o total de: " + t +".");
	}
	

}
