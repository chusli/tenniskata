package org.example;

public class Set {

    private final Player server;

    private int serverScore = 0;

    private int receiverScore = 0;

    public Set(Player server) {
        this.server = server;

    }

    public void addPoint(Player player) {
        if (player.equals(server)) {
            serverScore += 1;
        } else {
            receiverScore += 1;
        }
    }

    public String printScore() {
        return "Server: %s - %s - %s".formatted(server.name(), formatScore(serverScore), formatScore(receiverScore));
    }

    private String formatScore(int score) {
        return switch (score) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> throw new IllegalArgumentException("unknown score " + score);
        };
    }


}
