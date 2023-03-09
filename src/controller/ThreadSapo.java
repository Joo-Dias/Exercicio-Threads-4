package controller;

import java.util.Random;


public class ThreadSapo extends Thread {

	String nome;
	int distanciaTotal;
	int tamanhoMaxPulo;
	int distanciaPercorrida;

	public ThreadSapo(String nome, int distanciaTotal, int tamanhoMaxPulo, int distanciaPercorrida) {
		this.nome = nome;
		this.distanciaTotal = distanciaTotal;
		this.tamanhoMaxPulo = tamanhoMaxPulo;
		this.distanciaPercorrida = distanciaPercorrida;

	}

    public void run() {
        Random rand = new Random();
        int pulo;
        int distanciaRestante;
        
        while (distanciaPercorrida < distanciaTotal) {
            pulo = rand.nextInt(tamanhoMaxPulo) + 1;

            distanciaRestante = distanciaTotal - distanciaPercorrida;
            
            if (pulo > distanciaRestante) {
                pulo = distanciaRestante;
            }
            
            distanciaPercorrida += pulo;
            
            System.out.println(nome + " pulou " + pulo + " metros e percorreu " + distanciaPercorrida + " metros.");
        }

        System.out.println(nome + " chegou na "+getLugar());
	}
    
    public int getLugar() {
    	int lugar = 5;
    	boolean threadLife = Thread.currentThread().isAlive();
    	if(threadLife == false) {
    		lugar++;
    	} else {
    		lugar--;
    	}
		return lugar;
    }

}
