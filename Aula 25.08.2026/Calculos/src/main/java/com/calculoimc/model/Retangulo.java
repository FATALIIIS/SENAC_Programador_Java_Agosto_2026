package main.java.com.calculoimc.model;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Scanner leitor=new Scanner(System.in);
		int base,altura,area;
		System.out.println("Digite a base:");
		base=leitor.nextInt();
		System.out.println("Digite a altura:");
		altura=leitor.nextInt();
		area=base*altura/2;
		System.out.println("A área do retângulo é: "+area);
	}

}
