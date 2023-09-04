package com.basinger.secFootballPicksApp.controller;

import com.basinger.secFootballPicksApp.model.Game;
import com.basinger.secFootballPicksApp.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/games")
public class GameViewController {

    @Autowired
    private GameService gameService;

    @GetMapping("/week1")
    public String getWeek1Games(Model model) {
        List<Game> week1Games = gameService.getGamesByWeek(1);
        model.addAttribute("week1Games", week1Games);
        return "week1";
    }
}
