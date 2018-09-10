package com.jen.soccer.trader.api;

import com.jen.soccer.trader.model.domain.Analytics;
import com.jen.soccer.trader.model.rest.provided.TeamsItem;
import com.jen.soccer.trader.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TeamsRestController {

    @Autowired
    TeamsService teamService;

    @GetMapping("/teams")
    @ResponseBody
    public List<TeamsItem> findTeam(@RequestParam(name = "name") String name) {
        return teamService.findTeamsByName(name);
    }

    @GetMapping("/teams/{id}")
    @ResponseBody
    public Analytics getTeamANalystics(@PathVariable(name = "id") int id) {
        Analytics result = new Analytics(teamService.findMatchesOfTeamById(id));
        return result;
    }
}
