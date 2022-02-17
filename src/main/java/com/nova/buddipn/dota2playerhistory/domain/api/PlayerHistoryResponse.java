package com.nova.buddipn.dota2playerhistory.domain.api;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class PlayerHistoryResponse {
    String name;
    String inGameName;
    List<String> nationality;
    String currentTeam;
    List<TeamHistoryDto> teamHistory;
}
