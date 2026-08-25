package main.java.com.if_else_janelas_erros.model;

import java.awt.Frame;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Idade {

	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		DateTimeFormatter formatador=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String datas;
		try {
			datas=JOptionPane.showInputDialog(frame,"Digite a data do seu aniversário:");
		}
	}

}
