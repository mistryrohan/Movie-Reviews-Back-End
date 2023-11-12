package dev.rohan.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

// Class to represent movies

@Document(collection = "movies")
@Data // Does all the getters and setters
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    private ObjectId id; // Treat as a unique identifier

    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference // Database stores only ids of reviews in a seperate collection
    private List<Review> reviewIds;

}
