package com.nova.buddipn.dota2playerhistory.service.impl;

import com.nova.buddipn.dota2playerhistory.domain.api.PlayerHistoryResponse;
import com.nova.buddipn.dota2playerhistory.domain.mapper.PlayerHistoryResponseMapper;
import com.nova.buddipn.dota2playerhistory.domain.model.PlayerHistoryEntity;
import com.nova.buddipn.dota2playerhistory.repository.PlayerHistoryRepository;
import com.nova.buddipn.dota2playerhistory.service.PlayerHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service("playerHistoryService")
public class PlayerHistoryServiceImpl implements PlayerHistoryService {

    @Autowired
    private final PlayerHistoryRepository playerHistoryRepository;

    private final PlayerHistoryResponseMapper playerHistoryResponseMapper;

    public PlayerHistoryServiceImpl(
            PlayerHistoryRepository playerHistoryRepository,
            PlayerHistoryResponseMapper playerHistoryResponseMapper) {
        this.playerHistoryRepository = playerHistoryRepository;
        this.playerHistoryResponseMapper = playerHistoryResponseMapper;
    }

    @Override
    public PlayerHistoryResponse getPlayerHistory(String playerName) {

        log.info("Finding {}'s team history.", playerName);

        return mapResponse(playerHistoryRepository.findByPlayerName(playerName));
    }

    private PlayerHistoryResponse mapResponse(PlayerHistoryEntity playerHistory) {
        return playerHistoryResponseMapper.toPlayerHistoryResponse(playerHistory);
    }
}
