package main.java.com.calculoimc.model;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		Scanner leitor=new Scanner(System.in);
		String nome;
		double preço,desconto;
		System.out.println("Digite o nome do produto:");
		nome=leitor.nextLine();
		System.out.println("Digite o preço do produto:");
		System.out.println("R$");
		preço=leitor.nextDouble();
		System.out.println("Digite o desconto do produto em %:");
		desconto=leitor.nextDouble()/100;
		desconto=preço-(desconto*preço);
		System.out.println("O preço do produto com o desconto aplicado é: R$"+desconto+".");
	}
}
