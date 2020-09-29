package br.org.fundatec.lp3.designpatterns.mensagem;

import br.org.fundatec.lp3.designpatterns.model.Personagem;

public class MensagensRingue {

    public static void imprimirGanhador(Personagem personagem1, Personagem personagem2) {
        if (personagem1.getVida() > 0) {
            System.out.println(personagem1.getTipoPersonagem().name() + " venceu!");
        } else {
            System.out.println(personagem2.getTipoPersonagem().name() + " venceu!");
        }
    }

    public static void imprimirMensagemDeAtaque(Personagem atacante, Personagem atacado, int dano) {
        System.out.println(String.format(
                "> %s ataca %s com %s! Dano: %d",
                atacante.getTipoPersonagem().name(),
                atacado.getTipoPersonagem().name(),
                atacante.getUltimaArma().toString(),
                dano
        ));
    }

    public static void imprimirPlacar(Personagem personagem1, Personagem personagem2) {
        System.out.println(String.format(
                "> %s %d x %d %s",
                personagem1.getTipoPersonagem().name(),
                personagem1.getVida(),
                personagem2.getVida(),
                personagem2.getTipoPersonagem().name()
        ));
    }
}
