package main.java.com.calculoimc.model;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args) {
		Scanner leitor=new Scanner(System.in);
		int numero,antecessor;
		System.out.println("Digite um número:");
		numero=leitor.nextInt();
		antecessor=numero-1;
		System.out.println("O antecessor de "+numero+" é: "+antecessor);
	}
}
 