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
        return "Server: %s - %s".formatted(server.name(), format());
    }

    private String format() {
        if (regularScore()) {
            return formatScore(serverScore) + " " + formatScore(receiverScore);
        } else if (deuce()) {
            return "Deuce";
        } else if (game()) {
            return "Game";
        }
        return "Advantage %s".formatted(serverScore > receiverScore ? "Server" : "Receiver");
    }

    private boolean game() {
        return Math.abs(serverScore - receiverScore) >= 2;
    }

    private boolean deuce() {
        return serverScore == receiverScore;
    }

    private boolean regularScore() {
        return serverScore < 4 && receiverScore < 4;
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
