package pockyProject.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pockyProject.server.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {



}
