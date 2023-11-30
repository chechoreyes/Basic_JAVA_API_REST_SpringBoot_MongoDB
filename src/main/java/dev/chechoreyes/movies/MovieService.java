package dev.chechoreyes.movies;

import java.util.List;
import java.util.Optional;

// import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    // SEARCH BY MONGODB ID
    // public Optional<Movie> singleMovie(ObjectId id) {
    // return movieRepository.findById(id);
    // }

    // SEARCH BY IMDB ID
    public Optional<Movie> singleMovie(String imbdId) {
        return movieRepository.findMovieByImbd(imbdId);
    }
}
