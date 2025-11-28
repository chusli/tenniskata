package org.example;

public class Set {
    private final Player server;

    public Set(Player server) {
        this.server = server;
    }

    public void addPoint(Player player) {
    }

    public String printScore() {
        return "Server: %s - %s - %s".formatted(server.name(), "Thirty", "Fifteen");
    }
}
