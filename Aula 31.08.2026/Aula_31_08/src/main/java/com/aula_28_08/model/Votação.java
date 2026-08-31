package main.java.com.aula_28_08.model;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class Votação {

	public static void main(String[] args) {
		String nome;
		int idade;
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		try {
			nome=JOptionPane.showInputDialog(frame,"Digite o seu nome:");
			idade=Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite a sua idade:"));
			if(idade<=17) {
				JOptionPane.showMessageDialog(frame, "Caro "+nome+", você possui menos de 18 anos e não pode votar.");
			}else if(idade>=70) {
				JOptionPane.showMessageDialog(frame, "Caro "+nome+", você possui 70 ou mais anos de idade e não pode mais votar.");
			}else {
				JOptionPane.showMessageDialog(frame, "Caro "+nome+", seu voto foi registrado com sucesso.");
			}
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame, "O valor da idade não é válido.");
		}
	}
}
