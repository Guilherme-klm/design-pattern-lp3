package br.org.fundatec.lp3.designpatterns;

import br.org.fundatec.lp3.designpatterns.model.Personagem;
import br.org.fundatec.lp3.designpatterns.service.CriaPersonagem;
import br.org.fundatec.lp3.designpatterns.service.Ringue;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		CriaPersonagem criaPersonagem = new CriaPersonagem();
		Ringue ringue = new Ringue();
		Scanner scanner = new Scanner(System.in);

		System.out.println("|-- Batalha de personagens --|");
		System.out.println("> Escolha o primeiro personagem: 1 - Elfo 2 - Orc");
		Personagem personagem1 = criaPersonagem.escolhePersonagem(scanner);
		System.out.println("> Escolha o segundo personagem: 1 - Elfo 2 - Orc");
		Personagem personagem2 = criaPersonagem.escolhePersonagem(scanner);
		ringue.luta(personagem1, personagem2);
	}
}
