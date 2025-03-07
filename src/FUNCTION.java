// Display available genres and allow user to choose
function displayGenres() {
    console.log("\nAvailable Genres:");
    genres.forEach((genre, index) => {
        console.log(`${index + 1}. ${genre.name}`);
    });
}

// Handle user input for genre selection
function selectGenre() {
    displayGenres();
    let choice = prompt("Select a genre by number (or type 'exit' to quit): ");
    
    if (choice.toLowerCase() === 'exit') {
        console.log("Goodbye!");
        return;
    }

    let selectedGenreIndex = parseInt(choice) - 1;

    if (selectedGenreIndex >= 0 && selectedGenreIndex < genres.length) {
        let selectedGenre = genres[selectedGenreIndex];
        selectedGenre.displayMovies();
        // Ask user if they want to select another genre or exit
        let continueChoice = prompt("\nWould you like to select another genre? (yes/no): ");
        if (continueChoice.toLowerCase() === 'yes') {
            selectGenre();
        } else {
            console.log("Goodbye!");
        }
    } else {
        console.log("Invalid selection, try again.");
        selectGenre();
    }
}
