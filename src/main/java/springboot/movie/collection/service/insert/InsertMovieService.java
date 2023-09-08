package springboot.movie.collection.service.insert;

import springboot.movie.collection.entity.MovieCollection;

public interface InsertMovieService {
    MovieCollection saveMovieCollection(MovieCollection movieCollection);
}
