package br.org.fundatec.lp3.designpatterns.service;

import br.org.fundatec.lp3.designpatterns.model.Elfo;
import br.org.fundatec.lp3.designpatterns.model.Orc;
import br.org.fundatec.lp3.designpatterns.model.Personagem;
import java.util.Scanner;

public class CriaPersonagem {

    public Personagem escolhePersonagem(Scanner scanner) throws Exception {
        Personagem personagem = montaPersonagem(scanner);
        personagem.mostraArmasDisponiveis();
        personagem.escolheArmaUm(scanner);
        personagem.mostraArmasDisponiveis();
        personagem.escolheArmaDois(scanner);

        return personagem;
    }

    public Personagem montaPersonagem(Scanner scanner) {
        System.out.print("> ");
        int opcaoPersonagem = scanner.nextInt();

        switch (opcaoPersonagem) {
            case 1:
                return new Elfo();
            case 2:
                return new Orc();
            default:
                return null;
        }
    }
}
