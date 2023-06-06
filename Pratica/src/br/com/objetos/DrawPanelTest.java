package br.com.objetos;

import java.awt.Component;

import javax.swing.JFrame;

import br.com.classes.DrawPanel;

public class DrawPanelTest {

	public static void main(String[] args) {

		// cira um painel que contém nosso desenho
		Component panel = new DrawPanel();

		// cria um novo quadro para armazenar
		JFrame application = new Jframe();

		// configura o frame para ser encerrado quando ele é fechado
		application.setDefaultLookAndFeelDecorated(JFrame.EXIT_ON_CLOSE);

		application.add(panel); // adiciona o painel ao frame
		application.setSize(250, 250); // configura o tamanho do frame
		application.setVisible(true); // torna o frame visivel
	}

}
