package com.example.filarmonic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.filarmonic.model.Concert;
import com.example.filarmonic.service.ConcertService;

/**
 * Controller for administrative functions. Only users with the ADMIN role can
 * access these endpoints. This example allows creation of new concerts.
 */
@Controller
public class AdminController {

    private final ConcertService concertService;

    @Autowired
    public AdminController(ConcertService concertService) {
        this.concertService = concertService;
    }

    /**
     * Display a form for creating a new concert.
     *
     * @param model the model for Thymeleaf
     * @return the template for the form
     */
    @GetMapping("/admin/new-concert")
    public String showCreateConcertForm(Model model) {
        model.addAttribute("concert", new Concert());
        return "admin/new-concert";
    }

    /**
     * Handle submission of the new concert form.
     *
     * @param concert the concert to save
     * @return redirect to home page after saving
     */
    @PostMapping("/admin/new-concert")
    public String createConcert(@ModelAttribute Concert concert) {
        concertService.save(concert);
        return "redirect:/";
    }
}