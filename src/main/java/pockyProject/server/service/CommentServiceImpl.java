package pockyProject.server.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pockyProject.server.dao.CommentDAO;
import pockyProject.server.domain.req.RequestCommentDTO;
import pockyProject.server.domain.req.RequestFeedDTO;
import pockyProject.server.domain.res.ResponseCommentSaveDTO;
import pockyProject.server.entity.feedEntity.CommentEntity;
import pockyProject.server.entity.feedEntity.FeedEntity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<RequestCommentDTO> getCommentAll(String feedUid) {

        List<RequestCommentDTO> comments=commentDAO.commentAll(feedUid);

        return comments;
    }
}
