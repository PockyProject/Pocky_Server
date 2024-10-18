package pockyProject.server.dao;

import org.springframework.stereotype.Repository;
import pockyProject.server.domain.res.ResponseCommentSaveDTO;
import pockyProject.server.entity.feedEntity.CommentEntity;

@Repository
public interface CommentDAO {

    void saveComment(CommentEntity comment);
}
