package main.java.com.aula_28_08.model;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class Instituição {

	public static void main(String[] args) {
		String instituição;
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		try {
			instituição=JOptionPane.showInputDialog(frame,"Digite o nome da instituição:");
			if(instituição.equalsIgnoreCase("senac")){
				JOptionPane.showMessageDialog(frame,"Parabéns, boa escolha!");
			}else {
				JOptionPane.showMessageDialog(frame,"Infelizmente essa não é uma boa escolha!");
			}
			}catch (Exception e) {
				JOptionPane.showMessageDialog(frame, "Erro na tentativa de digitar.");
			}
		}
	}

