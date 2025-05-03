package com.pastor.game.service;

import java.util.List;

/**
 * Clase para determinar el ganador en un juego de Piedra, Papel o Tijera.
 */
public class JuegoPiedraPapelTijera {

    /**
     * Determina quién ganó más partidas entre Player 1 y Player 2.
     *
     * @param partidas Lista de partidas, donde cada partida es un par de jugadas.
     * @return "Player 1" si gana el jugador 1, "Player 2" si gana el jugador 2, "Tie" si empatan.
     */
    public String determinarGanador(List<String[]> partidas) {
        int jugador1 = 0;
        int jugador2 = 0;

        // Itera sobre todas las partidas
        for (String[] partida : partidas) {
            String jugador1Jugada = partida[0];
            String jugador2Jugada = partida[1];

            // Determina el ganador de cada partida
            if (esGanador(jugador1Jugada, jugador2Jugada)) {
                jugador1++;
            } else if (esGanador(jugador2Jugada, jugador1Jugada)) {
                jugador2++;
            }
        }

        // Devuelve el resultado final
        if (jugador1 > jugador2) {
            return "Player 1";
        } else if (jugador2 > jugador1) {
            return "Player 2";
        } else {
            return "Tie";
        }
    }

    /**
     * Determina si la jugada 1 gana sobre la jugada 2.
     *
     * @param jugada1 La jugada del primer jugador.
     * @param jugada2 La jugada del segundo jugador.
     * @return true si la jugada1 gana sobre la jugada2.
     */
    private boolean esGanador(String jugada1, String jugada2) {
        return (jugada1.equals("R") && jugada2.equals("S")) ||   // Piedra vence Tijera
                (jugada1.equals("S") && jugada2.equals("P")) ||   // Tijera vence Papel
                (jugada1.equals("P") && jugada2.equals("R"));     // Papel vence Piedra
    }
}
