package pockyProject.server.repository.feedRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pockyProject.server.entity.feedEntity.FeedEntity;

@Repository
public interface FeedRepository extends JpaRepository<FeedEntity,String> {
}
