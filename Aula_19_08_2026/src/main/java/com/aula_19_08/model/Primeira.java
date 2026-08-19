package main.java.com.aula_19_08.model;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		Scanner leitor=new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome=leitor.nextLine();
		System.out.println("Bem-vindo, "+nome+"!");
	}

}
