package com.nova.buddipn.dota2playerhistory.exception;

public class PlayerNotFoundException extends RuntimeException {
    public PlayerNotFoundException(String playerName) {
        super("Player name: " + playerName + " is NOT FOUND");
    }
}
