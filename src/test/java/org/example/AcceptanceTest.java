package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AcceptanceTest {

    @Test
    void twoToOne() {
        Set set = new Set(Player.ONE);
        set.addPoint(Player.ONE);
        set.addPoint(Player.TWO);
        set.addPoint(Player.ONE);

        assertThat(set.printScore()).isEqualTo("Server: ONE - Thirty Fifteen");
    }


    @Test
    void oneToOne() {
        Set set = new Set(Player.ONE);
        set.addPoint(Player.TWO);
        set.addPoint(Player.ONE);

        assertThat(set.printScore()).isEqualTo("Server: ONE - Fifteen Fifteen");
    }

    @Test
    void game() {
        Set set = new Set(Player.ONE);
        set.addPoint(Player.ONE);
        set.addPoint(Player.ONE);
        set.addPoint(Player.ONE);
        set.addPoint(Player.ONE);

        assertThat(set.printScore()).isEqualTo("Server: ONE - Game");
    }

    @Test
    void advantageServer() {
        Set set = new Set(Player.ONE);
        set.addPoint(Player.ONE);
        set.addPoint(Player.TWO);
        set.addPoint(Player.ONE);
        set.addPoint(Player.TWO);
        set.addPoint(Player.ONE);
        set.addPoint(Player.TWO);
        set.addPoint(Player.ONE);

        assertThat(set.printScore()).isEqualTo("Server: ONE - Advantage Server");
    }

    @Test
    void deuce() {
        Set set = new Set(Player.ONE);
        set.addPoint(Player.ONE);
        set.addPoint(Player.TWO);
        set.addPoint(Player.ONE);
        set.addPoint(Player.TWO);
        set.addPoint(Player.ONE);
        set.addPoint(Player.TWO);
        set.addPoint(Player.ONE);
        set.addPoint(Player.TWO);

        assertThat(set.printScore()).isEqualTo("Server: ONE - Deuce");
    }
}