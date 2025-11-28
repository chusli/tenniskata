package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AcceptanceTest {

    @Test
    void name() {
        Set set = new Set(Player.ONE);
        set.addPoint(Player.ONE);
        set.addPoint(Player.TWO);
        set.addPoint(Player.ONE);

        assertThat(set.printScore()).isEqualTo("Server: ONE - Thirty - Fifteen");
    }
}