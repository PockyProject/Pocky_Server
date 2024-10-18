package pockyProject.server.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pockyProject.server.dao.CommentDAO;
import pockyProject.server.domain.res.ResponseCommentSaveDTO;
import pockyProject.server.entity.feedEntity.CommentEntity;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentDAO commentDAO;

    @Override
    public void addComment(ResponseCommentSaveDTO comment) {
        CommentEntity commentEntity=new CommentEntity();
        commentEntity=commentEntity.DTOtoCommentEntity(comment);
        commentDAO.saveComment(commentEntity);
    }
}
