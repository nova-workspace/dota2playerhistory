package com.nova.buddipn.dota2playerhistory.domain.mapper;


import com.nova.buddipn.dota2playerhistory.domain.api.PlayerHistoryResponse;
import com.nova.buddipn.dota2playerhistory.domain.model.PlayerHistoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlayerHistoryResponseMapper {

    @Mapping(source = "playerHistory.playerName", target = "inGameName")
    @Mapping(source = "playerHistory.name", target = "name")
    @Mapping(source = "playerHistory.currentTeam", target = "currentTeam")
    @Mapping(source = "playerHistory.nationality", target = "nationality")
    @Mapping(source = "playerHistory.teamHistory", target = "teamHistory")
    PlayerHistoryResponse toPlayerHistoryResponse(PlayerHistoryEntity playerHistory);
}
