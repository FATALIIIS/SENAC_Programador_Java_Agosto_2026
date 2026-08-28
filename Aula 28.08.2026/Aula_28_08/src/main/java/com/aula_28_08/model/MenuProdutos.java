package main.java.com.aula_28_08.model;

import java.awt.Frame;

import javax.swing.JOptionPane;

public class MenuProdutos {

	public static void main(String[] args) {
		int produto,quantidade;
		double total;
		String[] nome= {"Pastel","Refri Lata","Bolo"};
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		try {
			produto=Integer.parseInt(JOptionPane.showInputDialog(frame, "Escolha o seu produto:  \n 1 Pastel \n 2 Refri Lata \n 3 Bolo"));
			quantidade=Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite a quantidade: "));
					if (produto==1) {
						total=6*quantidade;
					}else if (produto==2){
						total=5.50*quantidade;
					}else {
						total=19.99*quantidade;
					}
					boolean confirma=JOptionPane.showConfirmDialog(frame,"O produto '"+nome[produto-1]+"' custa "+total+"R$ ao todo, confirmar compra?")==JOptionPane.YES_OPTION;
					if(confirma) {
						JOptionPane.showMessageDialog(frame, "Compra realizada com sucesso.");
					}else{
						JOptionPane.showMessageDialog(frame, "Compra cancelada.");
					}
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(frame, "A quantidade digitada não é um número.");
					}
		}
}
