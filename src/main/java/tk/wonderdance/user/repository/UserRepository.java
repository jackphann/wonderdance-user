package tk.wonderdance.user.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import tk.wonderdance.user.model.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long>, JpaSpecificationExecutor {
    Optional<User> findUserById(long id);

    Boolean existsByIdOrEmail(Long id, String email);
}
