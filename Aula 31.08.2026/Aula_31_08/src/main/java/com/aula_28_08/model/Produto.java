package main.java.com.aula_28_08.model;

import java.awt.Frame;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Produto {

	public static void main(String[] args) {
		String nome;
		double preço,total;
		int quantidade;
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		try {
			nome=JOptionPane.showInputDialog(frame,"Digite o nome do produto: ");
			preço=Double.parseDouble(JOptionPane.showInputDialog(frame,"Digite o preço do produto: ").replace(",","."));
			quantidade=Integer.parseInt(JOptionPane.showInputDialog(frame,"Digite a quantidade: "));
			total=quantidade*preço;
			DecimalFormat df=new DecimalFormat("#,###.00");
			if(quantidade==1){
				JOptionPane.showMessageDialog(frame,"O "+nome+" custa "+df.format(preço)+"R$, com um total de "+quantidade+" em estoque.");
			}else{
				JOptionPane.showMessageDialog(frame,"O produto '"+nome+"', possui uma quantidade de "+quantidade+" em estoque, com valor total de "+df.format(total)+"R$.");
			}
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame, "O valor do preço não é válido.");
		}
	}

}
