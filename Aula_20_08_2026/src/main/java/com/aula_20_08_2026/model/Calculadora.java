package main.java.com.aula_20_08_2026.model;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor=new Scanner(System.in);
		double numero,numero2,soma;
		System.out.println("Calculadora da Soma");
		System.out.println("Digite um número:");
		numero=leitor.nextDouble();
		System.out.println("Digite outro número:");
		numero2=leitor.nextDouble();
		soma=numero+numero2;
		System.out.println(numero+"+"+numero2+"="+soma);
	}
}
