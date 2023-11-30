package dev.chechoreyes.movies;

import java.util.List;
import java.util.Optional;

// import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    // Get Method
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    // SEARCH BY MONGODB ID
    // @GetMapping("/{id}")
    // public ResponseEntity<Optional<Movie>> getSinglemovie(@PathVariable ObjectId id) {
    //     return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(id), HttpStatus.OK);
    // }

    // SEARCH BY IMDB ID
    @GetMapping("/{imdbid}")
    public ResponseEntity<Optional<Movie>> getSinglemovie(@PathVariable String imbdid) {
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imbdid), HttpStatus.OK);
    }

}