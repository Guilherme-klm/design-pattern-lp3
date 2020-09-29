package br.org.fundatec.lp3.designpatterns.model;

import br.org.fundatec.lp3.designpatterns.arma.*;
import br.org.fundatec.lp3.designpatterns.type.TipoArma;
import br.org.fundatec.lp3.designpatterns.type.TipoPersonagem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static br.org.fundatec.lp3.designpatterns.type.TipoArma.*;

public class Elfo extends Personagem {

	public Elfo() {

		armasDisponiveis = new ArrayList<>();
		armasDisponiveis.add(ARCOEFLECHA);
		armasDisponiveis.add(PUNHAL);
		armasDisponiveis.add(PUNHALDUPLO);
		armasDisponiveis.add(ESPADA);

	}

	@Override
	public TipoPersonagem getTipoPersonagem() {
		return TipoPersonagem.ELFO;
	}

	@Override
	public void mostraArmasDisponiveis() {
		for (TipoArma tipoArma : tiposDeArmaDisponiveis()) {
			System.out.println(tipoArma.getOpcao() + " - " + tipoArma.getTitulo() + " ");
		}
	}

	@Override
	public void escolheArmaUm(Scanner scanner) throws Exception {
		System.out.println("> Primeira Arma: ");
		int opcao = scanner.nextInt();

		switch (opcao) {
			case 5:
				setPrimeiraArma(new ArcoEFlecha());
				break;
			case 2:
				setPrimeiraArma(new EspadaElfo());
				break;
			case 1:
				setPrimeiraArma(new PunhalElfo());
				break;
			case 6:
				setPrimeiraArma(new PunhalDuplo());
				break;
			default:
				throw new Exception("Opção inválida");
		}
	}

	@Override
	public void escolheArmaDois(Scanner scanner) throws Exception {
		System.out.println("> Segunda Arma: ");
		int opcao = scanner.nextInt();

		switch (opcao) {
			case 5:
				setSegundaArma(new ArcoEFlecha());
				break;
			case 1:
				setSegundaArma(new PunhalElfo());
				break;
			case 6:
				setSegundaArma(new PunhalDuplo());
				break;
			case 2:
				setSegundaArma(new EspadaElfo());
				break;
			default:
				throw new Exception("Opção inválida");
		}
	}

	@Override
	public List<TipoArma> tiposDeArmaDisponiveis() {
		return armasDisponiveis;
	}

}
