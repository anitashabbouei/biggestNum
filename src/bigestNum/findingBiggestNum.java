package bigestNum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findingBiggestNum {
	
	Scanner sc = new Scanner(System.in) ; 
	int anzahlZahlen; 
	List<Double> listeAnZahlen;
	
	/**
	 * Konstruktor 
	 * 
	 * Erstelle ein neues Objekt 
	 */
	public findingBiggestNum() {
		
		System.out.println("Hallo! Gebe hier eine Zahlen reihe an und ich gebe dir aus, welche Zahl am größten ist.");	
		System.out.println("Bitte gebe an wie viele Zahlen du vergleichen möchtest:");
		anzahlZahlen = sc.nextInt(); 
		System.out.println(anzahlZahlen);
		this.listeAnZahlen = new ArrayList<>();
		arrayErstellen(anzahlZahlen);
		
	}
	
	public void arrayErstellen(int anzahlZahlenn) {
		
		
		for(int i = 0; i <= anzahlZahlenn-1; i++) {
			
			System.out.println("Bitte gebe deine " + (i+1) + ". Zahl an: ");
			
			double zahl = sc.nextDouble();
			
			listeAnZahlen.add(zahl); 
			
			System.out.println(zahl);
			
			
		}
		
		sc.close();
		listeIteriern(listeAnZahlen);
		
	}
	
	public void listeIteriern(List<Double> ausgefüllteListe) {
		 
		double groeßteZahl = 0.0; 
		
		System.out.println("Ok! .... Gebe mir einen Moment .... Ich habe es gleich ...." );
		System.out.println("Die größte Zahl in der Zahlenreihe lautet: ");
		
	for(Double a : ausgefüllteListe) {
		
		if (a >= groeßteZahl) {
			groeßteZahl = a; 
		} else {
			
		}
	}
	
	System.out.println(groeßteZahl); 
		
		
		
	}
	

}
