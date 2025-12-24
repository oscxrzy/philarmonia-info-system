package com.example.filarmonic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.filarmonic.model.Concert;
import com.example.filarmonic.service.ConcertService;

/**
 * Controller for handling public pages such as the home page and concert
 * details. These pages are accessible without authentication.
 */
@Controller
public class HomeController {

    private final ConcertService concertService;

    @Autowired
    public HomeController(ConcertService concertService) {
        this.concertService = concertService;
    }

    /**
     * Display the home page with a list of all concerts.
     *
     * @param model the model to populate for Thymeleaf
     * @return the template name for the home page
     */
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("concerts", concertService.findAll());
        return "index";
    }

    /**
     * Display details for a specific concert.
     *
     * @param id the ID of the concert
     * @param model the model to populate for Thymeleaf
     * @return the template name for the concert details page
     */
    @GetMapping("/concerts/{id}")
    public String concertDetails(@PathVariable Long id, Model model) {
        Concert concert = concertService.findById(id);
        model.addAttribute("concert", concert);
        return "concert-details";
    }

    /**
     * Display a login page. This mapping is required by Spring Security to show
     * a custom login template instead of the default generated one.
     *
     * @return the login template name
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}