package com.nova.buddipn.dota2playerhistory.repository;


import com.nova.buddipn.dota2playerhistory.domain.model.PlayerHistoryEntity;

public interface PlayerHistoryRepository {

    PlayerHistoryEntity findByPlayerName(String playerName);

}
