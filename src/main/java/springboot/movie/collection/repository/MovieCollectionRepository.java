package springboot.movie.collection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.movie.collection.entity.MovieCollection;

import java.util.Optional;

public interface MovieCollectionRepository extends JpaRepository<MovieCollection,Long> {
    Optional<MovieCollection> findByTitle(String title);
}
