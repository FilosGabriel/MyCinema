package App.Database.Infrastructure;

import App.Database.Entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface IRepositoryUser extends MongoRepository<User, String> {
    User findByFirstName(String firstName);

    List<User> findAllByLastName(String lastName);

    User findByEmail(String email);

    Optional<User> findById(String id);

    User findByUsername(String username);


}
