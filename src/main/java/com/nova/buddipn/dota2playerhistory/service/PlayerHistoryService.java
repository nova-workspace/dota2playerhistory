package com.nova.buddipn.dota2playerhistory.service;


import com.nova.buddipn.dota2playerhistory.domain.api.PlayerHistoryResponse;

public interface PlayerHistoryService {

    public PlayerHistoryResponse getPlayerHistory(String playerName);
}
