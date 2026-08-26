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
		}
	}

}
