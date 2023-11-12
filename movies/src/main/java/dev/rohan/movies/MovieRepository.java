package dev.rohan.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// To work with MongoDB
// Repositories are of type Interface

@Repository // Decorator is a class, click on it
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    // Automatic queries lets you form queries dynamically from property names
    // It already knows how to do the function automatically
    Optional<Movie> findMovieByimdbId(String imdbId);

}
