package com.example.MovieRecommendation;

import com.example.MovieRecommendation.service.MovieTitleGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MovieRecommendationController {

    @GetMapping("/")
    public String home() {
        return "index"; // The name of your main HTML file without the extension
    }

    //changed from a hashmap
    @GetMapping("/recommend")
    public String recommend(@RequestParam String genre, Model model) {
        String movieTitle = MovieTitleGenerator.getRandomMovieTitle(genre.toLowerCase());
        String recommendation = "Ale Recommends " + movieTitle;

        switch (genre.toLowerCase()) {
            case "comedy":
                recommendation += "! Your stomach will hurt from laughing!";
                break;
            case "action":
                recommendation += "!";
                break;
            case "horror":
                recommendation += "! Don't get too scared!";
                break;
            case "sci-fi":
            case "scifi":
                recommendation += "!";
                break;
            case "romance":
                recommendation += "!";
                break;
            case "docudrama":
                recommendation += "!";
                break;
            case "crime":
                recommendation += "!";
                break;
            case "mystery":
                recommendation += "! Good luck figuring this one out.";
                break;
            case "thriller":
                recommendation += "! This one blew my mind.";
                break;
            case "fantasy":
                recommendation += "!";
                break;
            case "war":
                recommendation += "!";
                break;
            default:
                recommendation = "Sorry, we don't have recommendations for that genre.";
                break;
        }

        model.addAttribute("recommendation", recommendation);
        return "recommendation"; // The name of the HTML file to display the recommendation
    }
}
