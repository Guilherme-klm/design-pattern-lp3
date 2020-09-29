package br.org.fundatec.lp3.designpatterns.service;

import br.org.fundatec.lp3.designpatterns.model.Personagem;

import java.util.Scanner;

public class CriaPersonagem {

    private PersonagemFactory personagemFactory;

    public CriaPersonagem(PersonagemFactory personagemFactory) {
        this.personagemFactory = personagemFactory;
    }

    public Personagem escolhePersonagem(Scanner scanner) throws Exception {
        Personagem personagem = personagemFactory.montaPersonagem(scanner);
        personagem.mostraArmasDisponiveis();
        personagem.escolheArmaUm(scanner);
        personagem.mostraArmasDisponiveis();
        personagem.escolheArmaDois(scanner);

        return personagem;
    }
}
