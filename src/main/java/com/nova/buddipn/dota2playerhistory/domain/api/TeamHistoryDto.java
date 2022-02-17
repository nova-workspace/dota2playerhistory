package com.nova.buddipn.dota2playerhistory.domain.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
@AllArgsConstructor
public class TeamHistoryDto {
    String teamName;

    String fromDate;

    String toDate;
}
