package com.olivier.synchro;

public class ListTab {
	private String[] tab = new String[50];
    private int index = 0;
    
    synchronized void ajoute(String s) {
        tab[index] = s;
        index++;
        notify();
        System.out.println("notify() exécuté"); 
    }
    
    synchronized String getPremierElementBloquant() {
        //tant que la liste est vide
        while(index == 0) {
            try {
                //attente passive
                wait();
            } catch(InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        return tab[0];
    }
}
