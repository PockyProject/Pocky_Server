package pockyProject.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pockyProject.server.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}
