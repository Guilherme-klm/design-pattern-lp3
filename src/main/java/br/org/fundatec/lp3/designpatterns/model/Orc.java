package br.org.fundatec.lp3.designpatterns.model;

import br.org.fundatec.lp3.designpatterns.arma.EspadaOrc;
import br.org.fundatec.lp3.designpatterns.arma.Machado;
import br.org.fundatec.lp3.designpatterns.arma.Martelo;
import br.org.fundatec.lp3.designpatterns.arma.PunhalOrc;
import br.org.fundatec.lp3.designpatterns.type.TipoArma;
import br.org.fundatec.lp3.designpatterns.type.TipoPersonagem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Orc extends Personagem {

	public Orc() {

		armasDisponiveis = new ArrayList<>();
		armasDisponiveis.add(TipoArma.MACHADO);
		armasDisponiveis.add(TipoArma.MARTELO);
		armasDisponiveis.add(TipoArma.PUNHAL);
		armasDisponiveis.add(TipoArma.ESPADA);

	}

	@Override
	public TipoPersonagem getTipoPersonagem() {
		return TipoPersonagem.ORC;
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
			case 3:
				setPrimeiraArma(new Machado());
				break;
			case 4:
				setPrimeiraArma(new Martelo());
				break;
			case 1:
				setPrimeiraArma(new PunhalOrc());
				break;
			case 2:
				setPrimeiraArma(new EspadaOrc());
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
			case 3:
				setSegundaArma(new Machado());
				break;
			case 4:
				setSegundaArma(new Martelo());
				break;
			case 1:
				setSegundaArma(new PunhalOrc());
				break;
			case 2:
				setSegundaArma(new EspadaOrc());
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
