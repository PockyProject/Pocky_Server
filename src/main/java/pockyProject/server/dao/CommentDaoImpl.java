package pockyProject.server.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pockyProject.server.domain.res.ResponseCommentSaveDTO;
import pockyProject.server.entity.feedEntity.CommentEntity;
import pockyProject.server.repository.feedRepo.CommentRepository;


@RequiredArgsConstructor
@Repository
public class CommentDaoImpl implements  CommentDAO {

    private final CommentRepository commentRepository;


    @Override
    public void saveComment(CommentEntity comment) {

        commentRepository.save(comment);
    }
}
