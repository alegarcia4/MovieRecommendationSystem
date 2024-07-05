package com.example.MovieRecommendation.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MovieTitleGenerator { //List of Movie titles and the genres correlated
    private static final Random random = new Random();
    private static final Map<String, String[]> movieTitles = new HashMap<>();

    static {
        movieTitles.put("action", new String[]{"John Wick", "John Wick 2", "John Wick 3", "The Meg", "Gladiator",
                "The Dark Knight", "Inception", "Mad Max: Fury Road", "The Bourne Identity", "Kill Bill: Volume 1",
                "The Raid: Redemption", "John Wick", "The Avengers", "Mission: Impossible - Fallout", "Black Panther",
                "Skyfall", "The Matrix Reloaded", "Wonder Woman", "Fast Five", "Spider-Man: Into the Spider-Verse",
                "Edge of Tomorrow", "Avatar", "Captain America: The Winter Soldier", "Logan"});
        movieTitles.put("horror", new String[]{"Hereditary", "It", "The Ring", "The Conjuring", "Get Out",
                "Hereditary", "Paranormal Activity", "The Babadook", "A Quiet Place", "It Follows", "Sinister",
                "The Descent", "28 Days Later", "Insidious", "The Witch", "Saw", "The Others", "Midsommar",
                "The Grudge", "Annabelle", "Train to Busan", "The Conjuring 2"});
        movieTitles.put("romance", new String[]{"Titanic", "Just Go With It", "No Hard Feelings", "Puppy Love",
                "La La Land", "The Notebook", "Eternal Sunshine of the Spotless Mind", "500 Days of Summer",
                "The Fault in Our Stars", "Pride & Prejudice", "Crazy, Stupid, Love", "Before Sunrise",
                "Silver Linings Playbook", "Atonement", "Love Actually", "The Proposal", "Blue Valentine",
                "About Time", "The Shape of Water", "Titanic", "La La Land", "A Walk to Remember",
                "The Theory of Everything", "The Vow"});
        movieTitles.put("sci-fi", new String[]{"Interstellar", "Annihilation (2018)", "Arrival", "Life", "Blade Runner 2049", "The Matrix",
                "Inception", "Avatar", "Arrival", "Ex Machina", "District 9", "The Martian",
                "Eternal Sunshine of the Spotless Mind", "Gravity", "Looper", "Edge of Tomorrow",
                "Minority Report", "Children of Men", "The Fifth Element", "Star Wars: The Force Awakens",
                "Her", "Moon", "Mad Max: Fury Road"});
        movieTitles.put("docudrama", new String[]{"Wolf of Wall Street", "War Dogs", "Argo", "The Social Network",
                "Spotlight", "12 Years a Slave", "The King's Speech", "The Big Short", "A Beautiful Mind",
                "The Pursuit of Happyness", "Dallas Buyers Club", "Bohemian Rhapsody", "The Imitation Game",
                "Catch Me If You Can", "Hidden Figures", "The Theory of Everything", "Into the Wild",
                "BlacKkKlansman", "Milk", "The Revenant", "Rocketman", "Ford v Ferrari"});
        movieTitles.put("crime", new String[]{"Ocean's Eleven", "The Departed", "No Country for Old Men", "Prisoners",
                "Heat", "Zodiac", "Gone Girl", "Drive", "The Town", "Training Day", "Sicario", "True Grit",
                "Mystic River", "A History of Violence", "Hell or High Water", "The Irishman", "Eastern Promises",
                "Wind River", "The Place Beyond the Pines", "The Girl with the Dragon Tattoo"});
        movieTitles.put("mystery", new String[]{"Inception", "Shutter Island", "Gone Girl", "Prisoners",
                "The Girl with the Dragon Tattoo", "Knives Out", "Memento", "Zodiac", "The Prestige", "The Others",
                "Sherlock Holmes", "Gone Baby Gone", "The Da Vinci Code", "The Secret in Their Eyes",
                "The Invisible Guest", "Memories of Murder", "Enemy", "The Sixth Sense", "The Nice Guys",
                "Oldboy", "Mystic River"});
        movieTitles.put("war", new String[]{"War Dogs", "American Sniper", "Saving Private Ryan", "Dunkirk", "1917",
                "Black Hawk Down", "The Hurt Locker", "Zero Dark Thirty", "Lone Survivor", "American Sniper", "Fury",
                "Letters from Iwo Jima", "Hacksaw Ridge", "War Horse", "Jarhead", "Beasts of No Nation",
                "The Thin Red Line", "The Pianist", "We Were Soldiers", "Tears of the Sun", "Flags of Our Fathers",
                "Inglourious Basterds"});
        movieTitles.put("thriller", new String[]{"War Dogs", "American Sniper", "Se7en", "Prisoners", "Gone Girl",
                "The Prestige", "No Country for Old Men", "Shutter Island", "The Girl with the Dragon Tattoo",
                "The Departed", "Zodiac", "Memento", "Black Swan", "The Bourne Identity", "The Silence of the Lambs",
                "Heat", "Taken", "Inception", "Nightcrawler", "Eastern Promises", "Donnie Darko", "The Sixth Sense"});
        movieTitles.put("fantasy", new String[]{
                "Harry Potter and the Sorcerer's Stone", "Harry Potter and the Chamber of Secrets",
                "Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire",
                "Harry Potter and the Order of Phoenix", "Harry Potter and the Half-Blood Prince",
                "Harry Potter and the Deathly Hallows", "The Meg", "The Lord of the Rings: The Fellowship of the Ring",
                "Pan's Labyrinth", "The Chronicles of Narnia: The Lion, the Witch and the Wardrobe", "Avatar",
                "Stardust", "The Shape of Water", "The Hobbit: An Unexpected Journey",
                "Pirates of the Caribbean: The Curse of the Black Pearl", "Edward Scissorhands",
                "The Imaginarium of Doctor Parnassus", "Alice in Wonderland", "Coraline", "The Spiderwick Chronicles",
                "Big Fish", "Bridge to Terabithia", "The Golden Compass", "Beetlejuice", "Maleficent"});
        movieTitles.put("comedy", new String[]{
                "The 40-Year-Old Virgin", "Friday", "Rush Hour", "Rush Hour 2", "Rush Hour 3",
                "Pineapple Express", "Superbad", "Ride Along", "Ride Along 2", "Get Hard", "Grown Ups",
                "This Is the End", "Grown Ups 2", "21 Jump Street", "22 Jump Street", "Hall Pass",
                "The Hangover", "Napoleon Dynamite", "Why Him?", "Neighbors", "Let’s Be Cops",
                "Daddy’s Home", "Scary Movie", "Big Time Adolescence", "Kick-Ass", "Paul Blart: Mall Cop",
                "Observe and Report", "Harold & Kumar Go to White Castle",
                "Harold & Kumar Escape from Guantanamo Bay"});
    }

    public static String getRandomMovieTitle(String genre) {
        String[] titles = movieTitles.get(genre.toLowerCase());
        if (titles != null && titles.length > 0) {
            int randomIndex = random.nextInt(titles.length);
            return titles[randomIndex];
        }
        return "No recommendations available for this genre.";
    }
}
