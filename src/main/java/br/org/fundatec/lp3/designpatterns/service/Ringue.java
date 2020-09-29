package br.org.fundatec.lp3.designpatterns.service;

import br.org.fundatec.lp3.designpatterns.model.Personagem;

import static br.org.fundatec.lp3.designpatterns.mensagem.MensagensRingue.*;

public class Ringue {

    public void luta (Personagem personagem1, Personagem personagem2) {
        int turno = 1;
        Personagem atacante = personagem1;
        Personagem atacado = personagem2;
        int dano;

        do {
            imprimirPlacar(personagem1, personagem2);
            dano = atacante.atacar(atacado);
            imprimirMensagemDeAtaque(atacante, atacado, dano);

            if (turno == 1) {
                atacante = personagem2;
                atacado = personagem1;
                turno = 2;
            } else {
                atacante = personagem1;
                atacado = personagem2;
                turno = 1;
            }

        } while (personagem1.getVida() > 0 && personagem2.getVida() > 0);

        imprimirPlacar(personagem1, personagem2);
        imprimirGanhador(personagem1, personagem2);
    }

}
