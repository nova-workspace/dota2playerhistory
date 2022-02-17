package com.nova.buddipn.dota2playerhistory.repository.impl;

import com.nova.buddipn.dota2playerhistory.domain.model.PlayerHistoryEntity;
import com.nova.buddipn.dota2playerhistory.repository.PlayerHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerHistoryRepositoryImpl implements PlayerHistoryRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public PlayerHistoryEntity findByPlayerName(String playerName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("playerName").is(playerName));
        return mongoTemplate.findOne(query, PlayerHistoryEntity.class);
    }

}
