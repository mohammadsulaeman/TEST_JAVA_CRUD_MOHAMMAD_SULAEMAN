package springboot.movie.collection.service.search;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import springboot.movie.collection.entity.MovieCollection;
import springboot.movie.collection.repository.MovieCollectionRepository;

import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class SearchMovieImpService implements SearchMovieService{

    MovieCollectionRepository movieCollectionRepository;
    @Override
    public MovieCollection searchMovieByTitle(String title) throws NoSuchElementException {
        MovieCollection movieCollectionCek = movieCollectionRepository.findByTitle(title).orElseThrow(
                ()->new NoSuchElementException("Movie Collection "+title+"Tidak Ada Dalam List")
        );
        return movieCollectionCek;
    }
}
