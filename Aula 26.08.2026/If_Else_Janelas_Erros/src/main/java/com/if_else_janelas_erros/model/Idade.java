package main.java.com.if_else_janelas_erros.model;

import java.awt.Frame;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

public class Idade {

	public static void main(String[] args) {
		Frame frame=new Frame();
		frame.setAlwaysOnTop(true);
		DateTimeFormatter formatador=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String datas;
		try {
			datas=JOptionPane.showInputDialog(frame,"Digite a data do seu aniversário:");
			LocalDate dataaniv=LocalDate.parse(datas, formatador);
			LocalDate hoje=LocalDate.now();
			Period periodo=Period.between(dataaniv, hoje);
			JOptionPane.showMessageDialog(frame,"Você tem "+periodo.getYears()+" anos, "+periodo.getMonths()+" mês/meses e " 
			+periodo.getDays()+" dias de vida.");
		}catch (DateTimeParseException e) {
			JOptionPane.showMessageDialog(frame,"A data digitada não é uma data dd/mm/aaaa!");
		}
	}

}