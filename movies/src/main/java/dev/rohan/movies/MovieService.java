package dev.rohan.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//

@Service
public class MovieService {

    @Autowired // Instantiate this clas
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll(); // In the MongoRepository class
    }

    // May not be in the database so we use Optional
    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByimdbId(imdbId);
    }
}
