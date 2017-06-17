package pl.pdomaradzki.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.pdomaradzki.portfolio.InfoRepository;
import pl.pdomaradzki.portfolio.ProjectRepository;
import pl.pdomaradzki.portfolio.models.Info;

import java.util.List;

/**
 * Created by jaizm on 10/06/2017.
 */

@Controller
public class MainController {

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    InfoRepository infoRepository;

    @RequestMapping("/")
            public String index(Model model) {

        model.addAttribute("projects", projectRepository.findAll());
        model.addAttribute("infos", infoRepository.findOne(2));

        return "index";
    }

}
