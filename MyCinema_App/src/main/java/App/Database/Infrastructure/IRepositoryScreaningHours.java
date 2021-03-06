package App.Database.Infrastructure;

import App.Database.Entities.ScreeningHours;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface IRepositoryScreaningHours extends MongoRepository<ScreeningHours, String> {

    Optional<ScreeningHours> findById(String id);

    ScreeningHours findByMovieId(String movieId);

}

