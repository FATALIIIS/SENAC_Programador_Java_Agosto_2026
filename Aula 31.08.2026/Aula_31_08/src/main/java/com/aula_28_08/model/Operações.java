package main.java.com.aula_28_08.model;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class Operações {

	public static void main(String[] args) {
		int numero1,numero2,resultado;
		int op;
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		try {
			op=Integer.parseInt(JOptionPane.showInputDialog(frame, "Escolha qual operação será realizada: \nAdição (+) \nSubtração (-) \nMultiplicação (*) \nDivisão (/)"));
			numero1=Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite o 1º valor: "));
			numero2=Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite o 2º valor: "));
					if (op==1) {
						resultado=numero1+numero2;
					}else if (op==2){
						resultado=numero1-numero2;
					}else if (op==3){
						resultado=numero1*numero2;
					}else {
						resultado=numero1/numero2;
					}
						JOptionPane.showMessageDialog(frame, "O resultado é: "+resultado+".");
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(frame, "Algum valor foi inserido incorretamente.");
		}
	}	
}
