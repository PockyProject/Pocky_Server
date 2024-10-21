package pockyProject.server.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pockyProject.server.domain.req.RequestCommentDTO;
import pockyProject.server.entity.feedEntity.CommentEntity;
import pockyProject.server.repository.feedRepo.CommentRepository;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class CommentDaoImpl implements  CommentDAO {

    private final CommentRepository commentRepository;


    @Override
    public void saveComment(CommentEntity comment) {

        commentRepository.save(comment);
    }

    @Override
    public List<RequestCommentDTO> commentAll(String feedUid) {
        return commentRepository.FeedUidOrderBycreatedatAsc(feedUid);
    }
}
