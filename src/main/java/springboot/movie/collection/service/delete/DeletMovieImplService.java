package springboot.movie.collection.service.delete;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import springboot.movie.collection.entity.MovieCollection;
import springboot.movie.collection.repository.MovieCollectionRepository;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DeletMovieImplService implements DeleteMovieService{
    MovieCollectionRepository movieCollectionRepository;
    @Override
    public void deleteMovieCollection(Long id) throws NoSuchElementException {
        Optional<MovieCollection> movieCollectionOptional = movieCollectionRepository.findById(id);
        if (movieCollectionOptional.isPresent()){
            movieCollectionRepository.deleteById(id);
        }else {
            throw new NoSuchElementException("Movie Collection tidak ditemukan");
        }
    }
}
