package main.java.com.if_else_janelas_erros.model;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		String nome;
		boolean sexo;
		double altura,pesoideal;
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		try {
			nome=JOptionPane.showInputDialog(frame,"Digite seu nome: ");
			altura=Double.parseDouble(JOptionPane.showInputDialog(frame,"Digite sua altura: ").replace(",","."));
			sexo=JOptionPane.showConfirmDialog(frame,"Você é do sexo masculino ?","Pergunta",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION;
			if (sexo) {
				pesoideal=(72.7*altura)-58;
			}else {
				pesoideal=(62.1*altura)-44.7;
			}
			JOptionPane.showMessageDialog(frame,"Caro(a) "+nome+", seu peso ideal é "+String.format("%.1f",pesoideal));
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame, "O valor da altura não é válido.");
		}
	}

}
