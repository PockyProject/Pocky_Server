package pockyProject.server.dao;


import org.springframework.stereotype.Repository;
import pockyProject.server.domain.req.RequestCommentDTO;
import pockyProject.server.entity.feedEntity.CommentEntity;
import java.util.List;
@Repository
public interface CommentDAO {

    void saveComment(CommentEntity comment);


    List<RequestCommentDTO> commentAll(String feedUid);
}