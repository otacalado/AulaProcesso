package view;

import java.util.Properties;
import java.util.Set;

import javax.swing.JOptionPane;

import controller.Proc;

public class Principal {

	public static void main(String[] args) {

		Proc p = new Proc();
		 String os = p.os();
		 System.out.println(os);
		// p.propriedades();
		// String caminho = "TASKLIST.EXE /FO TABLE";
		// p.chamaProcesso(caminho);
		// p.leProcesso(caminho);
		//String processo ="notepad.exe";
		//p.mataProcessor(processo);

	}

}

// set nao pode ter duplicados list pode. 