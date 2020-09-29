package br.org.fundatec.lp3.designpatterns.model;

import br.org.fundatec.lp3.designpatterns.arma.Arma;
import br.org.fundatec.lp3.designpatterns.type.TipoArma;
import br.org.fundatec.lp3.designpatterns.type.TipoPersonagem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Personagem {

	protected List<TipoArma> armasDisponiveis;
	protected Arma primeiraArma;
	protected Arma segundaArma;
	protected Arma ultimaArmaUsada;
	protected Integer vida;

	public Personagem() {
		vida = 100;
		armasDisponiveis = new ArrayList<>();
	}

	public abstract List<TipoArma> tiposDeArmaDisponiveis();

	public abstract TipoPersonagem getTipoPersonagem();

	public abstract void mostraArmasDisponiveis();

	public abstract void escolheArmaUm(Scanner scanner) throws Exception;

	public abstract void escolheArmaDois(Scanner scanner) throws Exception;

	public void setPrimeiraArma(Arma primeiraArma) {
		this.primeiraArma = primeiraArma;
	}

	public void setSegundaArma(Arma segundaArma) {
		this.segundaArma = segundaArma;
	}

	public Arma getPrimeiraArma() {
		return primeiraArma;
	}

	public Arma getSegundaArma() {
		return segundaArma;
	}

	public int getVida() {
		return vida;
	}

	public int atacar(Personagem personagem) {

		if (ultimaArmaUsada == null || ultimaArmaUsada.equals(primeiraArma)) {
			personagem.sofrerDano(segundaArma.getDano());
			ultimaArmaUsada = segundaArma;
		} else {
			personagem.sofrerDano(primeiraArma.getDano());
			ultimaArmaUsada = primeiraArma;
		}

		return ultimaArmaUsada.getDano();

	}

	public Arma getUltimaArma() {
		return ultimaArmaUsada;
	}

	public void sofrerDano(int dano) {

		if (dano > vida) {
			vida = 0;
		} else {
			vida -= dano;
		}

	}

	public String toString() {

		String msg = "Personagem: %s, Primeira arma: %s, Segunda arma: %s";
		return String.format(msg, getTipoPersonagem().name(), getPrimeiraArma().toString(),
				getSegundaArma().toString());
	}

}
