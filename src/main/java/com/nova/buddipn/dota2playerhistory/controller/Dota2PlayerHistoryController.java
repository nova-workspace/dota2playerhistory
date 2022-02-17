package com.nova.buddipn.dota2playerhistory.controller;


import com.nova.buddipn.dota2playerhistory.domain.api.PlayerHistoryResponse;
import com.nova.buddipn.dota2playerhistory.exception.PlayerNotFoundException;
import com.nova.buddipn.dota2playerhistory.service.PlayerHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class Dota2PlayerHistoryController {

    @Autowired
    @Qualifier("playerHistoryService")
    private PlayerHistoryService service;

    @GetMapping(value = "/player/{playerName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PlayerHistoryResponse getPlayerHistory(
            @PathVariable(value = "playerName") String playerName) {

        PlayerHistoryResponse response = service.getPlayerHistory(playerName);

        if (response == null || ObjectUtils.isEmpty(response)) {
            log.error("Player History not found for player: {}", playerName);
            throw new PlayerNotFoundException(playerName);
        }
        return response;
    }
}
