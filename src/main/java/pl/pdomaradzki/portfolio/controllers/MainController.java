package pl.pdomaradzki.portfolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.pdomaradzki.portfolio.ProjectRepository;

/**
 * Created by jaizm on 10/06/2017.
 */

@Controller
public class MainController {

    @Autowired
    ProjectRepository projectRepository;

    @RequestMapping("/")
            public String index(Model model) {

        model.addAttribute("projects", projectRepository.findAll());

        return "index";
    }
}
