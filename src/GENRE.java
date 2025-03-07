// Create movie genres
let action = new Genre("Action");
let drama = new Genre("Drama");
let comedy = new Genre("Comedy");

// Create some movies
let movie1 = new Movie("Mad Max: Fury Road", "Action", 2015, 8.1);
let movie2 = new Movie("The Dark Knight", "Action", 2008, 9.0);
let movie3 = new Movie("The Shawshank Redemption", "Drama", 1994, 9.3);
let movie4 = new Movie("Inception", "Drama", 2010, 8.8);
let movie5 = new Movie("The Hangover", "Comedy", 2009, 7.7);
let movie6 = new Movie("Superbad", "Comedy", 2007, 8.0);

// Add movies to genres
action.addMovie(movie1);
action.addMovie(movie2);
drama.addMovie(movie3);
drama.addMovie(movie4);
comedy.addMovie(movie5);
comedy.addMovie(movie6);

// Store all genres in an array
let genres = [action, drama, comedy];
