/* package com.example.MovieRecommendation;

import com.example.MovieRecommendation.service.MovieTitleGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MovieRecommendationController {

    private static final Map<String, String> genreRecommendations = new HashMap<>();

    static {
        genreRecommendations.put("comedy", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("comedy") +
                "! Your stomach will hurt from laughing!");
        genreRecommendations.put("action", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("action") + "!");
        genreRecommendations.put("horror", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("horror") +
                "! Don't get too scared!");
        genreRecommendations.put("sci-fi", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("sci-fi") + "!");
        genreRecommendations.put("scifi", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("sci-fi") + "!");
        genreRecommendations.put("romance", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("romance") + "!");
        genreRecommendations.put("docudrama", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("docudrama") + "!");
        genreRecommendations.put("crime", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("crime") + "!");
        genreRecommendations.put("mystery", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("mystery") +
                "! Good luck figuring this one out.");
        genreRecommendations.put("thriller", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("thriller") +
                "! This one blew my mind.");
        genreRecommendations.put("fantasy", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("fantasy") + "!");
        genreRecommendations.put("war", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("war") + "!");
    }

    @GetMapping("/recommend")
    public String recommend(@RequestParam String genre) {
        String recommendation = genreRecommendations.get(genre.toLowerCase());
        return recommendation != null ? recommendation : "Sorry, we don't have recommendations for that genre.";
    }
} */
package com.example.MovieRecommendation;

import com.example.MovieRecommendation.service.MovieTitleGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MovieRecommendationController {

    private static final Map<String, String> genreRecommendations = new HashMap<>();

    static {
        genreRecommendations.put("comedy", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("comedy") +
                "! Your stomach will hurt from laughing!");
        genreRecommendations.put("action", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("action") + "!");
        genreRecommendations.put("horror", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("horror") +
                "! Don't get too scared!");
        genreRecommendations.put("sci-fi", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("sci-fi") + "!");
        genreRecommendations.put("scifi", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("sci-fi") + "!");
        genreRecommendations.put("romance", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("romance") + "!");
        genreRecommendations.put("docudrama", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("docudrama") + "!");
        genreRecommendations.put("crime", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("crime") + "!");
        genreRecommendations.put("mystery", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("mystery") +
                "! Good luck figuring this one out.");
        genreRecommendations.put("thriller", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("thriller") +
                "! This one blew my mind.");
        genreRecommendations.put("fantasy", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("fantasy") + "!");
        genreRecommendations.put("war", "Ale Recommends " + MovieTitleGenerator.getRandomMovieTitle("war") + "!");
    }

    @GetMapping("/")
    public String home() {
        return "index"; // The name of your main HTML file without the extension
    }

    @GetMapping("/recommend")
    public String recommend(@RequestParam String genre, Model model) {
        String recommendation = genreRecommendations.get(genre.toLowerCase());
        model.addAttribute("recommendation", recommendation != null ? recommendation : "Sorry, we don't have recommendations for that genre.");
        return "recommendation"; // The name of the HTML file to display the recommendation
    }
}