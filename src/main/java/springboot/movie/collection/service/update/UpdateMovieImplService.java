package springboot.movie.collection.service.update;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import springboot.movie.collection.entity.MovieCollection;
import springboot.movie.collection.repository.MovieCollectionRepository;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UpdateMovieImplService implements UpdateMovieService{
    MovieCollectionRepository movieCollectionRepository;


    @Override
    public MovieCollection EmployeeById(Long id) {
        Optional<MovieCollection> movieCollectionOptional = movieCollectionRepository.findById(id);
        MovieCollection movieCollection;
        if (movieCollectionOptional.isPresent()){
            movieCollection = movieCollectionOptional.get();


        }else {
            throw new NoSuchElementException("Movie Collection "+id +"tidak ditemukan");
        }
        return movieCollection;
    }

    @Override
    public MovieCollection updateEmployee(MovieCollection movieCollection) {
        MovieCollection movieCollection1 = movieCollectionRepository.findById(movieCollection.getId()).orElseThrow(
                () -> new NoSuchElementException("data list dengan id "+movieCollection.getId()+" tidak ditemukan")
        );
        movieCollection1.setTitle(movieCollection.getTitle());
        movieCollection1.setDirector(movieCollection.getDirector());
        movieCollection1.setSummary(movieCollection.getSummary());
        movieCollection1.setGenres(movieCollection.getGenres());
        MovieCollection updateMovie = movieCollectionRepository.save(movieCollection1);
        return updateMovie;
    }
}
