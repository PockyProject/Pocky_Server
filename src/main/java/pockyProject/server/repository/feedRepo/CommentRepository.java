package pockyProject.server.repository.feedRepo;

import org.springframework.data.repository.CrudRepository;
import pockyProject.server.entity.feedEntity.CommentEntity;

public interface CommentRepository  extends CrudRepository<CommentEntity, String> {
}
