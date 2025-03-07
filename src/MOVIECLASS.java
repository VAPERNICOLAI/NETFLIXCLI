// Movie class to define individual movies
class Movie {
    constructor(title, genre, year, rating) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    display() {
        return `${this.title} (${this.year}) - Genre: ${this.genre}, Rating: ${this.rating}/10`;
    }
}

// Genre class to define genres
class Genre {
    constructor(name) {
        this.name = name;
        this.movies = [];
    }

    addMovie(movie) {
        this.movies.push(movie);
    }

    displayMovies() {
        if (this.movies.length === 0) {
            console.log(`No movies available in ${this.name} genre.`);
        } else {
            console.log(`Movies in ${this.name} genre:`);
            this.movies.forEach((movie, index) => {
                console.log(`${index + 1}. ${movie.display()}`);
            });
        }
    }
}
