package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dtos.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository repository;

    public List<GameMinDto> findAll() {
        List<Game> list = repository.findAll();
        return list.stream().map(game -> new GameMinDto(game)).toList();
    }


}
