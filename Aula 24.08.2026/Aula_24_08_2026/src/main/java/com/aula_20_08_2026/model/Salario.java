package main.java.com.aula_20_08_2026.model;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner leitor=new Scanner(System.in);
		String nome;
		int horast;
		double valorh,salariobruto;
		System.out.println("Digite seu nome:");
		nome=leitor.nextLine();
		System.out.println("Digite as horas trabalhadas:");
		horast=leitor.nextInt();
		System.out.println("Digite o valor em R$ da hora:");
		valorh=leitor.nextDouble();
		salariobruto=horast*valorh;
		DecimalFormat df=new DecimalFormat("#,###.00");
		System.out.println("Caro "+nome+", seu salário é de R$"+salariobruto);
		df.format(salariobruto);
	}

}
