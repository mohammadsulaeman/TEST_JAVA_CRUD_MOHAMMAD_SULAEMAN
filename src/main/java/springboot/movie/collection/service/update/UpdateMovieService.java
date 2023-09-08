package springboot.movie.collection.service.update;

import springboot.movie.collection.entity.MovieCollection;

public interface UpdateMovieService {
    MovieCollection EmployeeById(Long id);

    MovieCollection updateEmployee(MovieCollection movieCollection);
}
