package com.basinger.secFootballPicksApp.controller;

import com.basinger.secFootballPicksApp.model.Game;
import com.basinger.secFootballPicksApp.model.Pick;
import com.basinger.secFootballPicksApp.model.PickForm;
import com.basinger.secFootballPicksApp.service.GameService;
import com.basinger.secFootballPicksApp.service.PickService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class PickViewController {

    @Autowired
    private GameService gameService;

    @Autowired
    private PickService pickService;

    @GetMapping("/week1")
    public String getWeek1Games(Model model) {
        List<Game> week1Games = gameService.getGamesByWeek(1);
        PickForm pickForm = new PickForm();
        pickForm.setWeekOnePicks(new ArrayList<>());

        for(Game game : week1Games) {
            Pick pick = new Pick();
            pick.setGame(game);
            pickForm.getWeekOnePicks().add(pick);
        }

        model.addAttribute("week1Games", week1Games);
        model.addAttribute("pickForm", pickForm);
        return "week1";
    }

/*    @PostMapping("/submitPicks")
    public String submitPicks(@ModelAttribute PickForm pickForm) {
        // handle the form submission
        // save the picks to the database using a service
        return "redirect:/somePage";  // redirect to a different page after saving picks
    }*/

    @PostMapping("/submitPicks")
    public String submitWeek1Picks(@ModelAttribute PickForm pickForm, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "week1"; // go back to the form if there are errors
        }

        List<Pick> submittedPicks = pickForm.getWeekOnePicks();

        // Add logic to save these picks using PickService
        pickService.saveAll(submittedPicks);

        return "redirect:/success";  // redirect to a success page
    }






}
