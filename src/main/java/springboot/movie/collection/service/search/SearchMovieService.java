package springboot.movie.collection.service.search;

import springboot.movie.collection.entity.MovieCollection;

public interface SearchMovieService {
    MovieCollection searchMovieByTitle(String title);
}
