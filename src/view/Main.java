package view;

import java.util.Random;

import controller.ThreadSapo;

public class Main {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int distanciaTotal = rd.nextInt(100) + 1;
		int tamanhoMaxPulo = rd.nextInt(100) + 1;
		ThreadSapo threadSapo1 = new ThreadSapo("Sapo Azul", distanciaTotal, tamanhoMaxPulo, 0);
		ThreadSapo threadSapo2 = new ThreadSapo("Sapo Verde", distanciaTotal, tamanhoMaxPulo, 0);
		ThreadSapo threadSapo3 = new ThreadSapo("Sapo Rosa", distanciaTotal, tamanhoMaxPulo, 0);
		ThreadSapo threadSapo4 = new ThreadSapo("Sapo Vermelho", distanciaTotal, tamanhoMaxPulo, 0);
		ThreadSapo threadSapo5 = new ThreadSapo("Sapo Marrom", distanciaTotal, tamanhoMaxPulo, 0);
		
		threadSapo1.start();
		threadSapo2.start();
		threadSapo3.start();
		threadSapo4.start();
		threadSapo5.start();

	}

}
