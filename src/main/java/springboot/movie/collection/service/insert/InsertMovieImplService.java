package springboot.movie.collection.service.insert;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import springboot.movie.collection.entity.MovieCollection;
import springboot.movie.collection.repository.MovieCollectionRepository;


@Service
@AllArgsConstructor
public class InsertMovieImplService implements InsertMovieService{
    MovieCollectionRepository movieCollectionRepository;
    @Override
    public MovieCollection saveMovieCollection(MovieCollection movieCollection)  {
        MovieCollection saveMovie = movieCollectionRepository.save(movieCollection);
        return saveMovie;
    }
}
