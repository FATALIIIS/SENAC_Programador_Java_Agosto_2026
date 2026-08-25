package main.java.com.calculoimc.model;

import java.util.Scanner;

public class Odometro {

	public static void main(String[] args) {
		Scanner leitor=new Scanner(System.in);
		double odinicial, odfinal, litro, consumo; 
		System.out.println("Digite a quilometragem inicial:");
		odinicial=leitor.nextDouble();
		System.out.println("Digite a quilometragem final:");
		odfinal=leitor.nextDouble();
		System.out.println("Digite quanto KM o seu carro faz por litro:");
		litro=leitor.nextDouble();
		consumo=(odfinal-odinicial)/litro;
		System.out.println("A quantidade em litros(l) gasta nesse percurso foi de: "+consumo+"L.");
	}
}
