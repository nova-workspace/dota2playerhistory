package com.nova.buddipn.dota2playerhistory.domain.model;


import com.nova.buddipn.dota2playerhistory.domain.api.TeamHistoryDto;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "dota2_team_history")
public class PlayerHistoryEntity {

    String playerName;

    String name;

    List<String> nationality;

    String currentTeam;

    List<TeamHistoryDto> teamHistory;
}
