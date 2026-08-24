package main.java.com.calculoimc.model;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner leitor=new Scanner(System.in);
		String nome;
		double peso,altura,imc;
		System.out.println("Digite seu nome:");
		nome=leitor.nextLine();
		System.out.println("Digite seu peso:");
		peso=leitor.nextDouble();
		System.out.println("Digite sua altura:");
		altura=leitor.nextDouble();
		imc=peso/(altura*altura);
		//imc=peso/(Math.pow(altura,2)); (Alternativa com potenciação)
		DecimalFormat df=new DecimalFormat("#.0");
		System.out.println("Caro(a) "+nome+", seu I.M.C é de "+df.format(imc)+".");
	}

}
