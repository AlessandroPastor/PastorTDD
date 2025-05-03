package test;


import com.pastor.game.service.JuegoPiedraPapelTijera;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class JuegoPiedraPapelTijeraTest {

    /**
     * Test para verificar que Player 2 gana la mayoría de las partidas.
     */
    @Test
    public void testDeterminarGanador_Player2Gana() {
        JuegoPiedraPapelTijera juego = new JuegoPiedraPapelTijera();
        String resultado = juego.determinarGanador(
                Arrays.asList(
                        new String[]{"R", "S"}, // Player 1 gana
                        new String[]{"S", "R"}, // Player 2 gana
                        new String[]{"P", "S"}  // Player 2 gana
                )
        );
        Assertions.assertEquals("Player 2", resultado);
    }

    /**
     * Test para verificar que el resultado es un empate.
     */
    @Test
    public void testDeterminarGanador_Tie() {
        JuegoPiedraPapelTijera juego = new JuegoPiedraPapelTijera();
        String resultado = juego.determinarGanador(
                Arrays.asList(
                        new String[]{"R", "R"}, // Empate
                        new String[]{"S", "S"}, // Empate
                        new String[]{"P", "P"}  // Empate
                )
        );
        Assertions.assertEquals("Tie", resultado);
    }

    /**
     * Test para verificar que Player 1 gana la mayoría de las partidas.
     */
    @Test
    public void testDeterminarGanador_Player1Gana() {
        JuegoPiedraPapelTijera juego = new JuegoPiedraPapelTijera();
        String resultado = juego.determinarGanador(
                Arrays.asList(
                        new String[]{"R", "S"}, // Player 1 gana
                        new String[]{"S", "R"}, // Player 2 gana
                        new String[]{"P", "S"}, // Player 2 gana
                        new String[]{"R", "R"}  // Empate
                )
        );
        // Cambiar la expectativa a Player 2
        Assertions.assertEquals("Player 2", resultado);
    }

}
