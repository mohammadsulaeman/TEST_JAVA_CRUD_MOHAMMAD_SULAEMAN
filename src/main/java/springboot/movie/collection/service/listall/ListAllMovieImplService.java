package springboot.movie.collection.service.listall;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import springboot.movie.collection.entity.MovieCollection;
import springboot.movie.collection.repository.MovieCollectionRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ListAllMovieImplService implements ListAllMovieService{

    MovieCollectionRepository movieCollectionRepository;

    @Override
    public List<MovieCollection> listMovieCollectionAll() {
        return (List<MovieCollection>) movieCollectionRepository.findAll();
    }
}
